package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mCarga extends Conexion {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////  TABLA "CATEDRATICO"  //////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //BUSCAR CUANTAS HORAS TIENE ASIGNADA EL DOCENTE Y CUANTAS HORAS TIENE YA OCUPADA SI ES QUE LAS TIENE
    public boolean buscarhoraCatedratico(oCarga c, String ciclo) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT "+ciclo+" FROM catedratico WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getCatedraticoCodigo());
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setCatedraticoLibres(Integer.parseInt(rs.getString(ciclo)));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //ACTUALIZAR LA CANTIDAD DADAS DE CLASE PARA NO COMETER ERROR DE ASIGNAR MÁS CARGA DE LA QUE TIENE ATRIBUIDA
    public boolean asignarCatedraticoHora(oCarga c, String ciclo) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE catedratico SET "+ciclo+"=? WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCatedraticoLibres());
            ps.setString(2, c.getCatedraticoCodigo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////  TABLA "TIEMPO_CATEDRÁTICO"  /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //TRAER EL CÓDIGO DEL CATEDRÁTICO SEGÚN LA JORNADA DEL AULA EN LA OPCIÓN AGREGAR
    public boolean buscarCodCatedratico(oCarga tc) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Id, Codigo FROM tiempocatedratico WHERE Jornada=? AND Paridad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tc.getTiempocatedraticoJornada());
            ps.setString(2, tc.getTiempocatedraticoParidad());
            rs = ps.executeQuery();
            if (rs.next()) {
                tc.setTiempocatedraticoId(rs.getInt("Id"));
                tc.setTiempocatedraticoCodigo((rs.getString("Codigo")));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //INSERTAR LOS CAMPOS CUANDO SE AGREGA UNA MATERIA A POR DOCENTE
    public boolean insertarJornadaCatedratico(oCarga tc) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO tiempocatedratico (Codigo, Jornada, Aula, Paridad) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tc.getTiempocatedraticoCodigo());
            ps.setString(2, tc.getTiempocatedraticoJornada());
            ps.setString(3, tc.getTiempocatedraticoAula());
            ps.setString(4, tc.getTiempocatedraticoParidad());
            ps.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //TRAER EL CÓDIGO Y ID DEL CATEDRÁTICO SEGÚN LA JORNADA DEL AULA EN LA OPCIÓN ELIMINAR
    public boolean buscarCodCatedraticoEliminar(oCarga tc) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Id, Codigo FROM tiempocatedratico WHERE Aula=? AND Jornada=? AND Paridad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tc.getTiempocatedraticoAula());
            ps.setString(2, tc.getTiempocatedraticoJornada());
            ps.setString(3, tc.getTiempocatedraticoParidad());
            rs = ps.executeQuery();
            if (rs.next()) {
                tc.setTiempocatedraticoId(rs.getInt("Id"));
                tc.setTiempocatedraticoCodigo((rs.getString("Codigo")));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }    
    
    //ELIMINAR LOS DATOS DEL CATEDRÁTICO QUE OCUPABA EL VALOR ANTERIOR
    public boolean eliminarCatedraticoTC(oCarga tc) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM tiempocatedratico WHERE Id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tc.getTiempocatedraticoId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////TABLA "MATERIA"////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
      

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////// TABLA "MATERIA_GRUPO "  ////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //TRAER LOS GRUPOS SEGÚN MATERIA DEL CMB EN EL FORMULARIO CARGA
    public List listargruposMateria(String codmg) {
        List<oCarga> c = new ArrayList<>();
        String sql = "SELECT Grupo FROM materiagrupo WHERE Codigo='" + codmg + "' AND Asignadas<5";
        try {            
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);            
            rs = ps.executeQuery();
            while (rs.next()) {
                oCarga cm = new oCarga();
                cm.setMGGrupo(rs.getString("Grupo"));
                c.add(cm);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return c;
    }

    //TRAER LA CANTIDAD DE HORAS ASIGNADAS
    public boolean buscarAsignadasMG(oCarga mg) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Id, Asignadas FROM materiagrupo WHERE Codigo=? AND Grupo=? AND Paridad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mg.getMGCodigo());
            ps.setString(2, mg.getMGGrupo());
            ps.setString(3, mg.getMGParidad());
            rs = ps.executeQuery();
            if (rs.next()) {
                mg.setMGId(rs.getInt("Id"));
                mg.setMGAsignadas(rs.getInt("Asignadas"));
                return true;
            }

            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //ACTUALIZAR LA CANTIDAD DE HORAS ASIGNADAS
    public boolean actualizarAsignadasMG(oCarga mg) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE materiagrupo SET Asignadas=? WHERE Id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mg.getMGAsignadas());
            ps.setInt(2, mg.getMGId());            
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////// TABLA "TIEMPO_MATERIA" //////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   //TRAER EL CODIGO
    public boolean buscarCodigoTM(oCarga tm) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Codigo FROM tiempomateria WHERE Jornada=? AND Paridad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm.getTMJornada());
            ps.setString(2, tm.getTMParidad());
            rs = ps.executeQuery();
            if (rs.next()) {
                tm.setTMCodigo(rs.getString("Codigo"));             
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    //COMPARAR SI LA MATERIA A INGRESAR YA ESTA ASIGNADA EN LA MISMA JORNADA
    public boolean buscarCodigoxcodTM(oCarga tm) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Codigo FROM tiempomateria WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm.getTMCodigo());
            rs = ps.executeQuery();
            if (rs.next()) {
                tm.setTMCodigow(rs.getString("Codigo"));             
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    //PARA VER SI EL GRUPO DE LA MATERIA A INGRESAR YA ESTA EN LA JORNADA
    public boolean buscarGrupoTM(oCarga tm) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Grupo FROM tiempomateria WHERE Codigo=? AND Jornada=? AND Grupo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm.getTMCodigow());
            ps.setString(2, tm.getTMJornada());
            ps.setString(3, tm.getTMGrupow());
            rs = ps.executeQuery();
            if (rs.next()) {
                tm.setTMGrupo(rs.getString("Grupo"));             
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    //PARA VERIFICAR QUE EL AÑO Y LA CARRERA NO SEAN IGUAL, PARA EVITAR CHOQUES
    public boolean buscarCarreraAnioTM(oCarga tm) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Codigo FROM tiempomateria WHERE Carrera=? AND Anio=? AND Paridad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm.getTMCarrera());
            ps.setString(2, tm.getTMAnio());       
            ps.setString(3, tm.getTMParidad());
            rs = ps.executeQuery();
            if (rs.next()) {
                tm.setTMCodigo(rs.getString("Codigo"));             
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
           
    //INSERTAR NOMBRE/JORNADA/AULA EN LA TABLA tiempo_materia
    public boolean insertTM(oCarga tm) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO tiempomateria (Codigo, Grupo, Jornada, Aula, Paridad, Carrera, Anio) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm.getTMCodigo());
            ps.setString(2, tm.getTMGrupo());
            ps.setString(3, tm.getTMJornada());
            ps.setString(4, tm.getTMAula());
            ps.setString(5, tm.getTMParidad());
            ps.setString(6, tm.getTMCarrera());
            ps.setString(7, tm.getTMAnio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //TRAER EL CÓDIGO, ID Y GRUPO DE LA MATERIA SEGÚN LA JORNADA Y EL AULA OPCIÓN ELIMINAR
    public boolean buscarCodMateriaEliminar(oCarga tm) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Id, Codigo, Grupo FROM tiempomateria WHERE Aula=? AND Jornada=? AND Paridad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm.getTMAula());
            ps.setString(2, tm.getTMJornada());
            ps.setString(3, tm.getTMParidad());
            rs = ps.executeQuery();
            if (rs.next()) {
                tm.setTMId(rs.getInt("Id"));
                tm.setTMCodigo((rs.getString("Codigo")));
                tm.setTMGrupo(rs.getString("Grupo"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    //ELIMINAR LOS DATOS DEL CATEDRÁTICO QUE OCUPABA EL VALOR ANTERIOR
    public boolean eliminarMateriaTM(oCarga tm) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM tiempomateria WHERE Id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tm.getTMId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////// TABLA "AULA(X)" ///////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //INSERTAR LOS DATOS CON LOS CAMPOS SEGÚN LA MATERIA EN LA AULA
    public boolean tablax(oCarga mocarga, String aula, String dia, String cadena, String jornada) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE " + aula + " SET " + dia + " = " + cadena + " WHERE Hora = '" + jornada + "' ";
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
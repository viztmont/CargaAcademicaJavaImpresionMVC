package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mDistribucion extends Conexion {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public int aulas(String paridad) throws SQLException {
        String sql = "SELECT COUNT(*) FROM aula WHERE Paridad = '" + paridad + "'";
        int n =0;
        con = conectar.getConexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();        
        oDistribucion dist = new oDistribucion();
        if (rs.next()) {            
            n=rs.getInt(1);            
        }
        dist.setAulas(n);
        ps.close();
        con.close();
        return n;
    }   

    public List llenarcmbDistribucion_Aula(String cantidad, String paridad) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = " SELECT Codigo FROM aula WHERE Tamano = '" + cantidad + "' AND Paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setAulaCodigo(rs.getString("Codigo"));
                datos.add(dist);
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
        return datos;
    }

    public List llenarParametrocmbAula(String paridad) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = " SELECT Codigo FROM aula WHERE Paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setAulaCodigo(rs.getString("Codigo"));
                datos.add(dist);
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
        return datos;
    }

    public List llenarcmbDistribucion_Carrera() {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = "SELECT Nombre FROM carrera ORDER BY Nombre ASC";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setCarreraNombre(rs.getString("nombre"));
                datos.add(dist);
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
        return datos;
    }

    public List llenarcmbCarga_Catedratico(String ciclo) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = " SELECT * FROM catedratico WHERE " + ciclo + ">0";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setCatedraticoCodigo(rs.getString("Codigo"));
                dist.setCatedraticoNombres(rs.getString("Nombres"));
                dist.setCatedraticoApellidos(rs.getString("Apellidos"));
                datos.add(dist);
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
        return datos;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////// TABLA "MATERIA"  /////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List llenarcmbCarga_Anio(String anio, String paridad) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = " SELECT * FROM (materia, materiagrupo) WHERE materia.Codigo=materiagrupo.Codigo "
                + "AND materia.Anio= '" + anio + "' AND materia.paridad = '" + paridad + "' AND materiagrupo.Asignadas<5";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setMateriaCodigo(rs.getString("Codigo"));
                dist.setMateriaNombre(rs.getString("Nombre"));
                dist.setMateriaCarrera(rs.getString("Carrera"));
                dist.setMateriaAnio(rs.getString("Anio"));
                dist.setMGGrupo(rs.getString("Grupo"));
                datos.add(dist);
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
        return datos;
    }

    public List llenarcmbCarga_Carrera(String carrera, String paridad) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = " SELECT * FROM (materia, materiagrupo) WHERE materia.Codigo=materiagrupo.Codigo "
                + "AND materia.Carrera= '" + carrera + "' AND materia.paridad = '" + paridad + "' AND materiagrupo.Asignadas<5";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setMateriaCodigo(rs.getString("Codigo"));
                dist.setMateriaNombre(rs.getString("Nombre"));
                dist.setMateriaCarrera(rs.getString("Carrera"));
                dist.setMateriaAnio(rs.getString("Anio"));
                dist.setMGGrupo(rs.getString("Grupo"));
                datos.add(dist);
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
        return datos;
    }

    public List llenarcmbCarga_CarreraAnio(String carrera, String anio, String paridad) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = "SELECT * FROM (materia, materiagrupo) WHERE materia.Codigo=materiagrupo.Codigo "
                + "AND materia.Carrera='" + carrera + "' AND materia.Anio='" + anio + "' "
                + "AND materia.paridad='" + paridad + "' AND materiagrupo.Asignadas<5";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setMateriaCodigo(rs.getString("Codigo"));
                dist.setMateriaNombre(rs.getString("Nombre"));
                dist.setMateriaCarrera(rs.getString("Carrera"));
                dist.setMateriaAnio(rs.getString("Anio"));
                dist.setMGGrupo(rs.getString("Grupo"));
                datos.add(dist);
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
        return datos;
    }

    public List llenarcmbCarga_Materias(String paridad) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = " SELECT * FROM (materia, materiagrupo) WHERE materia.Codigo=materiagrupo.Codigo AND "
                + "materia.paridad = '" + paridad + "' AND materiagrupo.Asignadas<5";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion dist = new oDistribucion();
                dist.setMateriaCodigo(rs.getString("Codigo"));
                dist.setMateriaNombre(rs.getString("Nombre"));
                dist.setMateriaCarrera(rs.getString("Carrera"));
                dist.setMateriaAnio(rs.getString("Anio"));
                dist.setMGGrupo(rs.getString("Grupo"));
                datos.add(dist);
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
        return datos;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////// TABLA "AULA(X)"  /////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List listarTablaCarga(String aula) {
        List<oDistribucion> datos = new ArrayList<>();
        String sql = "SELECT * FROM " + aula + "";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oDistribucion da = new oDistribucion();
                da.setaHora(rs.getString("Hora"));
                da.setaLunes(rs.getString("Lunes"));
                da.setaMartes(rs.getString("Martes"));
                da.setaMiercoles(rs.getString("Miercoles"));
                da.setaJueves(rs.getString("Jueves"));
                da.setaViernes(rs.getString("Viernes"));
                datos.add(da);
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
        return datos;
    }

    public boolean modificarDisponibilidadAula(oDistribucion d, String aula) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE " + aula + " SET Lunes=?, Martes=?, Miercoles=?, Jueves=?, Viernes=? WHERE Hora=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, d.getaLunes());
            ps.setString(2, d.getaMartes());
            ps.setString(3, d.getaMiercoles());
            ps.setString(4, d.getaJueves());
            ps.setString(5, d.getaViernes());
            ps.setString(6, d.getaHora());
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///metodos limpieza 
    public boolean limpiarAulas(String aula) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE " + aula + " SET Lunes='', Martes='', Miercoles='', Jueves='', Viernes=''";
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
    
    public boolean limpiarAsignadasMG(String paridad) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE materiagrupo SET Asignadas=0 WHERE Paridad='" + paridad + "'";
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
    
    public boolean limpiarRegistroC(String ciclo) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE catedratico SET "+ciclo+"=0";
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
    
    public boolean eliminarRegistroTC(String paridad) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM tiempocatedratico WHERE Paridad='" + paridad + "'";
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
    
    public boolean eliminarRegistroTM(String paridad) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM tiempomateria WHERE Paridad='" + paridad + "'";
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

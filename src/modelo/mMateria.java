package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mMateria extends Conexion {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////// TABLA "MATERIA"///////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //mostrar los campos seleccionados de la taba materia en el modulo de materia
    public List listar(String paridad) {
        List<oMateria> materiadatos = new ArrayList<>();        
        String sql = "select * from materia where paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);            
            rs = ps.executeQuery();
            while (rs.next()) {
                oMateria materia = new oMateria();
                materia.setCodigo(rs.getString("Codigo"));
                materia.setNombre(rs.getString("Nombre"));
                materia.setCarrera(rs.getString("Carrera"));
                materia.setAnio(rs.getString("Anio"));
                materia.setGrupos(rs.getInt("Grupos"));
                materiadatos.add(materia);
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
        return materiadatos;
    }

    //para que se muestren las materias segun el nombre elegido en el modulo materia de la tabla materia
    public List filtrarNombre(String nombre, String paridad) {
        List<oMateria> datos = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE (Nombre LIKE '%" + nombre + "%') AND paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oMateria m = new oMateria();
                m.setCodigo(rs.getString("Codigo"));
                m.setNombre(rs.getString("Nombre"));
                m.setCarrera(rs.getString("Carrera"));
                m.setAnio(rs.getString("Anio"));
                m.setGrupos(rs.getInt("Grupos"));
                datos.add(m);
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

    //para que se muestren las materias segun la carrera elegida en el modulo materia de la tabla materia
    public List filtrarCarrera(String carrera, String paridad) {
        List<oMateria> datos = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE (Carrera LIKE '%" + carrera + "%') AND paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oMateria m = new oMateria();
                m.setCodigo(rs.getString("Codigo"));
                m.setNombre(rs.getString("Nombre"));
                m.setCarrera(rs.getString("Carrera"));
                m.setAnio(rs.getString("Anio"));
                m.setGrupos(rs.getInt("Grupos"));
                datos.add(m);
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

    //para que se muestren las materias segun el año elegido en el modulo materia de la tabla materia
    public List filtrarAnio(String anio, String paridad) {
        List<oMateria> datos = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE (Anio LIKE '%" + anio + "%') AND paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                oMateria m = new oMateria();
                m.setCodigo(rs.getString("Codigo"));
                m.setNombre(rs.getString("Nombre"));
                m.setCarrera(rs.getString("Carrera"));
                m.setAnio(rs.getString("Anio"));
                m.setGrupos(rs.getInt("Grupos"));
                datos.add(m);
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

    //ingresar una materia con sus datos en la tabla materia
    public boolean registrar(oMateria m) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO materia (Codigo, Nombre, Carrera, Anio, Grupos, Paridad) VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getCodigo());
            ps.setString(2, m.getNombre());
            ps.setString(3, m.getCarrera());
            ps.setString(4, m.getAnio());
            ps.setInt(5, m.getGrupos());            
            ps.setString(6, m.getParidad());
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

    //modificar los campos de una materia de la tabla materia
    public boolean modificarM(oMateria m) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE materia SET Nombre=?, Carrera=?, Anio=?, Grupos=? WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre());
            ps.setString(2, m.getCarrera());
            ps.setString(3, m.getAnio());
            ps.setInt(4, m.getGrupos());
            ps.setString(5, m.getCodigo());
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

    //eliminar una materia de la tabla materia con todos sus campos
    public boolean eliminar(oMateria m) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM materia WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getCodigo());
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
/////////////////////////////////////////////////// TABLA "MATERIA_GRUPO"  //////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //ingresar los grupos a la materia en la tabla materiagrupo
    public boolean insertarGruposxMateria(oMateria m) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO materiagrupo (Codigo, Grupo, Asignadas, Paridad) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getMgCodigo());
            ps.setString(2, m.getMgGrupo());
            ps.setInt(3, m.getMgAsignadas());
            ps.setString(4, m.getParidad());
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

    //elminar los grupos de x materia de la tabla materiagrupo
    public boolean eliminarGruposxMateria(oMateria m) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM materiagrupo WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getMgCodigo());
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
/////////////////////////////////////////////////////// TABLA "CICLOS"  /////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

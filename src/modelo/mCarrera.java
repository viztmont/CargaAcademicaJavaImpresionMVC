package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mCarrera extends Conexion {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String carreraCodigo;        
    public String getCarreraCodigo() {return carreraCodigo;}
    public void setCarreraCodigo(String carreraCodigo) {this.carreraCodigo = carreraCodigo;}
    //
    private String carreraNombre;
    public String getCarreraNombre() {return carreraNombre;}
    public void setCarreraNombre(String carreraNombre) {this.carreraNombre = carreraNombre;}
    //
    private String carreraDescripcion;
    public String getCarreraDescripcion() {return carreraDescripcion;}
    public void setCarreraDescripcion(String carreraDescripcion) {this.carreraDescripcion = carreraDescripcion;}
    //
    private String carreraNombreNuevo;
    public String getCarreraNombreNuevo() {return carreraNombreNuevo;}
    public void setCarreraNombreNuevo(String carreraNombreNuevo) {this.carreraNombreNuevo = carreraNombreNuevo;}    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////TABLA "CARRERA"///////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List listarCarrera() {
        List<mCarrera> datos = new ArrayList<>();
        String sql = "select * from carrera";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mCarrera c = new mCarrera();
                c.setCarreraCodigo(rs.getString("Codigo"));
                c.setCarreraNombre(rs.getString("Nombre"));
                c.setCarreraDescripcion(rs.getString("Descripcion"));
                datos.add(c);
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
    
    public boolean registrarCarrera(mCarrera c) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO carrera (Codigo, Nombre, Descripcion) VALUES (?,?,?)";
        try {            
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getCarreraCodigo());
            ps.setString(2, c.getCarreraNombre());
            ps.setString(3, c.getCarreraDescripcion());
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
    
    public boolean modificarCarrera(mCarrera c) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE carrera SET Nombre=?, Descripcion=? WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);            
            ps.setString(1, c.getCarreraNombre());
            ps.setString(2, c.getCarreraDescripcion());
            ps.setString(3, c.getCarreraCodigo());
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
    
    public boolean eliminarCarrera(mCarrera a) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM carrera WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getCarreraCodigo());
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
///////////////////////////////////////////////////////////TABLA "MATERIA"///////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

     public boolean modificarMateriaCarrera(mCarrera c) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE materia SET Carrera=? WHERE Carrera=?";
        try {
            ps = con.prepareStatement(sql);            
            ps.setString(1, c.getCarreraNombreNuevo());
            ps.setString(2, c.getCarreraNombre());
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
     public boolean eliminarMateriaCarrera(mCarrera a) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM materia WHERE Carrera=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getCarreraNombre());
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

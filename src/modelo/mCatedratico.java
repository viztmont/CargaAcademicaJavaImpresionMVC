package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mCatedratico extends Conexion {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String Codigo;          
    public String getCodigo() {return Codigo;}
    public void setCodigo(String Codigo) {this.Codigo = Codigo;}

    private String Nombres;
    public String getNombres() {return Nombres;}
    public void setNombres(String Nombres) {this.Nombres = Nombres;}

    private String Apellidos;
    public String getApellidos() {return Apellidos;}
    public void setApellidos(String Apellidos) {this.Apellidos = Apellidos;}

    private int Primero;
    public int getPrimero() {return Primero;}
    public void setPrimero(int Primero) {this.Primero = Primero;}

    private int Segundo; 
    public int getSegundo() {return Segundo;}
    public void setSegundo(int Segundo) {this.Segundo = Segundo;}            
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////TABLA "CATEDRATICO"/////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public List listarCatedratico() {
        List<mCatedratico> datos = new ArrayList<>();
        String sql = "select * from catedratico";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mCatedratico c = new mCatedratico();                
                c.setCodigo(rs.getString("Codigo"));
                c.setNombres(rs.getString("Nombres"));
                c.setApellidos(rs.getString("Apellidos"));
                c.setPrimero(rs.getInt("LibresI"));
                c.setSegundo(rs.getInt("LibresII"));
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
    
    public boolean registrarCatedratico(mCatedratico c) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO catedratico (Codigo, Nombres, Apellidos, libresI, LibresII) VALUES (?,?,?,?,?)";
        try {            
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getNombres());
            ps.setString(3, c.getApellidos());
            ps.setInt(4, c.getPrimero());
            ps.setInt(5, c.getSegundo());
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
    
    public boolean modificarCatedratico(mCatedratico c, String ciclo, int horas) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE catedratico SET Nombres=?, Apellidos=?, "+ciclo+"="+horas+" WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);            
            ps.setString(1, c.getNombres());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getCodigo());
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
    
    public boolean eliminarCatedratico(mCatedratico c) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM catedratico WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getCodigo());
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

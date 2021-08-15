package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mUsuarios extends Conexion {
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String usuario;
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}
    
    private String user;
    public String getUser() {return user;}
    public void setUser(String user) {this.user = user;}

    private String contrasena;
    public String getContrasena() {return contrasena;}
    public void setContrasena(String contrasena) {this.contrasena = contrasena;}
    
    private String tipo;
    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}    
    
    private String nomp;
    public String getNomp() {return nomp;}
    public void setNomp(String nomp) {this.nomp = nomp;}    
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean buscar(mUsuarios u) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT usuario, contrasena FROM usuarios WHERE usuario=? AND contrasena=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getContrasena());
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setUsuario(rs.getString("usuario"));
                u.setContrasena(rs.getString("contrasena"));
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
    public List listarUsuarios() {
        List<mUsuarios> datos = new ArrayList<>();
        String sql = "SELECT usuario FROM usuarios WHERE Tipo='normal'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mUsuarios u = new mUsuarios();
                u.setUsuario(rs.getString("usuario"));
                datos.add(u);
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
    
     public boolean buscarUsuario(mUsuarios u) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT usuario FROM usuarios WHERE usuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setUsuario(rs.getString("usuario"));
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
    
    public boolean registrarUsuario(mUsuarios u) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO usuarios (usuario, contrasena, Tipo) VALUES (?,?,?)";
        try {            
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getContrasena());
            ps.setString(3, u.getTipo());            
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
    
    public boolean modificarUsuario(mUsuarios u) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE usuarios SET usuario=?, contrasena=? WHERE usuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getContrasena());
            ps.setString(3, u.getUser());
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
    
    public boolean eliminarUsuario(mUsuarios u) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM usuarios WHERE usuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
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
    public boolean buscarCiclo(mUsuarios u) {
        ps = null;
        rs = null;
        con = getConexion();
        String sql = "SELECT Nombre FROM parametros";
        try {
            ps = con.prepareStatement(sql);            
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setNomp(rs.getString("Nombre"));                
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
    
    
    public boolean cambioCiclo(mUsuarios u) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE parametros SET nombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getNomp());                        
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

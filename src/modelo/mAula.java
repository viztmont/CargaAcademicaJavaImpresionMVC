package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mAula extends Conexion {    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    private int Id;            
    public int getId() {return Id;}
    public void setId(int Id) {this.Id = Id;}
    //
    private String Codigo;
    public String getCodigo() {return Codigo;}
    public void setCodigo(String Codigo) {this.Codigo = Codigo;}
    //
    private String Nombre;
    public String getNombre() {return Nombre;}
    public void setNombre(String Nombre) {this.Nombre = Nombre;}
    //
    private String Tamano;
    public String getTamano() {return Tamano;}
    public void setTamano(String Tamano) {this.Tamano = Tamano;}
    
    private String Paridad;
    public String getParidad() {return Paridad;}
    public void setParidad(String Paridad) {this.Paridad = Paridad;}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////// TABLA "AULA"///////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public List listarAula(String paridad) {
        List<mAula> datos = new ArrayList<>();
        String sql = "select * from aula where paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mAula a = new mAula();
                a.setCodigo(rs.getString("Codigo"));
                a.setNombre(rs.getString("Nombre"));
                a.setTamano(rs.getString("Tamano"));
                datos.add(a);
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
    
    public List llenarcmbAula(String paridad) {
        List<mAula> datos = new ArrayList<>();
        String sql = " SELECT Codigo FROM aula WHERE paridad = '" + paridad + "'";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mAula a = new mAula();
                a.setCodigo(rs.getString("Codigo"));
                datos.add(a);
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
    
    public boolean registrarAula(mAula a) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO aula (Codigo, Nombre, Tamano, Paridad) VALUES (?,?,?,?)";
        try {            
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getCodigo());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getTamano());
            ps.setString(4, a.getParidad());
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
    
    public boolean modificar(mAula a) {
        ps = null;
        con = getConexion();
        String sql = "UPDATE aula SET Nombre=?, Tamano=? WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getTamano());
            ps.setString(3, a.getCodigo());
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
    
    public boolean eliminar(mAula a) {
        ps = null;
        con = getConexion();
        String sql = "DELETE FROM aula WHERE Codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getCodigo());
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
////////////////////////////////////////////////////// TABLA "AULA MATRIZ"////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //CREAR LA TABLA DE LA AULA CON FORMATO MATRIZ
    public boolean crearTAX(String aulax) {
        ps = null;
        con = getConexion();
        String sql = "CREATE TABLE " + aulax + " (Hora varchar(11) NOT NULL, Lunes varchar(200) NOT NULL, "
                + "Martes varchar(200) NOT NULL, Miercoles varchar(200) NOT NULL, Jueves varchar(200) NOT NULL, "
                + "Viernes varchar(200) NOT NULL, PRIMARY KEY (Hora)) ENGINE=InnoDB DEFAULT CHARSET=latin1;";
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

    //LLENAR LA TABLA DE LA AULA CON FORMATO MATRIZ
    public boolean registrarTAX(String aulax) {
        ps = null;
        con = getConexion();
        String sql = "INSERT INTO " + aulax + " (Hora, Lunes, Martes, Miercoles, Jueves, Viernes) VALUES"
                + "('06:45-07:35', '', '', '', '', ''),"
                + "('07:35-08:25', '', '', '', '', ''),"
                + "('08:25-09:15', '', '', '', '', ''),"
                + "('09:15-10:05', '', '', '', '', ''),"
                + "('10:05-10:55', '', '', '', '', ''),"
                + "('10:55-11:45', '', '', '', '', ''),"
                + "('11:45-12:35', '', '', '', '', ''),"
                + "('13:00-13:50', '', '', '', '', ''),"
                + "('13:50-14:40', '', '', '', '', ''),"
                + "('14:40-15:30', '', '', '', '', ''),"
                + "('15:30-16:20', '', '', '', '', ''),"
                + "('16:20-17:10', '', '', '', '', ''),"
                + "('17:10-18:00', '', '', '', '', ''),"
                + "('18:00-18:50', '', '', '', '', ''),"
                + "('18:50-19:40', '', '', '', '', ''),"
                + "('19:40-20:30', '', '', '', '', '');";
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

    //ELIMINAR LA TABLA DE LA AULA CON FORMATO MATRIZ
    public boolean eliminarTAX(String aulax) {
        ps = null;
        con = getConexion();
        String sql = "DROP TABLE " + aulax + " ";
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

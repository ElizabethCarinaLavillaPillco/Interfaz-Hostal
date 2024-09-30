package Conexiones;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    Connection ccn = null;
    Statement st = null;
    
    public Conexion(){
        try{
            String rutaFile = "C:\\interfazHostalIntento\\BDHostal.accdb";
            String Url = "jdbc:ucanaccess://"+rutaFile;
            ccn = DriverManager.getConnection(Url);
            st = ccn.createStatement();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "CONEXION ERRONEA"+e);
        }
    }
    
    public Connection getConnection(){
        System.out.println("Conexcion exitosa!!!! ");
        return ccn;
    }
    
    public void Desconexion(){
        try{
            ccn.close();
            System.exit(0);
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    //cerrar la conexion
    public boolean closeConecction(){
        try {
            if (ccn != null && !ccn.isClosed()) {
                ccn.close();
                return true;
            }
        } catch (SQLException sqle) {
            System.err.println("Error al cerrar la conexión: " + sqle.getMessage());
        }
        return false;
    }
}


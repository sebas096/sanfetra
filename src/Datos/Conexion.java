/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jamadev
 */
public class Conexion {
    
      private static java.sql.Connection conexion;
     public static java.sql.Connection getConexion() {

        if (conexion == null) {                      //Si la conexion no existe ,crea una nueva
            String driver = "com.mysql.jdbc.Driver";//Drive MySQL
            String url = "jdbc:mysql://localhost:3306/sanfetra";//direccion del host,variable
            String user = "root";
            String password = "";            
            try {
                Class.forName(driver);
                conexion = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }                
        }
        return conexion;
    }

    public static void CerrarConexion() {
        if(conexion!=null){ //Si existe una conexion ,la finaliza
            try {            
                conexion.close();
                conexion = null;
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


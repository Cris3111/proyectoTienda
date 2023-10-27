/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class conexion {
     public conexion(){
    }
    private static Connection conexion;
    private static conexion instancia;
    
    private static final String URL = "jdbc:mysql://localhost/tienda";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public Connection conectar(){
        try{ 
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(URL,USERNAME,PASSWORD);
       //JOptionPane.showMessageDialog(null,"Conexion exitosa!!");
        return conexion;
            }catch(Exception e){
            JOptionPane.showMessageDialog(null," Error : " +e);
    }
       return conexion;
    }
    public void cerrarConexion()throws SQLException{
    try{
        conexion.close();
      //  JOptionPane.showMessageDialog(null,"Se desconecto de la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null," Error : " +e);
            conexion.close();
        } finally {
            conexion.close();
        }
    }
    public static conexion getInstance(){
        if(instancia == null) { 
            instancia = new conexion();
        }
        return instancia;
    }
}

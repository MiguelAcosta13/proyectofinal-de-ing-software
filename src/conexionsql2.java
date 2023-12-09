/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionsql2 {
    Connection cn;
    
    public Connection conectar(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            cn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            System.out.println("CONECTADO");
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
 }
        return cn;
    }
    
    
    
    
    
    
    
}

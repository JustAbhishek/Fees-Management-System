/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fees_management;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek Prasad
 */
public class dbconnection {
    public static Connection con(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_management","root","");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return con;
    }
    
}

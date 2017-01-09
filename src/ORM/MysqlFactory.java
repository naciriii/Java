/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import ORM.Mysql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Naciri
 */
public class MysqlFactory extends Factory  {
    protected static Connection con;

    public MysqlFactory() {
     
    }
    public static Connection getInstance() {
        if(con==null) {
               if (con==null){
         try{
               
           Class.forName("com.mysql.jdbc.Driver");

               
         
          con =DriverManager.getConnection("jdbc:mysql://localhost/student_managment","root","");
                   
           } catch(ClassNotFoundException | SQLException e) {
               
               //probleme de connexion
               System.out.println(e.toString());
           }
         System.out.print("con success");
        }
        }
        return con;
        
    }

    @Override
    public final Dic getOrm(String orm) {
        Dic c=null;
        switch(orm) {
            case "student":
               c= new StudentOrm();
                break;
            default:
                        throw new UnsupportedOperationException("Orm not found."); //To change body of generated methods, choose Tools | Templates.

                
                
        }
        return c;
        
    }
    
    

    
}

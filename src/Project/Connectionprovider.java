

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class Connectionprovider {

  public static Connection getcon()
  {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
          return con;
      }
      catch(Exception e)
         {
             System.out.println(e);
             return null;
         }
      
  
  }

}
  
          
     
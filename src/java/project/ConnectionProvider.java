
package project;

import java.sql.*;
public class ConnectionProvider {
  
    public static Connection getCon(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jsp","root","sys");
    return con;
    }
    catch(Exception e){
    System.out.print(e);
     return null ;
    }
   
}
    
}

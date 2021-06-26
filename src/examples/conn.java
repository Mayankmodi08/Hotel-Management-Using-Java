/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.sql.*;

public class conn {

    
Connection c;
Statement s;
conn(){
   try {
	  Class.forName("com.mysql.jdbc.Driver");
	  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelproject","root","");
          s=c.createStatement();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

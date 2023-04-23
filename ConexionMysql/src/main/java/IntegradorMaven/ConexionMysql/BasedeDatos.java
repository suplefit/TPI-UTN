package IntegradorMaven.ConexionMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class BasedeDatos {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection conectar = null;
    	String sURL = "jdbc:mysql://localhost:3306/projectofinal";
    		
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	
    		try {
    			conectar = DriverManager.getConnection(sURL, "root", "1234");
    		JOptionPane.showMessageDialog(null,"Conexion Exitosa");
    		} catch (SQLException ex) {
    			JOptionPane.showMessageDialog(null,"Conexion fallida");
    		}
    		Statement s=null;
    		try {
    				s = conectar.createStatement();
    		    }
    		catch (SQLException ex) {
	}
    		
    		
    		      int val=2;
    		
    		      ResultSet rs=null;
    		      
    		  try { 
    			  
    			  rs = s.executeQuery("select * From resultado");
    			  
    			  
    			  
    		     }
    		  catch (SQLException ex) {
    			  JOptionPane.showMessageDialog(null,"consulta de tabla fallida");
    		
    		
    		  	}
    		try {
    			while(rs.next())
    				
    			 {
    				
    				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
    			 }
    		} catch (SQLException ex)  {
    			JOptionPane.showMessageDialog(null,"se mostraron los datos correctamente");
    		}

	}
}


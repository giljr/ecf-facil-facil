package br.com.ecftef.bd;

import java.sql.*;

public class AcessoMySQL {
	
	Connection con;
	
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/ecftef?user=giljr&password=1");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("N�o foi poss�vel encontrar o Driver!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("N�o foi poss�vel conectar ao banco!");
        }
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Padilla
 */
public class Conexion {
     public Connection conexion;
    public ResultSet resultado;
    public String err;
    public PreparedStatement ps;
    public void conectarBD(String bd) {

        try {

            final String Controlador = "com.mysql.jdbc.Driver";
            final String user = "root";
            final String Pass = "";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/";
            final String url_bd2 = "jdbc:mysql://localhost:3306/" + bd;
            if (bd.isEmpty()) {
                conexion = DriverManager.getConnection(url_bd, user, Pass);
            } else {
                conexion = DriverManager.getConnection(url_bd2, user, Pass);
            }

        } catch (ClassNotFoundException | SQLException ex) {
          err="Error: "+ex.getMessage();
        }
    }

    public void DesconectarBD() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
           err="Error: "+ex.getMessage();
        }
    }

    public Connection getConnection() {
        return conexion;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Conexion.Conexion;
import java.sql.SQLException;
/**
 *
 * @author Padilla
 */
public class ServicioCrearBD {
    
    public String err, errT;
    
    public String EliminarBD() throws Exception {
        Conexion c = null;
        try {
            c = new Conexion();
            c.conectarBD("");
            String sql = "DROP DATABASE IF EXISTS dbventas;" ;
            c.ps = c.conexion.prepareStatement(sql);
            c.ps.execute();
            c.ps.close();
            
            err="BD eliminada con exito.";
            return err;
        }
        catch (SQLException ex) {
            err="error: "+ex.getMessage();
            return err;
    }
        finally {
            if (c != null && c.conexion != null) {
                c.DesconectarBD();
            }
        }
    }
    
    public String CrearBD() throws Exception {
        Conexion c = null;
        try {
            c = new Conexion();
            c.conectarBD("");
            String sql = "CREATE DATABASE IF NOT EXISTS `dbventas` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;" ;
            c.ps = c.conexion.prepareStatement(sql);
            c.ps.execute();
            c.ps.close();
            
            err="Base de datos generada";
            return err;
        }
        catch(SQLException ex){
            err="error: "+ex.getMessage();
            return err;
        }
        finally {
            if (c != null && c.conexion != null) {
                c.DesconectarBD();
            }
        }
    }
    
    public String CrearTablas(String nombreBD) throws Exception {
        Conexion c = null;
        try {
            c = new Conexion();
            c.conectarBD(nombreBD);
            String sql="CREATE TABLE `Clientes` (" 
                    +"idCliente varchar(5) NOT NULL," 
                    +"nombre varchar(50) NOT NULL," 
                    +"dui varchar(11) NOT NULL,"  
                    +"PRIMARY KEY (idCliente)"
                    + ")ENGINE=InnoDB DEFAULT CHARSET=latin1";

            String sql1="CREATE TABLE `Vendedores` (" 
                    +"idVendedor varchar(5) NOT NULL," 
                    +"nombre varchar(50) NOT NULL," 
                    +"dui varchar(11) NOT NULL,"
                    +"nit varchar(17) NOT NULL,"
                    +"Edad int(2) NOT NULL,"
                    +"PRIMARY KEY (idVendedor)"
                    + ")ENGINE=InnoDB DEFAULT CHARSET=latin1";
            
            String sql2="CREATE TABLE `Productos` (" 
                    +"idProducto varchar(5) NOT NULL," 
                    +"producto varchar(50) NOT NULL,"   
                    +"precio double NOT NULL,"
                    +"PRIMARY KEY (idProducto)"
                    + ")ENGINE=InnoDB DEFAULT CHARSET=latin1";
            
            String sql3="CREATE TABLE `Inventario` (" 
                    +"idInventario int(11) NOT NULL AUTO_INCREMENT,"
                    +"fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
                    +"idProducto varchar(5) NOT NULL," 
                    +"cantidad int(11) NOT NULL,"  
                    +"PRIMARY KEY (idInventario),"
                    +"FOREIGN KEY (idProducto) REFERENCES Productos(idProducto)"
                    +")ENGINE=InnoDB DEFAULT CHARSET=latin1";

            String sql4="CREATE TABLE `Ventas` (" 
                    +"idVenta int(11) NOT NULL,"
                    +"fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
                    +"idProducto varchar(5) NOT NULL,"
                    +"cantidad int(11) NOT NULL,"
                    +"total double NOT NULL,"
                    +"idCliente varchar(5) NOT NULL,"
                    +"idVendedor varchar(5) NOT NULL,"
                    +"PRIMARY KEY (idVenta),"
                    +"FOREIGN KEY (idProducto) REFERENCES Productos(idProducto),"
                    +"FOREIGN KEY (idCliente) REFERENCES Clientes(idCliente),"
                    +"FOREIGN KEY (idVendedor) REFERENCES Vendedores(idVendedor)"
                    +")ENGINE=InnoDB DEFAULT CHARSET=latin1";
            
            c.ps = c.conexion.prepareStatement(sql);
            c.ps.execute();
            c.ps.close();
            c.ps = c.conexion.prepareStatement(sql1);
            c.ps.execute();
            c.ps.close();
            c.ps = c.conexion.prepareStatement(sql2);
            c.ps.execute();
            c.ps.close();
            c.ps = c.conexion.prepareStatement(sql3);
            c.ps.execute();
            c.ps.close();
            c.ps = c.conexion.prepareStatement(sql4);
            c.ps.execute();
            c.ps.close();
            
            errT="Tablas generadas correctamente";
            return errT;
        }
        catch(SQLException ex){
            errT="error: "+ex.getMessage();
            return errT;
        }
        
        finally {
            if (c != null && c.conexion != null) {
                c.DesconectarBD();
            }
        }
    }
    
}


package ControlBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBadminsystem {
        
    Connection dbConnection = null;
    
    public Connection DBcontrolProductos(){
        try{
            Class.forName("org.sqlite.JDBC");
            dbConnection = DriverManager.getConnection("jdbc:sqlite:src\\DB\\productos-ventas.db");
        }
        catch(Exception e){
            System.out.println(e);    
        }
        
        return dbConnection;
    }
    
        public Connection DBcontrolCredenciales(){
        try{
            Class.forName("org.sqlite.JDBC");
            dbConnection = DriverManager.getConnection("jdbc:sqlite:src\\DB\\credenciales.db");
        }
        catch(Exception e){
            System.out.println(e);    
        }
        
        return dbConnection;
    }
    public Connection DBcontrolVentas() {
        try {
            Class.forName("org.sqlite.JDBC");
            dbConnection = DriverManager.getConnection("jdbc:sqlite:src\\DB\\controlVentas.db");
        }
        catch(Exception e){
            System.out.println(e);    
        }
        
        return dbConnection;
    }
}

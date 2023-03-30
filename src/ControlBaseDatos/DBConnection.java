package ControlBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    private static String credencialesPath = "src\\BBDD\\credenciales.db";
    private static String productosVentasPath = "src\\BBDD\\productos-ventas.db";
    public static String usuarios = "usuarios";
    public static String administradores = "administradores";

    public static String getCredencialesPath() {
        return credencialesPath;
    }

    public static String getProductosVentasPath() {
        return productosVentasPath;
    }
    
    Connection dbConnection = null;
    
    public DBConnection(String dbPath) throws SQLException{
        String strConnection = "jdbc:sqlite:" + dbPath;
        dbConnection = DriverManager.getConnection(strConnection);
    }
    
    public ResultSet getUserPassword(String inputEmail, String table) throws SQLException{
        PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT contraseña FROM " + table + " WHERE correo_electronico = " + "'" + inputEmail + "'");
        ResultSet passwordQuery = preparedStatement.executeQuery();

        return passwordQuery;
    }
    
//    public void sqliteCommandExecution(String command){
//        try{
//            PreparedStatement pstm = dbConnection.prepareStatement(command);
//            pstm.execute();
//        }
//        catch (Exception e){
//            System.out.println("error: " + e);
//        }
//    }
}
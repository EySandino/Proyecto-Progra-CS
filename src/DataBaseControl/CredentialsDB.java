package DataBaseControl;

import Security.Encryptor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CredentialsDB {
    private String dbPath = "src\\DB\\credenciales.db";
    public static String usuarios = "users";
    public static String administradores = "admins";
    Connection dbConnection;
    Encryptor cryptoTool = new Encryptor();
    
    public CredentialsDB(){
        
    }
    
    private void openConnection(){
        try{
            dbConnection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        }
        catch (SQLException e){}
    }
    
    private void closeConnection(){
        try{
            dbConnection.close();
        }
        catch (SQLException e){}
    }
    
    public String getUserPassword(String inputEmail, String table) throws SQLException {
        openConnection();

        PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT password FROM " + table + " WHERE email = ?");
        preparedStatement.setString(1, inputEmail);
        ResultSet passwordQuery = preparedStatement.executeQuery();

        if (passwordQuery.next()) {
            String password = cryptoTool.decrypt(passwordQuery.getString("password"));
            closeConnection();
            return password;
        } 
        else {
            closeConnection();
            return null; // Si no se encontró ningún registro en la base de datos, devuelve null
        }
}

    public void setNewAdmin(String id, String username, String email, String password, String accessLevel) throws SQLException {
        
        openConnection();
    
        PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO admins(id, username, email, password, access_level) VALUES("
                + "'" + id + "'" + "," 
                + "'" + username + "'" + ","
                + "'" + email + "'" + "," 
                + "'" + cryptoTool.encrypt(password) + "'" + "," 
                + "'" + accessLevel + "'" + ");");
        preparedStatement.execute();
        
        closeConnection();
    }
    
    public void setNewUser(String id, String username, String email, String password) throws SQLException{
        openConnection();
 
        PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO users(id, username, email, password, shopping_history) VALUES("
                + "'" + id + "'" + ","
                + "'" + username + "'" + ","
                + "'" + email + "'" + ","
                + "'" + cryptoTool.encrypt(password) + "'" + ",' ');");
        preparedStatement.execute();
        
        closeConnection();
    }
    
    public boolean checkUserExistence(String userEmail, String table) throws SQLException {
        openConnection();
    
        PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT email FROM " + table + " WHERE email = " + "'" + userEmail + "';");
        ResultSet emailQuery = preparedStatement.executeQuery();
        
        if (emailQuery.next()) {
            closeConnection();
            return true;
        }
        else{
            closeConnection();
            return false;
        }
    }


}
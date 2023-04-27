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
    Encryptor cryptoTool;
    
    public CredentialsDB() throws SQLException{
        dbConnection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        cryptoTool = new Encryptor();
    }
    
    public String getUserPassword(String inputEmail, String table) throws SQLException{
        PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT password FROM " + table + " WHERE correo_electronico = " + "'" + inputEmail + "';");
        ResultSet passwordQuery = preparedStatement.executeQuery();
        String userPassword = passwordQuery.toString();

        return cryptoTool.decrypt(userPassword);
    }

    public void setNewAdmin(String username, String email, String password, String accessLevel) throws SQLException{
        String encryptedPassword = cryptoTool.encrypt(password);
        
        PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO admins(username, email, password, access_level) VALUES("
                + username + ","
                + email + ","
                + encryptedPassword + ","
                + accessLevel + ");");
        preparedStatement.execute();
    }
    
    public void setNewUser(String username, String email, String password) throws SQLException{
        String encryptedPassword = cryptoTool.encrypt(password);
        
        PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO users(username, email, password, shopping_history) VALUES("
                + "'" + username + "'" + ","
                + "'" + email + "'" + ","
                + "'" + encryptedPassword + "'" + ","
                + "' ');");
        preparedStatement.execute();
    }
}
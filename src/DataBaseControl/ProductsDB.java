package DataBaseControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductsDB {
    private String dbPath = "src\\DB\\productos-ventas.db";
     Connection dbConnection;
    
    public ProductsDB() throws SQLException{
        dbConnection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
    }
}

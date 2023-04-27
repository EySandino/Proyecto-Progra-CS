package DataBaseControl;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
=======
import ModuloProductos.Vuelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.BillObject;
import project.MobileDB;
>>>>>>> fce67f21496dadad6d7aaadb450e842cc960a428

public class ProductsDB {
    private String dbPath = "src\\DB\\productos-ventas.db";
     Connection dbConnection;
    
    public ProductsDB() throws SQLException{
        dbConnection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
    }
<<<<<<< HEAD
=======
    
 
>>>>>>> fce67f21496dadad6d7aaadb450e842cc960a428
}

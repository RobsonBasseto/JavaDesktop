
package SistemaAcademico.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
    
    public Connection getConnection()
    {
        Connection conn = null;
        
        try
        {
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        
        try
        {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SistemaAcademico","postgres","unipar");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    
}

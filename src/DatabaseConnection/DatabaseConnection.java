package DatabaseConnection;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;
public class DatabaseConnection
  {
    private Connection connection;
    
    public DatabaseConnection(){
        Properties props = new  Properties();
          try (FileInputStream fis = new FileInputStream("conf.properties"))
            {
                props.load(fis);
                Class.forName(props.getProperty("jdbc.driver.class"));
                String url  = props.getProperty("jdbc.url"); 
                this.connection = DriverManager.getConnection(url);
            }
          catch (Exception e)
            {
              JOptionPane.showMessageDialog(null, "Ato am connexion BD ilay erreur eee " + e.getMessage(), "Obligatoire", JOptionPane.INFORMATION_MESSAGE);
            }
        
    }
    
    public Connection getConnection() {
        return this.connection;
    }
}

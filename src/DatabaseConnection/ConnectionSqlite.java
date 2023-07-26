package DatabaseConnection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author rijaa
 */
public class ConnectionSqlite {
    
    public Connection conn;

    public ConnectionSqlite() {
        this.conn = null;
    }
    public void Connect(){
         Properties props = new  Properties();
         try (FileInputStream fis = new FileInputStream("conf.properties")){
                props.load(fis);
                Class.forName(props.getProperty("jdbc.driver.class"));
                String url  = props.getProperty("jdbc.url"); 
             // Exécuter une requête SELECT et afficher les résultats
             // Établir une connexion à la base de données
             conn = DriverManager.getConnection(url);
              
               // Exécuter une requête SELECT et afficher les résultats
            
        } catch (Exception e) {
            System.out.println("tsy mety");
        }
        
    }
    
}

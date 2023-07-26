/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;

//import DatabaseConnection.DatabaseConnection;
import java.sql.*;
import javax.swing.JTable;

public class Employertraitement{
  
    private String numEmployer;
    private String nom;
    private String adresse;
     
   // private String titre;
    public String i;
    
    public Employertraitement(){
       
    }
    public String getNumEmployer(){
       return numEmployer;
    }
    public String getNom(){
       return nom;
    }
     public String getAdresse(){
       return adresse;
    }
   
    
    public void setManipulationDon(String numEmployer, String nom,String adresse ){
        this.numEmployer = numEmployer;
        this.nom = nom;
        this.adresse = adresse;
        //this.titre = titre;
    }
    
   public void envoyeDonn(){
        ConnectionSqlite sqlite = new ConnectionSqlite();
            
        try{
                    
            sqlite.Connect();
            Connection cn = sqlite.conn;
            String sql = "INSERT INTO employe(numemployer,nom,adresse) VALUES ('"+numEmployer+"','"+nom+"','"+adresse+"')";
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
                               
        }catch(Exception e){
            e.printStackTrace();
        }
     }
    
   }
   

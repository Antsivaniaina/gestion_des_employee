/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;
import java.sql.*;

/**
 *
 * @author rijaa
 */
public class ModifierEmployer {
    
    private String numeemployer;
    private String nom;
    private String adresse;

    public ModifierEmployer() {
    }

    public String getNumeemployer() {
        return numeemployer;
    }

    public void setNumeemployer(String numeemployer) {
        this.numeemployer = numeemployer;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public void modifierDonner(){
        
        ConnectionSqlite sqlite = new ConnectionSqlite();
        String sql = "UPDATE employe SET nom = '"+nom+"' , adresse = '"+adresse+"' WHERE numemployer = '"+numeemployer+"'";
        System.out.println("coucou1");
        
        try{
            
            sqlite.Connect();
            Connection cn = sqlite.conn;
            Statement st = cn.createStatement();
            st.executeUpdate(sql);            
            st.close();
            cn.close();
            
            
        }catch(SQLException e){
            System.out.println(e.getErrorCode());
        }
        
        
    
    }
    
}

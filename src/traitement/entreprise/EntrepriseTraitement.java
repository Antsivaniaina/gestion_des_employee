/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.entreprise;

import DatabaseConnection.ConnectionSqlite;
import java.sql.*;

/**
 *
 * @author rijaa
 */
public class EntrepriseTraitement {
    private String numentreprise;
    private String nom;
    private String description;

    public EntrepriseTraitement(String numentreprise, String nom, String description) {
        this.numentreprise = numentreprise;
        this.nom = nom;
        this.description = description;
    }

    public String getNumentreprise() {
        return numentreprise;
    }

    public void setNumentreprise(String numentreprise) {
        this.numentreprise = numentreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void envoyerDonner(){
        String sql = "INSERT INTO entreprise(numentreprise,nomentreprise,description) VALUES ('"+numentreprise+"','"+nom+"','"+description+"')";
        ConnectionSqlite sqlite = new ConnectionSqlite();
        
        try{
            sqlite.Connect();
            Connection cn = sqlite.conn;
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            
        
        }catch(Exception e){
            
        
        }
    
    }
    
    
    
}

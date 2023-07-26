/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.entreprise;

import DatabaseConnection.ConnectionSqlite;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author rijaa
 */
public class Modifier {
    
    private String numeentreprise;
    private String nom;
    private String description;

    public Modifier() {
    }

    public String getNumeentreprise() {
        return numeentreprise;
    }

    public void setNumeentreprise(String numeentreprise) {
        this.numeentreprise = numeentreprise;
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
    
    public void modifierDonner(){
        ConnectionSqlite sqlite = new ConnectionSqlite();
        String sql = "UPDATE entreprise SET nomentreprise = '"+nom+"' , description = '"+description+"' WHERE numentreprise = '"+numeentreprise+"'";
        try{
            sqlite.Connect();
            Connection cn = sqlite.conn;
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
        }catch(Exception e){}
        
        
    
    }
    
}

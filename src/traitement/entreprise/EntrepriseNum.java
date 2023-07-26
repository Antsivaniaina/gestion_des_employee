/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.entreprise;

import DatabaseConnection.ConnectionSqlite;
import interfaces.Ajouter;
import interfaces.AjouterEntreprise;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rijaa
 */
public class EntrepriseNum {
    AjouterEntreprise ajout;
    public String numeroentreprise;
    public EntrepriseNum(){
   
    }
    
    public void recupereNum(AjouterEntreprise ajout){
        ConnectionSqlite sqlite = new ConnectionSqlite();

        try{
            
        sqlite.Connect();
        Connection cn = sqlite.conn;
        String sql1 = "SELECT numEntreprise FROM entreprise ORDER BY numEntreprise DESC LIMIT 1";
        
        PreparedStatement pstmt = cn.prepareStatement(sql1);
        ResultSet rs = pstmt.executeQuery();
        if  (rs.next())
              {
                String num = rs.getString("numEntreprise");
                System.out.println("numEntreprise"+num);
                
                 String resultString = num.substring(3);
                 int nume = Integer.parseInt(resultString);
                 int resultatInt = nume + 1;
                 numeroentreprise = String.format("ETR%03d",resultatInt); 
                 System.out.println(numeroentreprise);
              }
            else
              {
                String num = rs.getString("ETR001");
              }
        ajout.numentreprise.setText(numeroentreprise);
        pstmt.close();
        cn.close();
        }catch(Exception e){
        
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;
import interfaces.Ajouter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployerNum {
    Ajouter ajout;
    public String numeroemploye;
    public EmployerNum(){
   
    }
    
    public void recupereNum(Ajouter ajout){
        ConnectionSqlite sqlite = new ConnectionSqlite();

        try{
            
        sqlite.Connect();
        Connection cn = sqlite.conn;
        String sql1 = "SELECT numemployer FROM employe ORDER BY numemployer DESC LIMIT 1";
        
        PreparedStatement pstmt = cn.prepareStatement(sql1);
        ResultSet rs = pstmt.executeQuery();
        if  (rs.next())
              {
             
                String num = rs.getString("numemployer");
                System.out.println("numemployer"+num);
                
                 String resultString = num.substring(3);
                 int nume = Integer.parseInt(resultString);
                 int resultatInt = nume+1;
                 numeroemploye = String.format("EPL%03d",resultatInt);      
              }
            else
              {
                String num = rs.getString("EPL001");
              }
        ajout.numEmployer.setText(numeroemploye);
        
        pstmt.close();
        cn.close();
        }catch(Exception e){
        
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.entreprise;

import DatabaseConnection.ConnectionSqlite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rijaa
 */
public class AfficherEntreprise {
    
     public void affichage(JTable table){
    
        ConnectionSqlite sqlite = new ConnectionSqlite();
        
        try{
            sqlite.Connect();
            Connection con = sqlite.conn;
            String sql = "SELECT * FROM entreprise";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            while(rs.next()){
                int i = 0;
                Object [] row = new Object[3];
                row[0] = rs.getString("numentreprise");
                row[1] = rs.getString("nomentreprise");
                row[2] = rs.getString("description");
                model.addRow(row);
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                table.setDefaultRenderer(Object.class, centerRenderer);
                table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                table.setModel(model);

               
            }

         
          
            rs.close();
            con.close();
             
            
        }catch(SQLException ex){
        
            System.out.println(ex.getMessage());
        }

    
        }
}

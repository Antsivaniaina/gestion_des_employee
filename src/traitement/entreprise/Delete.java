/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.entreprise;

import DatabaseConnection.ConnectionSqlite;
import static interfaces.SupprEmployer.tableemployer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rijaa
 */
public class Delete {
    
    public void delete(JTable table,int row){
       DefaultTableModel model = (DefaultTableModel)table.getModel() ;
       ConnectionSqlite sqlite = new ConnectionSqlite();
       String numero = model.getValueAt(row,0).toString(); 
       System.out.println(numero);
       String sql = "DELETE FROM entreprise WHERE numEntreprise = ?";

        
        
       try{
            sqlite.Connect();
            
            Connection cn = sqlite.conn;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,numero);
            pst.executeUpdate();
            pst.close();
            cn.close();
            
            AfficherEntreprise aff = new AfficherEntreprise();
            aff.affichage(table);

            //JOptionPane.ShowMessageDialog(null,"voafafa tsara");                    
           } catch(SQLException ex){
                System.out.println(ex.getMessage());

        }
    
    }
}

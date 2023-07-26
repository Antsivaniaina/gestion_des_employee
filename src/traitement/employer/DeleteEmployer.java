/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.employer;

import DatabaseConnection.ConnectionSqlite;
import static interfaces.SupprEmployer.tableemployer;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rijaa
 */
public class DeleteEmployer {
    
    
    public void delete(JTable table,int row){
        
       DefaultTableModel model = (DefaultTableModel)table.getModel() ;
       
       ConnectionSqlite sqlite = new ConnectionSqlite();
              System.out.println("Traitement");

       String numero = model.getValueAt(row,0).toString();
       System.out.println("DeleteTraitement"+ numero );

       
       String sql = "DELETE FROM employe WHERE numemployer = ?";

        
        
       try{
            sqlite.Connect();
            
            Connection cn = sqlite.conn;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,numero);
            pst.executeUpdate();
            
            //String[] options = {"Oui", "Non"};
            //int choix = JOptionPane.showOptionDialog(null, "Voulez-vous vraiment supprimer ?", "Confirmation",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            //if (choix == JOptionPane.YES_OPTION) 
             // {
                
                  
              //} 
                        
            pst.close();
            cn.close();
            
           AffichageEmployer aff = new AffichageEmployer();
           aff.affichage(tableemployer);
          // tableemployer.setEnabled(true);
          // tableemployer.repaint();
           


            //JOptionPane.ShowMessageDialog(null,"voafafa tsara");                    
           } catch(SQLException ex){
                System.out.println(ex.getMessage());

        }
    
    }
}

package traitement;

import DatabaseConnection.ConnectionSqlite;
import DatabaseConnection.DatabaseConnection;
import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Travail
  {
    
    //Affichage des données en JTable
     public void affichage(JTable tableau1)
      {
        DefaultTableModel model1;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              conn = db.getConnection();
              String requete = "SELECT * FROM travail";
              stmt = conn.prepareStatement(requete);
              rs = stmt.executeQuery();
              model1 = (DefaultTableModel) tableau1.getModel();
              model1.setRowCount(0);
                while (rs.next())
                  {
                    String numemployer = rs.getString("NumEmployer");
                    String numentreprise = rs.getString("NumEntreprise");
                    String nbheure = rs.getString("NbHeure");
                    String tauxhoraire = rs.getString("TauxHoraire");
                    String dateembauche = rs.getString("DateEmbauche");
                    String Timeembauche = rs.getString("Timeembauche");
                    Object[] obj = {numemployer,numentreprise,nbheure,tauxhoraire,dateembauche,Timeembauche};
                    
                    model1.addRow(obj);              
                }
                /*DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
                centerRender.setHorizontalAlignment(JLabel.CENTER);
                for (int i=0; i < tableau1.getColumnCount(); i++)
                  {
                    tableau1.getColumnModel().getColumn(i).setCellRenderer(centerRender);
                  }
                   */             
               rs.close();
               stmt.close();
               conn.close();
               
            }
          catch (Exception e)
            {
              JOptionPane.showMessageDialog(null, "Ato am Affichage ilay erreur eee :" + e, "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        
      }
     
     //Supprimer un travail
     public void supprimerTravail(JTable table,int row){
       DefaultTableModel model = (DefaultTableModel)table.getModel() ;
       ConnectionSqlite sqlite = new ConnectionSqlite();
       String numero = model.getValueAt(row,5).toString();
       String sql = "DELETE FROM travail WHERE timeembauche = ?";       
       try{
            sqlite.Connect();
            
            Connection cn = sqlite.conn;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,numero);
            pst.executeUpdate();
            affichage(table);
                
            pst.close();
            cn.close();            
           } catch(SQLException ex){
                System.out.println(ex.getMessage());

        }
     }
     
     //Ajouter un travail
      public void ajouter(String numemployer, String numentreprise, String nbheure, String tauxhoraire, String dateembauche) throws IOException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            DatabaseConnection db = new DatabaseConnection();
            conn = db.getConnection();
            stmt = conn.prepareStatement("INSERT INTO travail VALUES (?,?,?,?,?,current_time)");
            stmt.setString(1, numemployer);
            stmt.setString(2, numentreprise);
            stmt.setString(3, nbheure);
            stmt.setString(4, tauxhoraire);
            stmt.setString(5, dateembauche);
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ato am Ajout ilay erreur eee :" + e, "Information", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
      
      //Modifier un travail
      public void modifiertravail(String numemployer, String numentreprise, String nbheure, String tauxhoraire, String date_embauche){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        String sql = "UPDATE travail SET NbHeure = ? , TauxHoraire = ? WHERE NumEmployer = ? AND NumEntreprise = ? AND DateEmbauche = ?";
        try{
            
            DatabaseConnection db = new DatabaseConnection();
            conn = db.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(3, numemployer);
            stmt.setString(4, numentreprise);
            stmt.setString(1, nbheure);
            stmt.setString(2, tauxhoraire);
            stmt.setString(5, date_embauche);
            stmt.executeUpdate();
            
            JOptionPane.showOptionDialog(null, "Travail modifier avec succès.", "Confirmation",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ato am Modif ilay erreur eee :" + e, "Information", JOptionPane.WARNING_MESSAGE);
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
         }
        }
        
    
    }
      
      //Remplir les COmboBox
      @SuppressWarnings("unchecked")
      public void remplirCombo(JComboBox combo,String table)
        {
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              conn = db.getConnection();
              stmt = conn.createStatement();
              String sql = "SELECT * FROM " +table+" ";
              rs = stmt.executeQuery(sql);
              List<String> valeurs = new ArrayList<>();
               while (rs.next())
                  {
                    String valeur = rs.getString(1);
                    valeurs.add(valeur);
                  }
                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(valeurs.toArray(new  String[0]));
                combo.setModel(model);
               rs.close();
               stmt.close();
               conn.close();
               
            }
          catch (Exception e)
            {
              JOptionPane.showMessageDialog(null, "Ato am ComboBox ilay erreur eee :" + e, "Information", JOptionPane.INFORMATION_MESSAGE);
              e.printStackTrace();
            }
        }
      
      //AutoID
      
     /*public void  autoID(J)
      { 
        try
          {
            String var1 = "";
            conn = db.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            stmt = conn.createStatement();
            String sql = "SELECT numcli FROM client order by numcli desc";
            rs = stmt.executeQuery(sql);
            if  (rs.next())
              {
                var1 = rs.getString(1);
              }
            else
              {
                var1 = "CLT000";
              }
            if (!(var1 == null || var1.isEmpty()))
              {
                int ID = Integer.parseInt(var1.substring(3))+ 1;
                textnumcli.setText(String.format("CLT%03d",ID));
              }
          }
               
        catch (SQLException ex)
          {
            ex.printStackTrace();
          }
      }*/
  }

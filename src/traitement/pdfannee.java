
package traitement;

import DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;


public class pdfannee
  {
     public void affichage(String annee, String entreprise, String filepath)
      {
        DefaultTableModel model1;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        java.sql.Statement statementExec = null;
        String nomentreprise = null;
        String description = null;
        int nbemployer = 0;
        Integer salairetotal = 0;
        
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              conn = db.getConnection();
              String requete1 = "SELECT * FROM entreprise WHERE numentreprise = '"+entreprise+"'";
              String requete2 = "SELECT employe.numemployer, employe.nom, employe.adresse, sum(travail.nbheure*travail.tauxhoraire) as salaire FROM employe ,travail, entreprise WHERE (employe.numemployer = travail.numemployer) AND (entreprise.numentreprise = travail.numentreprise) AND travail.numentreprise = ? AND strftime('%Y', dateembauche) = ? GROUP BY employe.numemployer ORDER BY salaire DESC ;";
              statementExec = conn.createStatement();
              rs1 = statementExec.executeQuery(requete1);
              while (rs1.next())
                  {
                    nomentreprise = rs1.getString("nomentreprise");
                    description = rs1.getString("description");                
                }
                            
              /*************************** Création du PDF **********************************/
            Document doc = new Document();
            PdfWriter.getInstance(doc,new FileOutputStream(filepath+".pdf") );
            doc.open();
            Paragraph paraNumEntreprise = new Paragraph("Numéro de l'entreprise : "+ entreprise);
            Paragraph paradescription = new Paragraph("Raison sociale : "+ description );
            Paragraph paraannee = new Paragraph("Année : "+ annee );
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Liste des Employées de l'entreprise "+nomentreprise));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
            doc.add(paraNumEntreprise);
            doc.add(paradescription);
            doc.add(paraannee);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
              
            /*** En-tete du tableau ***/
            
            PdfPTable table = new PdfPTable(4);
            table.addCell("N° Employée");
            table.addCell("Nom");
            table.addCell("Adresse");
            table.addCell("Salaire");
            
            /***************************/
            
            /***************** Corps du tableau ***************/
            
              stmt = conn.prepareStatement(requete2);
              stmt.setString(1, entreprise);
              stmt.setString(2, annee);
              rs2 = stmt.executeQuery();
                while (rs2.next())
                  {
                    String numemployer = rs2.getString("NumEmployer");
                    String nom = rs2.getString("nom");
                    String adresse = rs2.getString("adresse");
                    Integer salaire = rs2.getInt("salaire");
                    table.addCell(numemployer);
                    table.addCell(nom);
                    table.addCell(adresse);
                    table.addCell(salaire.toString());
                    nbemployer++;
                    salairetotal = salaire + salairetotal;
                }
            /***************************************************/
            
             table.setWidthPercentage(100);
            doc.add(table);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Nombre d'employée : " +nbemployer ));
            doc.add(new Paragraph("Salaire total : " +salairetotal ));
                
               doc.close();
               rs1.close();
               rs2.close();
               stmt.close();
               conn.close();
               
            }
          catch (Exception e)
            {
              JOptionPane.showMessageDialog(null, "Ato am Affichage ilay erreur eee :" + e, "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        
      }
  }

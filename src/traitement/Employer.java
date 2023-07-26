/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement;

import DatabaseConnection.DatabaseConnection;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Employer
  {
     public void salaireGlobalPDF(String annee, String filepath)
      {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs2 = null;
        int nbemployer = 0;
        Integer salairetotal = 0;
        
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              conn = db.getConnection();
              String requete2 = "SELECT employe.numemployer, employe.nom, sum(travail.nbheure * travail.tauxhoraire) as salaire FROM employe, travail WHERE (employe.numemployer = travail.numemployer) AND strftime('%Y', dateembauche) = ? GROUP BY employe.numemployer ORDER BY salaire DESC;";
              /*************************** Création du PDF **********************************/
            Document doc = new Document();
            PdfWriter.getInstance(doc,new FileOutputStream(filepath+".pdf") );
            doc.open();
            Paragraph paramois = new Paragraph("ANNEE : "+ annee );
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Etat des salaires globaux des employées"));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
            doc.add(paramois);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
              
            /*** En-tete du tableau ***/
            
            PdfPTable table = new PdfPTable(3);
            table.addCell("N° Employée");
            table.addCell("Nom");
            table.addCell("Salaire");
            
            /***************************/
            
            /***************** Corps du tableau ***************/
            
              stmt = conn.prepareStatement(requete2);
              stmt.setString(1, annee);
              rs2 = stmt.executeQuery();
                while (rs2.next())
                  {
                    String numemployer = rs2.getString("NumEmployer");
                    String nom = rs2.getString("nom");
                    Integer salaire = rs2.getInt("salaire");
                    table.addCell(numemployer);
                    table.addCell(nom);
                    table.addCell(salaire.toString());
                    nbemployer++;
                    salairetotal = salaire + salairetotal;
                }
            /***************************************************/
            
             table.setWidthPercentage(100);
            doc.add(table);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Nombre total des employées : " +nbemployer ));
            doc.add(new Paragraph("MONTANT TOTAL : " +salairetotal ));
                
               doc.close();
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

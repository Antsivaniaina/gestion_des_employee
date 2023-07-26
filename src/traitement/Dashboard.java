package traitement;

import DatabaseConnection.DatabaseConnection;
import controleur.ModelPieChart;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import interfaces.PieChart;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Dashboard
  {
    private static DefaultCategoryDataset dataset;
    private static JFreeChart chart;
    private static CategoryPlot categoryplot;
    private static ChartPanel chartpanel;
    
    //Mampiseho an'ilay Total employer eo @ DashBoard Interface
    public static String SommeEmployer()
      {
        String  somme = "";
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              Connection conn = db.getConnection();
               String query = "SELECT COUNT(*) AS sommeemployer FROM employe";
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               if (rs.next())
                 {
                    somme = rs.getString("sommeemployer");
                 }
               stmt.close();
               conn.close();
            }
          catch (Exception e)
            {
            }
          return somme ;
      }
    
    //Mampiseho an'ilay Total Entreprise eo @ DashBoard Interface
    public static String SommeEntreprise()
      {
        String  somme = "";
          try
            {
              DatabaseConnection db = new DatabaseConnection();
              Connection conn = db.getConnection();
               String query = "SELECT COUNT(numemployer) AS sommeentreprise FROM travail";
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               if (rs.next())
                 {
                    somme = rs.getString("sommeentreprise");
                 }
               stmt.close();
               conn.close();
            }
          catch (Exception e)
            {
            }
          return somme ;
      }
    
    //Mampiseho an'ilay Graph boribory (Camembert)
    public static void showDataPieChart(PieChart pieChart)
      {
          try
            {
              pieChart.clearData();
              DatabaseConnection db = new DatabaseConnection();
              Connection conn = db.getConnection();
               String query = "SELECT employe.nom, sum(travail.nbheure * travail.tauxhoraire) as salaire FROM employe, travail WHERE (employe.numemployer = travail.numemployer) GROUP BY employe.numemployer ORDER BY salaire DESC;";
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(query);
               int index = 0;
               while (rs.next())
                 {
                   String nom = rs.getString("nom");
                   Double salaire = rs.getDouble("salaire");
                   pieChart.addData(new ModelPieChart(nom, salaire, getColor(index++)));
                 }
               stmt.close();
               conn.close();
            }
          catch (Exception e)
            {
            }
      }
    
    //Ny loko rehetra miasa @ ilay Camembert
    private static Color getColor(int index)
      {
        Color[] color = new Color[]{ new Color(255, 102,102),new Color(58, 55,227),new Color(206, 215,33),new Color(29, 184,85),new Color(94, 217,214),new Color(43, 45,250),new Color(200, 169,86),};
        return color[index];
      }
    
    //Mampiseho an'ilay Graph lavalava (Barchart) eo @ DashBoard Interface
    public static void showDataBarchart(JPanel panelBarChart)
      {
        try
          {
            DatabaseConnection db = new DatabaseConnection();
            Connection conn = db.getConnection();
             String query = "SELECT travail.numentreprise, entreprise.nomentreprise, count(travail.numemployer) as sommeemployer FROM entreprise,travail WHERE (travail.numentreprise = entreprise.numentreprise) GROUP BY travail.numentreprise";
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             dataset = new DefaultCategoryDataset();
             while (rs.next())
               {
                dataset.addValue(rs.getInt("sommeemployer"), rs.getString("nomentreprise"),rs.getString("numentreprise"));
               }
            stmt.close();
            conn.close();
           //create Chart
           chart = ChartFactory.createBarChart("Nombre d'employées par entreprise","", "Empployée", dataset, PlotOrientation.VERTICAL,true,true,false);
           categoryplot = chart.getCategoryPlot();
           chartpanel = new ChartPanel(chart);
           chartpanel.setOpaque(true);
           chartpanel.setBackground(Color.red);
           panelBarChart.removeAll();
           panelBarChart.add(chartpanel);
           panelBarChart.validate();
          }
        catch (Exception ex)
          {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
  }

package traitement.employer;

import interfaces.Modification;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rijaa
 */
public class Envoyeinputmodifier {
    
    public int row;
    public JTable table;
    public String num;
    public String nom;
    public String adresse;
    
    
    public Envoyeinputmodifier() {
        
    }
    public void modifier(int row,JTable table,Modification mdf){
        DefaultTableModel model = (DefaultTableModel)table.getModel() ;
        
         num = model.getValueAt(row,0).toString(); ; 
         nom = model.getValueAt(row,1).toString();
         adresse = model.getValueAt(row,2).toString(); 
         
         mdf.numero.setText(num);
         mdf.nom.setText(nom);
         mdf.adresse.setText(adresse);
         
    
    }
   
}

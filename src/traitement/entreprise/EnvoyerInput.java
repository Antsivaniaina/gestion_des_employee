/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traitement.entreprise;

import interfaces.ModifierEntreprise;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rijaa
 */
public class EnvoyerInput {
    public int row;
    public JTable table;
    public String num;
    public String nom;
    public String description;
    
    
    public EnvoyerInput() {
        
    }
    public void modifier(int row,JTable table,ModifierEntreprise mdf){
        DefaultTableModel model = (DefaultTableModel)table.getModel() ;
        
         num = model.getValueAt(row,0).toString(); 
         nom = model.getValueAt(row,1).toString();
         description = model.getValueAt(row,2).toString(); 
         
         mdf.numeroentreprise.setText(num);
         mdf.nom.setText(nom);
         mdf.description.setText(description);
         
    
    }
}

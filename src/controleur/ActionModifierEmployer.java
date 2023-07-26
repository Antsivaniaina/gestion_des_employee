/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import interfaces.Modification;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import traitement.employer.ModifierEmployer;

/**
 *
 * @author rijaa
 */
public class ActionModifierEmployer implements ActionListener {
    Modification mdf;
    
    public ActionModifierEmployer(Modification mdf){
        this.mdf = mdf;
        mdf.modifier.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String numero = mdf.nom.getText();
        String nom = mdf.nom.getText();
        String adresse = mdf.adresse.getText();
        
        ModifierEmployer mod = new ModifierEmployer();
        mod.setNumeemployer(numero);
        mod.setNom(nom);
        mod.setAdresse(adresse);
        mod.modifierDonner();
                
    }
}

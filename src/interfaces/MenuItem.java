/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

import controleur.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class MenuItem extends javax.swing.JPanel {

    private boolean selected;
    private boolean over;
    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if(data.getType() == Model_Menu.MenuType.MENU){
            IbIcon.setIcon(data.toIcon());
            IbName.setText(data.getName());
        }else if(data.getType() == Model_Menu.MenuType.TITLE){
            IbIcon.setText(data.getName());
            IbIcon.setFont(new Font("sansserif",1,12));
            IbName.setVisible(false);            
        }else{
            IbName.setText(" ");
        }
    }

    public void setSelected(boolean selected){
        this.selected = selected;
        repaint();
    }
    public void setOver(boolean over){
        this.over = over;
        repaint();  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        IbIcon = new javax.swing.JLabel();
        IbName = new javax.swing.JLabel();

        IbName.setBackground(new java.awt.Color(255, 255, 255));
        IbName.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        IbName.setForeground(new java.awt.Color(255, 255, 255));
        IbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbName.setText("Tableau de bord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(IbIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IbName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IbName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphcs){
        if(selected){
             Graphics2D g2 = (Graphics2D)grphcs; 
             g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
             if(selected || over){
                g2.setColor(new Color(255,255,255,80));
             } else{
                g2.setColor(new Color(255,255,255,20));
                 
             }
             g2.fillRoundRect(10, 0, getWidth()-20, getHeight(), 5, 5);
             
        }
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbIcon;
    private javax.swing.JLabel IbName;
    // End of variables declaration//GEN-END:variables
}

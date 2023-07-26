/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

import controleur.tableEmployer.TableActionCellEditor;
import controleur.tableEmployer.TableActionCellRender;
import controleur.tableEmployer.TableActionEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import traitement.entreprise.AfficherEntreprise;
import traitement.entreprise.Delete;
import traitement.entreprise.EntrepriseNum;
import traitement.entreprise.EnvoyerInput;

/**
 *
 * @author Antsivaniaina
 */
public class Entreprise
        extends javax.swing.JPanel
  {
    DefaultTableModel model1;
    public Entreprise()
      {
          
        initComponents();
        AfficherEntreprise afficher = new AfficherEntreprise();
        affichage();
        rechercher("t");
        rechercher("");
        TableActionEvent event = new TableActionEvent(){
            
                
            @Override
            public void onEdit(int row){
                
                ModifierEntreprise mdf = new ModifierEntreprise(Entreprise.this);
                mdf.setVisible(true);
                
                EnvoyerInput envoyer = new EnvoyerInput();
                envoyer.modifier(row, tableentreprise, mdf);
                
               

                
            }
             @Override
            public void onDelete(int row){
                
                SupprimerEntreprise suppr = new SupprimerEntreprise(tableentreprise,row);
                suppr.setVisible(true);
               // Delete delet = new Delete();
                //delet.delete(tableentreprise, row);
                 
                              
            }
            
        
        };
        tableentreprise.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRender()); 
        tableentreprise.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));

        
        
      }
    
    //Affichage
    public void affichage()
      {
        new traitement.entreprise.AfficherEntreprise().affichage(tableentreprise);
      }
    
    // MANAO ANLE BORDER RADIUS 
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }
    
    //Recherche dans le JTable
     public void rechercher(String str)
      {
        model1 = (DefaultTableModel) tableentreprise.getModel();
          TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model1);
          tableentreprise.setRowSorter(trs);
          trs.setRowFilter(RowFilter.regexFilter(str,itemlist.getSelectedIndex()));
          
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ajout = new controleur.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableentreprise = new javax.swing.JTable();
        text_search = new javax.swing.JTextField();
        itemlist = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(986, 75));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Information des entreprises");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        ajout.setBackground(new java.awt.Color(51, 51, 255));
        ajout.setForeground(new java.awt.Color(255, 255, 255));
        ajout.setText("Ajouter");
        ajout.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ajout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ajoutActionPerformed(evt);
            }
        });

        tableentreprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Numéro", "Nom", "Description", "Action"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tableentreprise.setRowHeight(40);
        jScrollPane2.setViewportView(tableentreprise);

        text_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_search.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                text_searchKeyReleased(evt);
            }
        });

        itemlist.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        itemlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numéro", "Nom", "Description" }));
        itemlist.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(itemlist, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemlist, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        AjouterEntreprise ajt = new AjouterEntreprise(this);
        ajt.setVisible(true);
        ajt.setLocationRelativeTo(null);
        EntrepriseNum num = new EntrepriseNum();
        num.recupereNum(ajt);
        
        
        

    }//GEN-LAST:event_ajoutActionPerformed

    private void text_searchKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_text_searchKeyReleased
    {//GEN-HEADEREND:event_text_searchKeyReleased
                                               
        String mot = text_search.getText();
        rechercher(mot);
    }//GEN-LAST:event_text_searchKeyReleased

    private void itemlistActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemlistActionPerformed
    {//GEN-HEADEREND:event_itemlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemlistActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public controleur.Button ajout;
    private javax.swing.JComboBox<String> itemlist;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableentreprise;
    private javax.swing.JTextField text_search;
    // End of variables declaration//GEN-END:variables
  }

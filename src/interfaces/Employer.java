/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

import controleur.tableEmployer.TableActionCellEditor;
import controleur.tableEmployer.TableActionCellRender;
import controleur.tableEmployer.TableActionEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import traitement.employer.AffichageEmployer;
import traitement.employer.DeleteEmployer;
import traitement.employer.EmployerNum;
import traitement.employer.Envoyeinputmodifier;

/**
 *
 * @author Antsivaniaina Anstivaniaina paradisagasy soma tsika Jiaby eh
 */
public class Employer extends javax.swing.JPanel
  {
    DefaultTableModel model1;
    public Employer(){        
        initComponents();
        
        AffichageEmployer afficher = new AffichageEmployer();
        affichage();
        String teste = "";
        String tst = "s";
        rechercher(tst);
        rechercher(teste);
        
        TableActionEvent event = new TableActionEvent(){
            
                
            @Override
            public void onEdit(int row){ 
 //               ModificationEmployer mdf = new ModificationEmployer(Employer.this);
 //               mdf.setVisible(true);
                
                Modification mdf = new Modification(Employer.this);
                mdf.setVisible(true);
                mdf.numero.setEditable(false);
                
                 Envoyeinputmodifier modif = new Envoyeinputmodifier();
                 modif.modifier(row,tableemployer,mdf);
                

                
            }
             @Override
            public void onDelete(int row){
                
                SupprEmployer delete = new SupprEmployer(row,tableemployer);
                delete.setVisible(true);
                
                
//                DeleteEmployer deletePanel = new DeleteEmployer();
//                deletePanel.delete(tableemployer, row);
                

                
                
               

            }
            
        
        };
        tableemployer.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRender());       
        tableemployer.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));

      }
    //Affichage
    public void affichage()
      {
        new traitement.employer.AffichageEmployer().affichage(tableemployer);
      }
    
    //Recherche dans le JTable
     public void rechercher(String str)
      {
          model1 = (DefaultTableModel) tableemployer.getModel();
          TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model1);
          tableemployer.setRowSorter(trs);
          trs.setRowFilter(RowFilter.regexFilter(str,itemlist.getSelectedIndex()));
          
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ajout = new controleur.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableemployer = new javax.swing.JTable();
        text_search = new javax.swing.JTextField();
        itemlist = new javax.swing.JComboBox<>();
        button1 = new interfaces.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(986, 75));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Information des employées");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        ajout.setBackground(new java.awt.Color(51, 51, 255));
        ajout.setForeground(new java.awt.Color(255, 255, 255));
        ajout.setText("Ajouter");
        ajout.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ajout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ajoutActionPerformed(evt);
            }
        });

        tableemployer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "numemployer", "nom", "adresse", "action"
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
        tableemployer.setRowHeight(40);
        jScrollPane1.setViewportView(tableemployer);

        text_search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_search.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                text_searchKeyReleased(evt);
            }
        });

        itemlist.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numéro", "Nom", "Adresse" }));

        button1.setBackground(new java.awt.Color(102, 102, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Salaire Globaux");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                button1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_search)
                        .addGap(18, 18, 18)
                        .addComponent(itemlist, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemlist, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        Ajouter ajt = new Ajouter(this);
        ajt.setVisible(true);
        ajt.setLocationRelativeTo(null);
        
        ajt.numEmployer.setEditable(false);
        
        EmployerNum num = new EmployerNum();
        num.recupereNum(ajt);
        
//        Employertraitement employer = new Employertraitement();
//        
//        AjouterEmploye mampiditra = new AjouterEmploye();
        //mampiditra.titreemploye.setText("Ajout d'employer");
        //String titre = mampiditra.titreemploye.getText();
        
//        AjoutEmployer ajtemp = new AjoutEmployer(ajt,employer);        
//        EmployerNum num = new EmployerNum(ajt);
//        num.recupereNum();
        
       
        
        
    }//GEN-LAST:event_ajoutActionPerformed

    private void text_searchKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_text_searchKeyReleased
    {//GEN-HEADEREND:event_text_searchKeyReleased
        String mot = text_search.getText();
        rechercher(mot);
    }//GEN-LAST:event_text_searchKeyReleased

    private void button1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_button1MouseClicked
    {//GEN-HEADEREND:event_button1MouseClicked
       new demandeAnnee().setVisible(true);
    }//GEN-LAST:event_button1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public controleur.Button ajout;
    private interfaces.Button button1;
    private javax.swing.JComboBox<String> itemlist;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableemployer;
    private javax.swing.JTextField text_search;
    // End of variables declaration//GEN-END:variables
  }

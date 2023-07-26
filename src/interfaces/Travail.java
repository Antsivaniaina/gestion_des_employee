package interfaces;

import controleur.tableEmployer.TableActionCellEditor;
import controleur.tableEmployer.TableActionCellRender;
import controleur.tableEmployer.TableActionEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Travail
        extends javax.swing.JPanel
  {
    DefaultTableModel model1;
    private String numemployer;
    private String numentreprise;
    private String nbheure;
    private String tauxhoraire;
    private String date_embauche;
    
    public Travail()
      {
        initComponents();
        modifierSupprimerJtable();
        affichage(); 
        rechercher("r");
        rechercher("");
      }
    
    //Action Modifier et supprimer sur le JTable
    public void modifierSupprimerJtable()
      {
        TableActionEvent event = new TableActionEvent(){
                           
            @Override
            public void onEdit(int row){
               DefaultTableModel model = (DefaultTableModel)tableTravail.getModel();
                numemployer = model.getValueAt(row,0).toString();
                numentreprise = model.getValueAt(row,1).toString();
                nbheure = model.getValueAt(row,2).toString();;
                tauxhoraire = model.getValueAt(row,3).toString();
                date_embauche = model.getValueAt(row, 4).toString();
               afficherfenetremodification();
               
            }
            
             @Override
            public void onDelete(int row){
                SupTravail sup = new SupTravail(tableTravail,row);
                sup.setVisible(true);
                
   //             new traitement.Travail().supprimerTravail(tableTravail, row);
                
                
            }
            
        
        };
  
        tableTravail.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender());       
        tableTravail.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor(event));
      }
    
    //Affichage sur JTable
    public void affichage()
      {
        new traitement.Travail().affichage(tableTravail);
      }
       
    public void afficherfenetremodification()
      {
      new Modif_travail(this, numemployer, numentreprise, nbheure, tauxhoraire, date_embauche).setVisible(true);
      }
    
    //Recherche dans le JTable
     public void rechercher(String str)
      {
        model1 = (DefaultTableModel) tableTravail.getModel();
          TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model1);
          tableTravail.setRowSorter(trs);
          trs.setRowFilter(RowFilter.regexFilter(str,itemlist.getSelectedIndex()));
          
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableTravail = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnajout = new interfaces.Button();
        textSearch = new javax.swing.JTextField();
        itemlist = new javax.swing.JComboBox<>();
        btnPDF = new interfaces.Button();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        tableTravail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableTravail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Numéro Employées", "Numéro Entreprises", "Nombre d'Heures", "Taux Horaires", "Date d'embauche", "Heure", ""
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tableTravail.setRowHeight(40);
        tableTravail.setSelectionForeground(new java.awt.Color(204, 255, 255));
        tableTravail.getTableHeader().setResizingAllowed(false);
        tableTravail.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableTravail);
        if (tableTravail.getColumnModel().getColumnCount() > 0)
        {
            tableTravail.getColumnModel().getColumn(0).setResizable(false);
            tableTravail.getColumnModel().getColumn(1).setResizable(false);
            tableTravail.getColumnModel().getColumn(2).setResizable(false);
            tableTravail.getColumnModel().getColumn(3).setResizable(false);
            tableTravail.getColumnModel().getColumn(4).setResizable(false);
            tableTravail.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 920, 580);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(986, 75));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Information sur les Travails");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 986, 60);

        btnajout.setBackground(new java.awt.Color(51, 51, 255));
        btnajout.setForeground(new java.awt.Color(255, 255, 255));
        btnajout.setText("Ajouter");
        btnajout.setEffectColor(new java.awt.Color(204, 204, 255));
        btnajout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnajout.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnajoutMouseClicked(evt);
            }
        });
        add(btnajout);
        btnajout.setBounds(20, 90, 150, 50);

        textSearch.setBackground(new java.awt.Color(204, 204, 204));
        textSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(102, 102, 102)));
        textSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textSearch.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                textSearchKeyReleased(evt);
            }
        });
        add(textSearch);
        textSearch.setBounds(190, 100, 370, 40);

        itemlist.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        itemlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employée", "Entreprise", "Heure", "Taux" }));
        add(itemlist);
        itemlist.setBounds(580, 100, 160, 40);

        btnPDF.setBackground(new java.awt.Color(0, 102, 51));
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setText("Générer PDF");
        btnPDF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPDF.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnPDFMouseClicked(evt);
            }
        });
        add(btnPDF);
        btnPDF.setBounds(780, 90, 150, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dashFond.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-10, 0, 1000, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnajoutMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnajoutMouseClicked
    {//GEN-HEADEREND:event_btnajoutMouseClicked
        new ajout_modif_travail(this).setVisible(true);
    }//GEN-LAST:event_btnajoutMouseClicked

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_textSearchKeyReleased
    {//GEN-HEADEREND:event_textSearchKeyReleased
        String mot = textSearch.getText();
        rechercher(mot);
    }//GEN-LAST:event_textSearchKeyReleased

    private void btnPDFMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnPDFMouseClicked
    {//GEN-HEADEREND:event_btnPDFMouseClicked
        new ChoixPDF().setVisible(true);
    }//GEN-LAST:event_btnPDFMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfaces.Button btnPDF;
    private interfaces.Button btnajout;
    private javax.swing.JComboBox<String> itemlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTravail;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
  }

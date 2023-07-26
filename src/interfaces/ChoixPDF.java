package interfaces;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ChoixPDF
        extends javax.swing.JFrame
  {
    private String pdfchoix = null;
    private String valeurdate1 = null;
    private String valeurdate2 = null;
    
    
    public ChoixPDF()
      {
        initComponents();
        radiobuttonGroup();
        new  traitement.Travail().remplirCombo(entreprise, "entreprise");
      }
    
    //Grouper les JradioButton
    public void radiobuttonGroup()
      {
        buttonGroup1.add(choix_mois);
        buttonGroup1.add(choix_annee);
        buttonGroup1.add(choix_2dates);
      }
    
    public void status(boolean mois, boolean annee, boolean da1, boolean da2)
      {
        listmois.setEnabled(mois);
        listannee.setEnabled(annee);
        date1.setEnabled(da1);
        date2.setEnabled(da2);
      }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mois = new com.raven.datechooser.DateChooser();
        annee = new com.raven.datechooser.DateChooser();
        date_choix2 = new com.raven.datechooser.DateChooser();
        date1_choix = new com.raven.datechooser.DateChooser();
        choix_annee = new javax.swing.JRadioButton();
        choix_mois = new javax.swing.JRadioButton();
        choix_2dates = new javax.swing.JRadioButton();
        button1 = new interfaces.Button();
        button2 = new interfaces.Button();
        jLabel1 = new javax.swing.JLabel();
        listmois = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        date2 = new javax.swing.JTextField();
        listannee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entreprise = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        mois.setForeground(new java.awt.Color(102, 102, 255));
        mois.setDateFormat("yyyy-MM");
        mois.setTextRefernce(listmois);

        annee.setForeground(new java.awt.Color(102, 102, 255));
        annee.setDateFormat("yyyy");
        annee.setTextRefernce(listannee);

        date_choix2.setForeground(new java.awt.Color(102, 102, 255));
        date_choix2.setDateFormat("yyyy-MM-dd");
        date_choix2.setTextRefernce(date2);

        date1_choix.setForeground(new java.awt.Color(102, 102, 255));
        date1_choix.setDateFormat("yyyy-MM-dd");
        date1_choix.setTextRefernce(date1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        choix_annee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        choix_annee.setText("Par Année :");
        choix_annee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_anneeActionPerformed(evt);
            }
        });

        choix_mois.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        choix_mois.setText("Par Mois :");
        choix_mois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_moisActionPerformed(evt);
            }
        });

        choix_2dates.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        choix_2dates.setText("Entre 2 dates :");
        choix_2dates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_2datesActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0, 102, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Télécharger");
        button1.setEffectColor(new java.awt.Color(153, 255, 153));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Annuler");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Liste des Employées dans une Entreprise en PDF");

        listmois.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listmois.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        listmois.setEnabled(false);

        date1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date1.setEnabled(false);

        date2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date2.setEnabled(false);

        listannee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listannee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        listannee.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fermer.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        entreprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Entreprise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(listannee, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listmois, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(choix_2dates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(choix_annee)
                                    .addComponent(choix_mois))))
                        .addGap(12, 12, 12)
                        .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 451, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {choix_2dates, choix_annee, choix_mois});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button1, button2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {date1, date2, entreprise, listannee, listmois});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix_mois)
                    .addComponent(listmois, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(choix_annee)
                    .addComponent(listannee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix_2dates, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {choix_2dates, choix_annee, choix_mois});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button1, button2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date1, date2, entreprise, listannee, listmois});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void choix_moisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_choix_moisActionPerformed
    {//GEN-HEADEREND:event_choix_moisActionPerformed
        status(true,false,false,false);
    }//GEN-LAST:event_choix_moisActionPerformed

    private void choix_anneeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_choix_anneeActionPerformed
    {//GEN-HEADEREND:event_choix_anneeActionPerformed
        status(false,true,false,false);
    }//GEN-LAST:event_choix_anneeActionPerformed

    private void choix_2datesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_choix_2datesActionPerformed
    {//GEN-HEADEREND:event_choix_2datesActionPerformed
        status(false,false,true,true);
    }//GEN-LAST:event_choix_2datesActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel2MouseClicked
    {//GEN-HEADEREND:event_jLabel2MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button2ActionPerformed
    {//GEN-HEADEREND:event_button2ActionPerformed
         this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void button1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_button1MouseClicked
    {//GEN-HEADEREND:event_button1MouseClicked
       
    }//GEN-LAST:event_button1MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button1ActionPerformed
    {//GEN-HEADEREND:event_button1ActionPerformed
      JFileChooser fileChooser = new JFileChooser();
      FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers PDF", "pdf");
      fileChooser.setFileFilter(filter);
      int result = fileChooser.showSaveDialog(this);
      if (result == JFileChooser.APPROVE_OPTION) {
         File selectedFile = fileChooser.getSelectedFile();
         String filePath = selectedFile.getAbsolutePath();
         if (choix_mois.isSelected())
           {
              new traitement.pdfmois().affichage(listmois.getText().toString().trim(), entreprise.getSelectedItem().toString().trim(), filePath);
              this.dispose();
           }
         if (choix_annee.isSelected())
           {
              new traitement.pdfannee().affichage(listannee.getText().toString().trim(), entreprise.getSelectedItem().toString().trim(), filePath);
              this.dispose();
           }
         if (choix_2dates.isSelected())
           {
             new traitement.pdf2date().affichage(date1.getText().toString().trim(), date2.getText().toString().trim(), entreprise.getSelectedItem().toString().trim(), filePath);
              this.dispose();
           }
         String newPath = filePath+".pdf";
         File ouvrir = new File(newPath);
          try
            {
              Desktop.getDesktop().open(ouvrir);
              this.dispose();
            }
          catch (IOException ex)
            {
              Logger.getLogger(ChoixPDF.class.getName()).log(Level.SEVERE, null, ex);
              this.dispose();
            }
      }
    }//GEN-LAST:event_button1ActionPerformed

    public static void main(String args[])
      {
        java.awt.EventQueue.invokeLater(() ->
          {
            new ChoixPDF().setVisible(true);
          });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser annee;
    private interfaces.Button button1;
    private interfaces.Button button2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton choix_2dates;
    private javax.swing.JRadioButton choix_annee;
    private javax.swing.JRadioButton choix_mois;
    private javax.swing.JTextField date1;
    private com.raven.datechooser.DateChooser date1_choix;
    private javax.swing.JTextField date2;
    private com.raven.datechooser.DateChooser date_choix2;
    private javax.swing.JComboBox<String> entreprise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField listannee;
    private javax.swing.JTextField listmois;
    private com.raven.datechooser.DateChooser mois;
    // End of variables declaration//GEN-END:variables
  }

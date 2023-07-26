package interfaces;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;

public class Modif_travail
        extends javax.swing.JFrame
  {
    private interfaces.Travail jframeTable;
    private String numemployer;
    private String numentreprise;
    private String nbheure;
    private String tauxhoraire;
    private String date_embauche;
    
    public Modif_travail(interfaces.Travail jf, String numemployer, String numentreprise, String nbheure, String taux, String date)
      {
        this.numemployer = numemployer;
        this.numentreprise = numentreprise;
        this.nbheure = nbheure;
        this.tauxhoraire = taux;
        this.date_embauche = date;
        this.jframeTable = jf;
        initComponents();
        new  traitement.Travail().remplirCombo(combo_employer,"employe");
        new  traitement.Travail().remplirCombo(combo_entreprise, "entreprise");
        affichervaleur();
        
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text_nbheure = 
        text_nbheure = new javax.swing.JTextField(){
            private static final long serialVersionUID = 1L; // nécessite une version sérialisée

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                if (getText().length() == 0 ) {
                    int h = getHeight();
                    ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    Insets ins = getInsets();
                    FontMetrics fm = g.getFontMetrics();
                    g.setColor(Color.decode("#C0C0C0"));
                    g.drawString("Nom d'utilisateur", ins.left + 5, h / 2 + fm.getAscent() / 2 );
                }
            }
        };

        text_nbheure.setBackground(java.awt.SystemColor.windowBorder);

        text_nbheure.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        text_nbheure.setForeground(new java.awt.Color(255, 255, 255));

        text_nbheure.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        // Code adding the component to the parent container - not shown here
        ;
        text_horaire = 
        text_horaire = new javax.swing.JTextField(){
            private static final long serialVersionUID = 1L; // nécessite une version sérialisée

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                if (getText().length() == 0 ) {
                    int h = getHeight();
                    ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    Insets ins = getInsets();
                    FontMetrics fm = g.getFontMetrics();
                    g.setColor(Color.decode("#C0C0C0"));
                    g.drawString("Nom d'utilisateur", ins.left + 5, h / 2 + fm.getAscent() / 2 );
                }
            }
        };

        text_horaire.setBackground(java.awt.SystemColor.windowBorder);

        text_horaire.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        text_horaire.setForeground(new java.awt.Color(255, 255, 255));

        text_horaire.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        // Code adding the component to the parent container - not shown here
        ;
        combo_entreprise = new javax.swing.JComboBox<>();
        combo_employer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnajouter = new interfaces.Button();
        text_date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ajout d'un travail");
        setBackground(new java.awt.Color(204, 102, 255));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modification");

        text_nbheure.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_nbheure.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        text_horaire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_horaire.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        combo_entreprise.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_entreprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_entreprise.setEnabled(false);

        combo_employer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_employer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_employer.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Numéro employée :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre d'heure :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Taux horaire :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Numéro entreprise :");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fermer.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        btnajouter.setBackground(new java.awt.Color(38, 117, 191));
        btnajouter.setForeground(new java.awt.Color(255, 255, 255));
        btnajouter.setText("Valider");
        btnajouter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnajouterMouseClicked(evt);
            }
        });

        text_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_date.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Date d'embauche :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(text_horaire, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_nbheure, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_entreprise, javax.swing.GroupLayout.Alignment.LEADING, 0, 169, Short.MAX_VALUE)
                    .addComponent(combo_employer, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_date))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_employer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(text_nbheure, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_horaire, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_date, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_employer, combo_entreprise, text_date, text_horaire, text_nbheure});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel6MouseClicked
    {//GEN-HEADEREND:event_jLabel6MouseClicked
        
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

     // Afficher la valeur de la ligne selectionner
    private void affichervaleur()
      {
        combo_employer.setSelectedItem(numemployer);
        combo_entreprise.setSelectedItem(numentreprise);
          System.out.println(numemployer);
        text_nbheure.setText(nbheure);
        text_horaire.setText(tauxhoraire);
        text_date.setText(date_embauche);
      }
    private void btnajouterMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnajouterMouseClicked
    {//GEN-HEADEREND:event_btnajouterMouseClicked
       try
          {
            new traitement.Travail().modifiertravail(combo_employer.getSelectedItem().toString().trim(), combo_entreprise.getSelectedItem().toString().trim(), text_nbheure.getText().trim(), text_horaire.getText().trim(), text_date.getText().toString().trim());
          } 
        catch (Exception ex)
          {
            ex.printStackTrace();
          }
        jframeTable.affichage();
        this.dispose();
    }//GEN-LAST:event_btnajouterMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfaces.Button btnajouter;
    private javax.swing.JComboBox<String> combo_employer;
    private javax.swing.JComboBox<String> combo_entreprise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField text_date;
    private javax.swing.JTextField text_horaire;
    private javax.swing.JTextField text_nbheure;
    // End of variables declaration//GEN-END:variables
  }

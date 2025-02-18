/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces;

import controleur.tableEmployer.TableActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rijaa
 */
public class BtnDeleteModif extends javax.swing.JPanel {

    /**
     * Creates new form BtnDeleteModif
     */
    public BtnDeleteModif() {
        initComponents();
    }
    public void initEvent(TableActionEvent event,int row){
        actionedit.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae){
                event.onEdit(row);
                System.out.println(row);
                
        }
        });
        actionDelete.addActionListener(new ActionListener(){
            
         @Override
            public void actionPerformed(ActionEvent ae){
                event.onDelete(row);
        }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        actionButon1 = new controleur.ActionButon();
        actionButon2 = new controleur.ActionButon();
        actionButon3 = new controleur.ActionButon();
        actionedit = new controleur.ActionButon();
        actionDelete = new controleur.ActionButon();

        actionedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icond_edit..png"))); // NOI18N
        actionedit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                actioneditActionPerformed(evt);
            }
        });

        actionDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_delete.png"))); // NOI18N
        actionDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                actionDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actionedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actioneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actioneditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actioneditActionPerformed

    private void actionDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actionDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controleur.ActionButon actionButon1;
    private controleur.ActionButon actionButon2;
    private controleur.ActionButon actionButon3;
    public controleur.ActionButon actionDelete;
    public controleur.ActionButon actionedit;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paiement;

import class_ispg.connexiondata;
import class_ispg.gerer_fenetre;
import gui.general_GUI;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import tables.tb_history;

/**
 *
 * @author HP
 */
public final class paiement_tab extends javax.swing.JInternalFrame {

    /**
     * Creates new form paiement
     */
    public paiement_tab() {
        initComponents();
        ((BasicInternalFrameUI)getUI()).setNorthPane(null);
        charg_tabl(tb_paiement,requst);
    }
    //Deux requete de selection dans deux differente tableau
    DefaultTableModel def_mod;
     int row=-1;
   
    public static String requst="select n_matricule,nom,prenom,banque,n_compte,salTot,frInss"
            + ",frMut,pensCompl,impot,salPay,date_payer from personel,paiement "
            + "where personel.idEmployer=paiement.idEmpl";
    
    public static String requestHist="select n_matricule,nom,prenom,banque,n_compte,salTot,frInss"
            + ",frMut,pensCompl,impot,salPay,date_payer from personel,hist_paiement "
            + "where personel.idEmployer=hist_paiement.idEmpl";
    
    
//chargement de la table par defaut cela va etre utiliser dans deux tableaux mais avec requete de selection 
//dans les deux table differente.Ici les colonnes reste les mêmes
    public void charg_tabl(JTable jtable,String st){
        def_mod=new DefaultTableModel();
        jtable.setModel(def_mod);
        Object[] colonne={"Numéro matricule","Nom "," Prenom","Nom de la Banque","Numéro de compte","Salaire Total","Frais d'INSS"
                ,"Frais de mutualité","Frais de pension","Impot","Salaire payable","Date de paiement"};
        def_mod.setColumnIdentifiers(colonne);
        
        ResultSet rs_tab=connexiondata.extraireData(st);
        try {
            while(rs_tab.next()){
            Object ligne[]={rs_tab.getString("n_matricule"),rs_tab.getString("nom"),rs_tab.getString("prenom"),
                rs_tab.getString("banque"),rs_tab.getString("n_compte"),rs_tab.getInt("salTot"),
                rs_tab.getInt("frInss"),rs_tab.getInt("frMut")
                ,rs_tab.getInt("pensCompl"),rs_tab.getInt("impot"),rs_tab.getInt("salPay"),
                rs_tab.getString("date_payer")};
            def_mod.addRow(ligne);
            }
        } catch (SQLException ex) {
            Logger.getLogger(paiement_tab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//la suppression d'element
    void delet(String elemnt)
    {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txterech = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        removeHist = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_paiement = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        txterech.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txterech.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        txterech.setOpaque(false);
        txterech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txterechKeyTyped(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Imprimer");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_print_48px_1.png"))); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        removeHist.setBackground(new java.awt.Color(0, 51, 51));
        removeHist.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        removeHist.setForeground(new java.awt.Color(255, 255, 255));
        removeHist.setText("Retirer");
        removeHist.setToolTipText("");
        removeHist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeHist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_delete_48px.png"))); // NOI18N
        removeHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeHistActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Historique");
        jRadioButton1.setToolTipText("");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_payment_history_48px.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Exporter comme excel");
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_ms_excel_48px.png"))); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txterech, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jRadioButton3)
                .addGap(5, 5, 5)
                .addComponent(removeHist)
                .addGap(5, 5, 5)
                .addComponent(jRadioButton1)
                .addGap(5, 5, 5)
                .addComponent(jRadioButton4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txterech, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton3)
                                .addComponent(removeHist)
                                .addComponent(jRadioButton1)
                                .addComponent(jRadioButton4)))))
                .addContainerGap())
        );

        jScrollPane2.setBorder(null);

        tb_paiement.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tb_paiement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_paiement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_paiementMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_paiement);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1487, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
tb_history his=new tb_history();
     general_GUI.deskpanne.removeAll();
     general_GUI.deskpanne.repaint();
     general_GUI.deskpanne.add(his);
        try 
        {
            his.setMaximum(true);
            his.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(paiement_tab.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
gerer_fenetre.export(tb_paiement, ".xls");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
gerer_fenetre.ImprimerLaTable(tb_paiement);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void removeHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeHistActionPerformed

  
     RemovePaiement(tb_paiement,row);
     charg_tabl(tb_paiement,requst);
     selectedVar=null;
     row=-1;

    }//GEN-LAST:event_removeHistActionPerformed

    private void tb_paiementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_paiementMouseClicked

         row=tb_paiement.getSelectedRow();
 if(row>=0)
 {
    setSelectedVar((String) tb_paiement.getValueAt(row,11 ));
 }
    }//GEN-LAST:event_tb_paiementMouseClicked

    private void txterechKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txterechKeyTyped
gerer_fenetre.gererLaRecherche(tb_paiement, def_mod, txterech, txterech.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_txterechKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton removeHist;
    private javax.swing.JTable tb_paiement;
    private javax.swing.JTextField txterech;
    // End of variables declaration//GEN-END:variables

   public String selectedVar=null; 

    public String getSelectedVar() {
        return selectedVar;
    }

    public void setSelectedVar(String selectedVar) {
      this.selectedVar = selectedVar;
    }

//je supprime les paiement
    public void RemovePaiement(JTable tab,int ro)
    {
     ro=tab.getSelectedRow();
      if(ro>=0)
       {
        if(JOptionPane.showConfirmDialog(this, "êtes-vous sûr de la suppression")==JOptionPane.OK_OPTION){
        
        
       DelPaiement delt=new DelPaiement();
       
       delt.setExistVal((String) tab.getValueAt(ro,11));

       if(delt.Delete_paiement()>0&&delt.Delete_historiqe()>0)
       {
           JOptionPane.showMessageDialog(this,"La suppression a été effectué");
           selectedVar=null;
        
       }else{
           getToolkit().beep();
          JOptionPane.showMessageDialog(this,"La suppression n'a pas été effectué","",JOptionPane.ERROR_MESSAGE); 
       }  
    }else{
          getToolkit().beep();
       JOptionPane.showMessageDialog(this,"La permission de suppression non accordée","",JOptionPane.ERROR_MESSAGE);
       selectedVar=null;

        }
    
         }else{
         getToolkit().beep();
         JOptionPane.showMessageDialog(this,"Sélectionner une ligne","",JOptionPane.ERROR_MESSAGE); 
      
        }
 
}
}

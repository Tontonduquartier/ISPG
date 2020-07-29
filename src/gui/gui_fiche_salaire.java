/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import EditFiche.EditFiche;
import class_ispg.connexiondata;
import class_ispg.gerer_fenetre;
import java.beans.PropertyVetoException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import paiement.paiementUI;


/**
 *
 * @author HP
 */
public final class gui_fiche_salaire extends javax.swing.JInternalFrame {

    /**
     * Creates new form gui_fiche_salaire
     */
    public gui_fiche_salaire()
    {
        initComponents();
       charg_tb_fs();
        ((BasicInternalFrameUI)getUI()).setNorthPane(null);
      
  }
     
     SimpleDateFormat df=new SimpleDateFormat();
    ResultSet rslt;
    static String mod;
    int row=-1;
    
        
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab_fs = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_suppr_fs = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        tabl = new javax.swing.JRadioButton();
        add = new javax.swing.JRadioButton();
        btn_mod = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_commentaire = new javax.swing.JTextArea();
        jRadioButton3 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setPreferredSize(new java.awt.Dimension(4700, 4900));

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 51));

        tab_fs.setBackground(new java.awt.Color(0, 51, 51));
        tab_fs.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tab_fs.setForeground(new java.awt.Color(255, 255, 255));
        tab_fs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tab_fs.setEditingColumn(0);
        tab_fs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_fsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tab_fs);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 4700, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel6);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        btn_suppr_fs.setBackground(new java.awt.Color(0, 0, 51));
        btn_suppr_fs.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_suppr_fs.setForeground(new java.awt.Color(255, 255, 255));
        btn_suppr_fs.setText("Supprimer");
        btn_suppr_fs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suppr_fs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtherImage/icons8_delete_48px_1.png"))); // NOI18N
        btn_suppr_fs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suppr_fsActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 51));
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Fermer");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtherImage/icons8_close_window_48px.png"))); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 51));
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Nouveau paiement");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtherImage/icons8_cash_in_hand_48px_1.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        tabl.setBackground(new java.awt.Color(0, 0, 51));
        tabl.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tabl.setForeground(new java.awt.Color(255, 255, 255));
        tabl.setText("Imprimer");
        tabl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Send_to_Printer_48px.png"))); // NOI18N
        tabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 0, 51));
        add.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Ajouter nouveau");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtherImage/icons8_add_48px.png"))); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        btn_mod.setBackground(new java.awt.Color(0, 0, 51));
        btn_mod.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_mod.setForeground(new java.awt.Color(255, 255, 255));
        btn_mod.setText("Modifier");
        btn_mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OtherImage/icons8_edit_property_48px.png"))); // NOI18N
        btn_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modActionPerformed(evt);
            }
        });

        txt_commentaire.setColumns(20);
        txt_commentaire.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt_commentaire.setRows(5);
        txt_commentaire.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txt_commentaire);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 51));
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Modifier un Commentaire");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_comments_48px.png"))); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_suppr_fs, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(btn_suppr_fs)
                            .addComponent(jRadioButton2)
                            .addComponent(add)
                            .addComponent(btn_mod)
                            .addComponent(tabl)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_fsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_fsMouseClicked
int rowtab=tab_fs.getSelectedRow();
String s=tab_fs.getValueAt(rowtab,23).toString();
      ResultSet rs  =connexiondata.extraireData("select commentaire from fiche_salaire where dateEnr='"+s+"'");
        try {
         while(rs.next()){
               txt_commentaire.setText(rs.getString("commentaire"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tab_fsMouseClicked

        
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
paiementUI p=new paiementUI();
general_GUI.deskpanne.removeAll();
general_GUI.deskpanne.add(p);
        try {
            p.setMaximum(true);
            p.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        try {
            setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    private void tablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablActionPerformed
     charg_tb_fs();    
        gerer_fenetre.ImprimerLaTable(tab_fs);     
    }//GEN-LAST:event_tablActionPerformed

    private void btn_suppr_fsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suppr_fsActionPerformed
modify();
    }//GEN-LAST:event_btn_suppr_fsActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
general_GUI.deskpanne.removeAll();
nauvfchSal n=new nauvfchSal();
        general_GUI.deskpanne.add(n);
        try {
            n.setMaximum(true);
            n.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void btn_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modActionPerformed
row=tab_fs.getSelectedRow();
if(row>=0)
{ 
    String valeurExistant=tab_fs.getValueAt(row, 23).toString();
    ResultSet r=connexiondata.extraireData("select n_matricule,nom,prenom,qualification,salBase,indm_log,indm_depl,alloc_fam,indam_grade,"
                   + "prime,sal_brut,insspers,insspatr,inssrisquepro,mutualiteperso,mutualitepatro,pensCompl,sal_impos,"
                   + "ire,avanc_sal,retSurSal,netpayable,netApay,dateEnr,commentaire"
                   + " from personel inner join fiche_salaire where personel.idEmployer=fiche_salaire.idEmployer and dateEnr='"+valeurExistant+"'");
    try {
        
        EditFiche ed=new EditFiche();
        
        while(r.next())
        {
        ed.combo_matri.addItem(r.getString("n_matricule"));
        ed.txt_lab_nom.setText(r.getString("nom"));
        ed.txt_lab_prenom.setText(r.getString("prenom"));
        ed.txt_qual.setText(r.getString("qualification"));
        ed.txtsalbase.setText(""+r.getInt("salBase"));
        ed.txt_indmn_log.setText(""+r.getInt("indm_log"));
        ed.txt_indmn_dep.setText(r.getString("indm_depl"));
        ed.txt_alloc_fam.setText(""+r.getInt("alloc_fam"));
        ed.txt_indmn_grad.setText(""+r.getInt("indam_grade"));
        ed.txt_prime.setText(""+r.getInt("prime"));
        ed.txt_sal_br.setText(""+r.getInt("sal_brut"));
        ed.txt_inssPerso.setText(""+r.getInt("insspers"));
        ed.txt_inssPens.setText(""+r.getInt("insspatr"));
        ed.txt_inssprof.setText(""+r.getInt("inssrisquepro"));
        ed.txt_mutperso.setText(""+r.getInt("mutualiteperso"));
        ed.txt_mutpatr.setText(""+r.getInt("mutualitepatro"));
        ed.txt_salimpos.setText(""+r.getInt("sal_impos"));
        ed.txtPensCompl.setText(""+r.getInt("pensCompl"));
     
        ed.txtIRE.setText(""+r.getInt("ire"));
        ed.txt_sal_av.setText(""+r.getInt("avanc_sal"));
        ed.txt_Ret_sur_sal.setText(""+r.getInt("retSurSal"));
        ed.txtpayabl.setText(""+r.getInt("netpayable"));
        ed.txt_net_pay.setText(""+r.getInt("netApay"));
        ed.txt_commentaire.setText(r.getString("commentaire"));
        ed.Date_enr.setText(r.getString("dateEnr"));
        general_GUI.deskpanne.add(ed);
            try {
                ed.setMaximum(true);
                ed.show();
            } catch (PropertyVetoException ex) {
                Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    } catch (SQLException ex) {
        Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
    }
}else{
    getToolkit().beep();
    JOptionPane.showMessageDialog(this, "séléctionner une ligne pour acceder à la modification","Message d'attention",JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_btn_modActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
int line=-1;
line=tab_fs.getSelectedRow();
if(line>=0){
    String comment=(String) tab_fs.getValueAt(line, 23);
    connexiondata.modifierDB("update fiche_salaire set commentaire='"+txt_commentaire.getText()+"' where dateEnr='"+comment+"'");
    JOptionPane.showMessageDialog(this, "Un commentaire a été ajouté");
    charg_tb_fs();
    txt_commentaire.setText("");
}else{
    getToolkit().beep();
    JOptionPane.showMessageDialog(this, "Erreur\nSéléctionner une ligne","",JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add;
    private javax.swing.JRadioButton btn_mod;
    private javax.swing.JRadioButton btn_suppr_fs;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tab_fs;
    private javax.swing.JRadioButton tabl;
    public javax.swing.JTextArea txt_commentaire;
    // End of variables declaration//GEN-END:variables
//delet
    int rw=-1;
    void modify(){
    rw=tab_fs.getSelectedRow();
    if(rw>=0){
    String s=tab_fs.getValueAt(rw,23).toString();
    if(JOptionPane.showConfirmDialog(this, "Voulez-vous effectuer la suppression?")==JOptionPane.OK_OPTION)
    {

    connexiondata.modifierDB("delete from fiche_salaire where dateEnr='"+s+"'");
    JOptionPane.showMessageDialog(this, "supprimé avec succès");
    charg_tb_fs();
    }else{
        JOptionPane.showMessageDialog(this, "Les droits de supprimer non accordé","",JOptionPane.INFORMATION_MESSAGE);
    }
  
    }
    else{
       JOptionPane.showMessageDialog(this, "Selectionner une ligne","",JOptionPane.ERROR_MESSAGE);
   
    }
    
}
  
//la methode qui charge la table fiche salaire
public void charg_tb_fs(){
DefaultTableModel dft=new DefaultTableModel();
Object colon[]={"Nunéro matricule","Nom","Prénom","Qualification","Salaire de base","Indamnité de logement","Indamnité de déplacement",
    "Allocation familiale","idminité de grade","Prime fonction","salaire brut","Frais d'INSS personel","Frais d'INSS patronal",
    "Frais d'INSS de risque professionel","Frais de mutualité personel","Frais de mutualité patronal",
    "Frais de pension complementaire","Salaire Imposable","Impôt sur revenu d'emploi","Salaire d'avance",
    "Retenu sur salaire","Net payable","Net à payer","Date d'eregistrement"};
   tab_fs.setModel(dft);
    dft.setColumnIdentifiers(colon);
           rslt=connexiondata.extraireData("select n_matricule,nom,prenom,qualification,salBase,indm_log,indm_depl,alloc_fam,indam_grade,"
                   + "prime,sal_brut,insspers,insspatr,inssrisquepro,mutualiteperso,mutualitepatro,pensCompl,sal_impos,"
                   + "ire,avanc_sal,retSurSal,netpayable,netApay,dateEnr"
                   + " from personel inner join fiche_salaire where personel.idEmployer=fiche_salaire.idEmployer");
           
     try {
        while(rslt.next()){
         Object line[]={rslt.getString("n_matricule"),rslt.getString("nom"),rslt.getString("prenom"),rslt.getString("qualification"),
               rslt.getInt("salBase"),rslt.getInt("indm_log"),rslt.getInt("indm_depl"),rslt.getInt("alloc_fam"),
               rslt.getInt("indam_grade"),rslt.getInt("prime"),rslt.getInt("sal_brut"),rslt.getInt("insspers"),rslt.getString("insspatr"),
               rslt.getInt("inssrisquepro"),rslt.getInt("mutualiteperso"),rslt.getString("mutualitepatro"),rslt.getInt("pensCompl"),
               rslt.getInt("sal_impos"),rslt.getInt("ire"),rslt.getInt("avanc_sal"),
               rslt.getInt("retSurSal"),rslt.getInt("netpayable"),rslt.getInt("netApay"),rslt.getString("dateEnr")}; 
                dft.addRow(line);
            }
        } catch (SQLException ex) {
            Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}

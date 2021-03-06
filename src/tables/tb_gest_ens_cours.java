/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import class_ispg.connexiondata;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class tb_gest_ens_cours extends javax.swing.JInternalFrame {

    /**
     * Creates new form tb_gest_ens_cours
     */
    public tb_gest_ens_cours() {
        initComponents();
        ((BasicInternalFrameUI)getUI()).setNorthPane(null);
        chargtab();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    DefaultTableModel tb=new DefaultTableModel();
    void chargtab(){
        tb_g_ens_cours.setModel(tb);

       Object colonne[]={"Cours","Nombre d'heure","Année","Nom & Prenom du prof","Année Academique",
       "Date faite","Commentaire"};
     tb.setColumnIdentifiers(colonne);
     
        ResultSet rs=connexiondata.extraireData("select *from enseignant_cours order by annee");
        try {
            while(rs.next()){
                Object[]ligne={rs.getString("cours"),rs.getString("annee"),rs.getString("n_heure")
                ,rs.getString("nom_prof")+" "+rs.getString("prenon_prof"),rs.getString("anneeAcademique"),
                rs.getString("date_modified"),rs.getString("commentaire")};
                tb.addRow(ligne);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tb_gest_ens_cours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_rchrch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_g_ens_cours = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        btn_retirer = new javax.swing.JToggleButton();
        btn_act = new javax.swing.JToggleButton();
        btn_restor = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        txt_rchrch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_rchrchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_rchrchMouseExited(evt);
            }
        });
        txt_rchrch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rchrchKeyTyped(evt);
            }
        });
        getContentPane().add(txt_rchrch);
        txt_rchrch.setBounds(30, 30, 244, 35);

        tb_g_ens_cours.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tb_g_ens_cours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_g_ens_cours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_g_ens_coursMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_g_ens_cours);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 1350, 370);

        jToggleButton1.setText("Nouveau");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(650, 40, 90, 25);

        btn_retirer.setText("Retirer");
        btn_retirer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_retirer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_retirer);
        btn_retirer.setBounds(420, 40, 90, 25);

        btn_act.setText("Actualiser");
        btn_act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_actMouseExited(evt);
            }
        });
        btn_act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actActionPerformed(evt);
            }
        });
        getContentPane().add(btn_act);
        btn_act.setBounds(780, 40, 90, 25);

        btn_restor.setText("Restorer");
        btn_restor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_restorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_restorMouseExited(evt);
            }
        });
        btn_restor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_restor);
        btn_restor.setBounds(540, 40, 90, 25);

        jLabel1.setBackground(new java.awt.Color(51, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      ");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-150, 0, 1510, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rchrchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_rchrchMouseClicked
txt_rchrch.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rchrchMouseClicked

    private void txt_rchrchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_rchrchMouseExited
if(txt_rchrch.getText().length()==0){
    txt_rchrch.setText("Recherche");
}
    }//GEN-LAST:event_txt_rchrchMouseExited

    private void txt_rchrchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rchrchKeyTyped
DefaultTableModel tb_mod=(DefaultTableModel)tb_g_ens_cours.getModel();
        TableRowSorter<DefaultTableModel> tbr=new TableRowSorter<>(tb_mod);
        tb_g_ens_cours.setRowSorter(tbr);
        String strng=txt_rchrch.getText();
        tbr.setRowFilter(RowFilter.regexFilter(strng));
    }//GEN-LAST:event_txt_rchrchKeyTyped

    private void btn_restorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restorMouseEntered
     btn_restor.setForeground(Color.RED);
    }//GEN-LAST:event_btn_restorMouseEntered

    private void btn_restorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restorMouseExited
        btn_restor.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_btn_restorMouseExited

    private void btn_restorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restorActionPerformed
 getToolkit().beep();
        if(JOptionPane.showConfirmDialog(null,"Voulez-vous réinitialiser vos donnée?","Message d'attention ",JOptionPane.WARNING_MESSAGE)==JOptionPane.OK_OPTION){
      connexiondata.modifierDB("truncate enseignant_cours");
      JOptionPane.showMessageDialog(this, "La restauration terminé");
 }else{
            getToolkit().beep();
     JOptionPane.showMessageDialog(this, "Restauration non effectuée");
 }
        initialis_tab();
       
 
// TODO add your handling code here:
    }//GEN-LAST:event_btn_restorActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
//gestion_cours gc=new gestion_cours();
//        
//        general_GUI.deskpanne.removeAll();
//        general_GUI.deskpanne.repaint();
//        general_GUI.deskpanne.add(gc);
//        try {
//            gc.setMaximum(true);
//            gc.show();
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(tb_gest_ens_cours.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btn_retirerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirerActionPerformed
       int i=tb_g_ens_cours.getSelectedRow();
       String str0=tb_g_ens_cours.getModel().getValueAt(i, 0).toString();
       String str1=tb_g_ens_cours.getModel().getValueAt(i, 1).toString();
       String str2=tb_g_ens_cours.getModel().getValueAt(i, 2).toString();
       String str4=tb_g_ens_cours.getModel().getValueAt(i, 4).toString();
        String str5=tb_g_ens_cours.getModel().getValueAt(i, 5).toString();
       if(JOptionPane.showConfirmDialog(this, "Voulez-vous retirer le cours à\n"+str5+"?")==JOptionPane.OK_OPTION){
           connexiondata.modifierDB("DELETE FROM enseignant_cours WHERE cours='"+str0+"'and departement='"+str1+"' and"
                   + " faculte='"+str2+"' and annee='"+str4+"'");
           JOptionPane.showMessageDialog(this, "Effectué");
           
           btn_retirer.setEnabled(false);
          
         
       }else{
           JOptionPane.showMessageDialog(this, "Non effectué","Message d'erreur",JOptionPane.ERROR_MESSAGE);
             }
       initialis_tab();

    }//GEN-LAST:event_btn_retirerActionPerformed

    private void tb_g_ens_coursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_g_ens_coursMouseClicked
//`btn_retirer.setEnabled(false);  
// TODO add your handling code here:
    }//GEN-LAST:event_tb_g_ens_coursMouseClicked

    private void btn_actMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actMouseEntered

    private void btn_actMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actMouseExited

    private void btn_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actActionPerformed
     initialis_tab();
    }//GEN-LAST:event_btn_actActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_act;
    private javax.swing.JToggleButton btn_restor;
    private javax.swing.JToggleButton btn_retirer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tb_g_ens_cours;
    private javax.swing.JTextField txt_rchrch;
    // End of variables declaration//GEN-END:variables
void initialis_tab(){
    tb=new DefaultTableModel();
            tb_g_ens_cours.setModel(tb);

       Object colonne[]={"Cours","Departement","Faculté","Nombre d'heure","Année","Nom & Prenom du prof","Année Academique",
       "Date faite","Commentaire"};
     tb.setColumnIdentifiers(colonne);
     
        ResultSet rsi=connexiondata.extraireData("select *from enseignant_cours order by faculte");
        try {
            while(rsi.next()){
                Object[]ligne={rsi.getString("cours"),rsi.getString("departement"),rsi.getString("faculte"),rsi.getString("n_heure")
                ,rsi.getString("annee"),rsi.getString("nom_prof")+" "+rsi.getString("prenon_prof"),rsi.getString("anneeAcademique"),
                rsi.getString("date_modified"),rsi.getString("commentaire")};
                tb.addRow(ligne);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tb_gest_ens_cours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import class_ispg.connexiondata;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class sagFcours extends javax.swing.JInternalFrame {

    /**
     * Creates new form sagFcours
     */
    public sagFcours() {
        initComponents();
     ((BasicInternalFrameUI)getUI()).setNorthPane(null);
     charg_tab_cour();
       hide_fields();
    }

     nauvfchSal gui_fs;
    int row;
    String str1=null,str2=null,str3=null,str4=null;
        ResultSet rset=null;
      void charg_tab_cour(){
        DefaultTableModel dm=new DefaultTableModel();
        tab_cours.setModel(dm);
        rset=connexiondata.extraireData("select *from cours where sage_fem='"+true+"'");
        Object colonne[]={"Nom du cours","Année","Nombre d'Heure","Nombre de Crédit","Semestre","Date d'enregistrement"
        ,"Commentaires"};
        dm.setColumnIdentifiers(colonne);
        try {
            while(rset.next()){
               Object ligne[]={rset.getString("n_cours"),rset.getString("annee")
                ,rset.getString("n_heure"),rset.getString("credit"),rset.getString("semestre"),rset.getString("date_fixed"),
               rset.getString("commentaire")};
               dm.addRow(ligne);
            }
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(sagFcours.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   //hide all filds
   public void hide_fields(){
      jLabel1.setVisible(false);

      jLabel4.setVisible(false);
      jLabel6.setVisible(false);
      jLabel7.setVisible(false);
      jLabel8.setVisible(false);
      jLabel9.setVisible(false);
      txt_com_ed.setVisible(false);
      txt_cours_ed.setVisible(false);
      jLabel9.setVisible(false);
      slctAnn.setVisible(false);
      txt_nhr_ed.setVisible(false);
      txt_cr_ed.setVisible(false);
      slctSmstr.setVisible(false);
      btn_app.setEnabled(false);
     }
   void unhide(){
       btn_app.setEnabled(true);
       jLabel1.show();
      jLabel4.show();
      jLabel6.show();
      jLabel7.show();
      jLabel8.show();
      jLabel9.show();
      txt_com_ed.show();
      txt_cours_ed.show();
      slctAnn.show();
      txt_nhr_ed.show();
      txt_cr_ed.show();
      slctSmstr.show();
   }
   void play_tb_cours(){
       row=tab_cours.getSelectedRow();
        str1=tab_cours.getValueAt(row, 0).toString();
        str2=tab_cours.getValueAt(row, 1).toString();
        str3=tab_cours.getValueAt(row, 2).toString();
        str4=tab_cours.getValueAt(row, 4).toString();
        ResultSet rs=connexiondata.extraireData("select *from cours where n_cours='"+str1+"' && sage_fem='"+true+"'&& annee='"+str2+"' && "
                + "n_heure='"+str3+"' && semestre='"+str4+"'");
        try {
            while(rs.next()){
               txt_cours_ed.setText(rs.getString("n_cours"));
               slctAnn.removeAllItems();
               String ann=(rs.getString("annee"));
               String baci="BAC I";
               String bacii="BAC II";
               String baciii="BAC III";
               if(ann.equals(baci)){
                   slctAnn.addItem(ann);
                   slctAnn.addItem(bacii);
                   slctAnn.addItem(baciii);
                   
               }else if(ann.equals(bacii)){
                   slctAnn.addItem(ann);
                   slctAnn.addItem(baci);
                   slctAnn.addItem(baciii);
               }else{
                   slctAnn.addItem(baciii);
                   slctAnn.addItem(baci);
                   slctAnn.addItem(bacii);
               }
               
               txt_nhr_ed.setText(rs.getString("n_heure"));
               txt_cr_ed.setText(rs.getString("credit"));
               slctSmstr.removeAllItems();
               String sms=rs.getString("semestre");
               if(sms.equals("2")){
                   slctSmstr.addItem(sms);
                   slctSmstr.addItem("1");
               }else{
                  slctSmstr.addItem("1");
                  slctSmstr.addItem("2");
               }
               txt_com_ed.setText(rs.getString("commentaire"));
            }
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(sagFcours.class.getName()).log(Level.SEVERE, null, ex);
        }
                
   }
   public boolean check_fields(){
     return txt_cours_ed.getText().length()>0&&txt_nhr_ed.getText().length()>0&&txt_cr_ed.getText().length()>0; 
             
   }
   void vider(){
      txt_com_ed.setText("");
      txt_cours_ed.setText("");
      slctAnn.removeAllItems();
      slctAnn.addItem("BAC I");
      slctAnn.addItem("BAC II");
      slctAnn.addItem("BAC III");
      txt_nhr_ed.setText("");show();
      txt_cr_ed.setText("");
      slctSmstr.removeAllItems();
      slctSmstr.addItem("1");
      slctSmstr.addItem("2");
   }
    public void gerer_volumeHoraire(){
    
String s=txt_cr_ed.getText();
        
if(s.length()>0){
    txt_nhr_ed.setText(String.valueOf(Integer.parseInt(txt_cr_ed.getText())*15));
}
}  
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_ret = new javax.swing.JCheckBox();
        txt_search = new javax.swing.JTextField();
        btn_edit = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txt_cr_ed = new javax.swing.JTextField();
        slctAnn = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_cours_ed = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nhr_ed = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        slctSmstr = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_com_ed = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_cours = new javax.swing.JTable();
        btn_app = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        btn_ret.setText("Retirer");
        btn_ret.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ret.setEnabled(false);
        btn_ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retActionPerformed(evt);
            }
        });

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        btn_edit.setText("Editer");
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.setEnabled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre de crédit");

        txt_cr_ed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cr_edKeyTyped(evt);
            }
        });

        slctAnn.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        slctAnn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAC I", "BAC II", "BACIII" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Année");

        txt_cours_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cours_edActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cours");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Volume horaire");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        txt_nhr_ed.setEditable(false);
        txt_nhr_ed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nhr_edMouseClicked(evt);
            }
        });
        txt_nhr_ed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nhr_edKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Commentaire :");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Semestre");

        slctSmstr.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        slctSmstr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        txt_com_ed.setColumns(20);
        txt_com_ed.setLineWrap(true);
        txt_com_ed.setRows(5);
        txt_com_ed.setWrapStyleWord(true);
        txt_com_ed.setBorder(null);
        jScrollPane2.setViewportView(txt_com_ed);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tab_cours.setBackground(new java.awt.Color(0, 51, 51));
        tab_cours.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tab_cours.setForeground(new java.awt.Color(255, 255, 255));
        tab_cours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tab_cours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_coursMouseClicked(evt);
            }
        });
        tab_cours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tab_coursKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tab_cours);

        btn_app.setText("Appliquer");
        btn_app.setEnabled(false);
        btn_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_thumb_up_30px.png"))); // NOI18N
        btn_app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_appActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Fermer");
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_25px_1.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btn_ret, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(txt_nhr_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_cr_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_cours_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_app, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(slctAnn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(50, 50, 50)
                                    .addComponent(slctSmstr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_search)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_ret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(slctAnn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cours_ed)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slctSmstr, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cr_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nhr_ed)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_app, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retActionPerformed
        row=tab_cours.getSelectedRow();
        str1=tab_cours.getValueAt(row, 0).toString();
        str2=tab_cours.getValueAt(row, 1).toString();
        str3=tab_cours.getValueAt(row, 2).toString();
        str4=tab_cours.getValueAt(row, 4).toString();
        if(str1!=null &str2!=null&str3!=null&str4!=null){
            btn_app.setEnabled(true);
            hide_fields();
            btn_edit.setSelected(false);
            if(str1!=null||str2!=null||str3!=null){
                if(JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer le cours")==JOptionPane.OK_OPTION){
                    connexiondata.modifierDB("DELETE FROM cours WHERE n_cours='"+str1+"' &&sage_fem='"+true+"' && annee='"+str2+"'"
                        + "&& n_heure='"+str3+"' && credit='"+str4+"' ");
                    JOptionPane.showMessageDialog(this, "Supprimé");
                    charg_tab_cour();
                    btn_ret.setSelected(false);
                    btn_ret.setEnabled(false);
                    btn_edit.setEnabled(false);
                    vider();
                    hide_fields();
                }else{
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(this, "La suppression annulée","Message d'erreur",JOptionPane.ERROR_MESSAGE);
                    btn_ret.setSelected(false);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Séléctionner l'élément à retirer");
        }
        
    }//GEN-LAST:event_btn_retActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        DefaultTableModel def=(DefaultTableModel)tab_cours.getModel();
        TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(def);
        tab_cours.setRowSorter(trs);
        String st=txt_search.getText();
        trs.setRowFilter(RowFilter.regexFilter(st));
    }//GEN-LAST:event_txt_searchKeyTyped

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

        if(btn_edit.isSelected()){
            unhide();
            btn_ret.setSelected(false);
            btn_app.setEnabled(true);
            play_tb_cours();
        }else{
            hide_fields();
            vider();
            btn_app.setEnabled(false);

        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void txt_cr_edKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cr_edKeyTyped
        gui_fs=new nauvfchSal();
        gui_fs.format_field(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cr_edKeyTyped

    private void txt_cours_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cours_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cours_edActionPerformed

    private void txt_nhr_edKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nhr_edKeyTyped
        gui_fs=new nauvfchSal();
        gui_fs.format_field(evt); // TODO add your handling code here:
    }//GEN-LAST:event_txt_nhr_edKeyTyped

    private void tab_coursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_coursMouseClicked
        btn_ret.setEnabled(true);
        btn_edit.setEnabled(true);
    }//GEN-LAST:event_tab_coursMouseClicked

    private void tab_coursKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_coursKeyPressed

    }//GEN-LAST:event_tab_coursKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
gerer_volumeHoraire();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txt_nhr_edMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nhr_edMouseClicked
gerer_volumeHoraire();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nhr_edMouseClicked

    private void btn_appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_appActionPerformed
       row=tab_cours.getSelectedRow();
        str1=tab_cours.getValueAt(row, 0).toString();
        str2=tab_cours.getValueAt(row, 1).toString();
        str3=tab_cours.getValueAt(row, 2).toString();
        str4=tab_cours.getValueAt(row, 3).toString();

        if(str1.length()>0 &&str2.length()>0&&str3.length()>0&str4.length()>0){
            gerer_volumeHoraire();
            if(JOptionPane.showConfirmDialog(this, "Voulez-vous appliquer la modification?")==JOptionPane.OK_OPTION){
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date d=new Date();
                String dat=sdf.format(d);
                connexiondata.modifierDB("UPDATE cours SET n_cours='"+txt_cours_ed.getText().toUpperCase()+"'"
                    + ",annee='"+slctAnn.getSelectedItem()+"',n_heure='"+txt_nhr_ed.getText()+"',credit='"+txt_cr_ed.getText()+"',"
                    + "semestre='"+slctSmstr.getSelectedItem()+"',date_fixed='"+dat+"',commentaire='"+txt_com_ed.getText()+"'"
                    + "WHERE n_cours='"+str1+"'&&sage_fem='"+true+"' && annee='"+str2+"' && n_heure='"+str3+"' && credit='"+str4+"' ");
                charg_tab_cour();
                btn_edit.setSelected(false);
                btn_ret.setSelected(false);
                btn_ret.enable(false);
                btn_edit.setEnabled(false);
                btn_app.setEnabled(false);
            } else{
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "Action de modification refusé","Message d'erreur",JOptionPane.ERROR_MESSAGE);
                btn_edit.setSelected(false);
                btn_ret.setSelected(false);
            }
        }else{
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Elément introuvable","Message d'attention",JOptionPane.ERROR_MESSAGE);
            btn_edit.setSelected(false);
        }        
    }//GEN-LAST:event_btn_appActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        try {
            setClosed(true);        // TODO add your handling code here:
        } catch (PropertyVetoException ex) {
            Logger.getLogger(sagFcours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_app;
    private javax.swing.JCheckBox btn_edit;
    private javax.swing.JCheckBox btn_ret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> slctAnn;
    private javax.swing.JComboBox<String> slctSmstr;
    public static javax.swing.JTable tab_cours;
    private javax.swing.JTextArea txt_com_ed;
    private javax.swing.JTextField txt_cours_ed;
    private javax.swing.JTextField txt_cr_ed;
    private javax.swing.JTextField txt_nhr_ed;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}

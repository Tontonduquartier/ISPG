/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suivi;

import class_ispg.connexiondata;
import class_ispg.gerer_fenetre;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class AddPresence extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddPresence
     */
    public AddPresence() {
        initComponents();
        ((BasicInternalFrameUI)getUI()).setNorthPane(null);
        afficheEmpl();
        ebtnDep.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    DefaultTableModel df;
    int row=-1;
    final void afficheEmpl()
    {
        df=new DefaultTableModel();
        tableau.setModel(df);
        Object colonne[]={"Numéro matricule","Nom","prénom"};
        df.setColumnIdentifiers(colonne);
        ResultSet rs=connexiondata.extraireData("select n_matricule,nom,prenom from personel");
        try {
            while(rs.next())
            {
                Object lign[]={rs.getString("n_matricule"),rs.getString("nom"),rs.getString("prenom")};
                df.addRow(lign);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddPresence.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    //je vais enregistrer 
    int ro=-1;
int idEmpl()
{
    ro=tableau.getSelectedRow();
   if(ro>=0){
       String sid=tableau.getValueAt(ro, 0).toString();
       ResultSet rsu=connexiondata.extraireData("select idEmployer from personel where n_matricule='"+sid+"'");
        try {
            while(rsu.next()){
                return rsu.getInt("idEmployer");
            }
                } catch (SQLException ex) {
            Logger.getLogger(AddPresence.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   return -1;
}
//liste des presence 
void prensencList()
{
    df=new DefaultTableModel();
tableau.setModel(df);
 Object colonne[]={"Numéro matricule","Nom","prénom","Heure d'arriver","Heure de départ"};
 df.setColumnIdentifiers(colonne);
 ResultSet rset=connexiondata.extraireData("select n_matricule,nom ,prenom,heurArriver,heurDep from personel inner join presence "
         + "where personel.idEmployer=presence.idEmployer");
        try {
            while(rset.next()){
               Object[] line={rset.getString("n_matricule"),rset.getString("nom"),rset.getString("prenom"),
               rset.getString("heurArriver"),rset.getString("heurDep")}; 
               df.addRow(line);
               ebtnDep.setEnabled(true);
               btn_suppr.setEnabled(true);
            btnvalidate.setEnabled(false);
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(AddPresence.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        rech = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnvalidate = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        ebtnDep = new javax.swing.JRadioButton();
        btn_suppr = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableau = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_25px_1.png"))); // NOI18N
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        rech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rechKeyTyped(evt);
            }
        });

        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_25px.png"))); // NOI18N

        btnvalidate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnvalidate.setText("Valider la présence ");
        btnvalidate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvalidate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_approval_38px_1.png"))); // NOI18N
        btnvalidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvalidateActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton4.setText("Liste des présences");
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_list_30px_1.png"))); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        ebtnDep.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ebtnDep.setText("Enregister le départ");
        ebtnDep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ebtnDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Traveler_36px.png"))); // NOI18N
        ebtnDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebtnDepActionPerformed(evt);
            }
        });

        btn_suppr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_suppr.setText("Supprimer");
        btn_suppr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suppr.setEnabled(false);
        btn_suppr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_delete_25px_1.png"))); // NOI18N
        btn_suppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 229));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tableau.setBackground(new java.awt.Color(0, 51, 51));
        tableau.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tableau.setForeground(new java.awt.Color(255, 255, 255));
        tableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableau);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rech, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnvalidate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ebtnDep, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_suppr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE)))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rech, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnvalidate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ebtnDep, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_suppr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        try {
            this.setClosed(true);        
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AddPresence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnvalidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvalidateActionPerformed
ro=tableau.getSelectedRow();
        if(ro>=0){
    presence pre=new presence();

    if(JOptionPane.showConfirmDialog(this, "Voulez-vous valider la présence")==JOptionPane.OK_OPTION)
    {
        pre.setIdEmpl(idEmpl());
        pre.setHeurArriv(FormaterLaDate());
        pre.setHeurDepart(null);
                if(pre.Insertion()>0){
                    JOptionPane.showMessageDialog(this, "C'est fait merci!!");
               }else
                {
                 JOptionPane.showMessageDialog(this, "Il ya un problème d'insertion dans la présence","",JOptionPane.ERROR_MESSAGE);
 
                }
    }else
    {
     JOptionPane.showMessageDialog(this, "Non confirmé","",JOptionPane.ERROR_MESSAGE);

    }
}else
{
     JOptionPane.showMessageDialog(this, "Séléctionner une ligne en premier","",JOptionPane.ERROR_MESSAGE);
        
    }
 
    }//GEN-LAST:event_btnvalidateActionPerformed

    private void rechKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechKeyTyped
String s=rech.getText();
        gerer_fenetre.gererLaRecherche(tableau, df, rech, s);        // TODO add your handling code here:
    }//GEN-LAST:event_rechKeyTyped

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
prensencList();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void ebtnDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebtnDepActionPerformed
row=tableau.getSelectedRow();
if(row>=0){
    String supdate=tableau.getValueAt(row,3).toString();
     if(JOptionPane.showConfirmDialog(this, "Voulez-vous valider le départ?")==JOptionPane.OK_OPTION)
    {
//        SimpleDateFormat sf=new SimpleDateFormat("hh:mm:ss");
//        Date d=new Date();
//        String sdate=sf.format(d);
       connexiondata.modifierDB("update presence set heurDep='"+FormaterLaDate()+"' where heurArriver='"+supdate+"'");
      JOptionPane.showMessageDialog(this, "Bien fait\nmerci!!","",JOptionPane.INFORMATION_MESSAGE);
      prensencList();
      
      
    }else
    {
     JOptionPane.showMessageDialog(this, "Non confirmé","",JOptionPane.ERROR_MESSAGE);

    }
}else
{
     JOptionPane.showMessageDialog(this, "Séléctionner une ligne en premier","",JOptionPane.ERROR_MESSAGE);
        
    }


    }//GEN-LAST:event_ebtnDepActionPerformed

    private void btn_supprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprActionPerformed
row=tableau.getSelectedRow();
    if(row>=0)
    {
        String value=(String) tableau.getValueAt(row, 3);
        if(JOptionPane.showConfirmDialog(this, "êtes-vous sûr de la suppression","",JOptionPane.WARNING_MESSAGE)==JOptionPane.OK_OPTION)
        {
            connexiondata.modifierDB("delete from presence where heurArriver='"+value+"'");
               JOptionPane.showMessageDialog(this, "Succès");
               prensencList();
   
        }else{
       JOptionPane.showMessageDialog(this, "Echec de suppression\nPas de confirmation","",JOptionPane.ERROR_MESSAGE);
       prensencList();
        }
    }else
    {
    JOptionPane.showMessageDialog(this, "Séléctionner une ligne en premier","",JOptionPane.WARNING_MESSAGE);
     
    }
    }//GEN-LAST:event_btn_supprActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_suppr;
    private javax.swing.JRadioButton btnvalidate;
    private javax.swing.JRadioButton ebtnDep;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rech;
    private javax.swing.JTable tableau;
    // End of variables declaration//GEN-END:variables
String FormaterLaDate()
{
    Date Aujourdhui=new Date();
    DateFormat fullFormat=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.MEDIUM,new Locale("FR"));
    return fullFormat.format(Aujourdhui);
}
}

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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public final class addCongeUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form addConge
     */
    public addCongeUI() {
        initComponents();
        chargerleTableau();
        ((BasicInternalFrameUI)getUI()).setNorthPane(null);
 
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    DefaultTableModel dflt;
    void chargerleTableau()
    {
       dflt=new DefaultTableModel();
       listEmployer.setModel(dflt);
       Object col[]={"Numéro matricule","Nom","Pénom","Genre"};
       dflt.setColumnIdentifiers(col);
        ResultSet rst=connexiondata.extraireData("select n_matricule,nom,prenom,sexe from personel");
        try {
            while(rst.next())
            {
                Object[] row={rst.getString("n_matricule"),rst.getString("nom"),rst.getString("prenom"),rst.getString("sexe")};
                dflt.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(addCongeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getIDEmpl()
    {
        int i=listEmployer.getSelectedRow();
       String str=listEmployer.getValueAt(i, 0).toString();
        ResultSet rs=connexiondata.extraireData("select idEmployer from personel where n_matricule='"+str+"'");
        try {
            while(rs.next())
            {
                return Integer.parseInt(rs.getString("idEmployer"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(addCongeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    //valeur vraie si les champs qu'on va enregister ne sont pas vide
    
    public boolean isCompleted()
    {
       return dateAller.getDate()!=null && dateRet.getDate()!=null&&txtmotif.getText().length()>0;
    }
    //j'initialise les fields
    void initialiser(){
        txtMatricl.setText("");
        txtNom.setText("");
        txtpren.setText("");
        dateAller.setDate(null);
        dateRet.setDate(null);
        txtmotif.setText("");
        chargerleTableau();
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmotif = new javax.swing.JEditorPane();
        dateAller = new com.toedter.calendar.JDateChooser();
        dateRet = new com.toedter.calendar.JDateChooser();
        txtpren = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtMatricl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTypconge = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEmployer = new javax.swing.JTable();
        txtrechrch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numéro matricule :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom                       :");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prénom                  :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date de d'aller       :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date de retour   :");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Motif  :");

        txtmotif.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jScrollPane2.setViewportView(txtmotif);

        dateAller.setBackground(new java.awt.Color(0, 51, 51));
        dateAller.setForeground(new java.awt.Color(255, 255, 255));
        dateAller.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dateAllerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        dateRet.setBackground(new java.awt.Color(0, 51, 51));
        dateRet.setForeground(new java.awt.Color(255, 255, 255));
        dateRet.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dateRetAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dateRet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateRetMouseClicked(evt);
            }
        });

        txtpren.setEditable(false);
        txtpren.setBackground(new java.awt.Color(0, 51, 51));
        txtpren.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtpren.setForeground(new java.awt.Color(255, 255, 255));
        txtpren.setBorder(null);

        txtNom.setEditable(false);
        txtNom.setBackground(new java.awt.Color(0, 51, 51));
        txtNom.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNom.setForeground(new java.awt.Color(255, 255, 255));
        txtNom.setBorder(null);

        txtMatricl.setEditable(false);
        txtMatricl.setBackground(new java.awt.Color(0, 51, 51));
        txtMatricl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtMatricl.setForeground(new java.awt.Color(255, 255, 255));
        txtMatricl.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type du congé");

        txtTypconge.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtTypconge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annuel", "Maladie", "Prénatal", "Postnatal", "Circonstance", "Autre" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateRet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateAller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpren)
                            .addComponent(txtNom)
                            .addComponent(txtMatricl)
                            .addComponent(txtTypconge, 0, 147, Short.MAX_VALUE))))
                .addGap(156, 156, 156))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpren, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateAller, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateRet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTypconge, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));

        listEmployer.setBackground(new java.awt.Color(0, 0, 51));
        listEmployer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        listEmployer.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        listEmployer.setForeground(new java.awt.Color(255, 255, 255));
        listEmployer.setModel(new javax.swing.table.DefaultTableModel(
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
        listEmployer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEmployerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listEmployer);

        txtrechrch.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtrechrch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrechrchKeyTyped(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGif/PCSEARCH.GIF"))); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 51, 51));
        jRadioButton1.setText("Enregistrer");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setHideActionText(true);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_save_close_30px.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 51, 51));
        jRadioButton3.setText("Fermer");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.setHideActionText(true);
        jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_25px_1.png"))); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(txtrechrch, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1410, 1410, 1410))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtrechrch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addContainerGap(228, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrechrchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrechrchKeyTyped
         dflt = new DefaultTableModel();
        gerer_fenetre.gererLaRecherche(listEmployer, dflt, txtrechrch, title);        
    }//GEN-LAST:event_txtrechrchKeyTyped

    private void listEmployerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmployerMouseClicked
    int r=listEmployer.getSelectedRow();
        String s=listEmployer.getValueAt(r, 0).toString();
        ResultSet rs=connexiondata.extraireData("select n_matricule,nom,prenom from personel where n_matricule='"+s+"'");
        try {
            while(rs.next())
            {
                txtMatricl.setText(rs.getString("n_matricule"));
                txtNom.setText(rs.getString("nom"));
                txtpren.setText(rs.getString("prenom"));
            }
                
                } catch (SQLException ex) {
            Logger.getLogger(addCongeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_listEmployerMouseClicked

    private void dateAllerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dateAllerAncestorAdded
        Date d=new Date();
       
        dateAller.setMinSelectableDate(d);

    }//GEN-LAST:event_dateAllerAncestorAdded

    private void dateRetAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dateRetAncestorAdded

        Date d=new Date();
        dateRet.setMinSelectableDate(d);

    }//GEN-LAST:event_dateRetAncestorAdded

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
   if(isCompleted())
    {
        if(gererDateRange()){
        if(JOptionPane.showConfirmDialog(null, "Confirmer l'enregistrement")==JOptionPane.OK_OPTION)
        {         
        congeEmpl ce=new congeEmpl();
        ce.setIdEmployer(getIDEmpl());
        String s1=f.format(dateAller.getDate());
        String s2=f.format(dateRet.getDate());
        ce.setDateAller(s1);
        ce.setDateRetour(s2);
        ce.setMotif(txtmotif.getText());
        ce.setType(txtTypconge.getSelectedItem().toString());
       if(ce.Repos()>0){
           JOptionPane.showMessageDialog(this, "Fait avec succès!!");
           initialiser();
       }else{
           getToolkit().beep();
           
          JOptionPane.showMessageDialog(this, "Erreur d'enregistrement","Message d'erreur",JOptionPane.ERROR_MESSAGE);
         }
        }else{
         JOptionPane.showMessageDialog(this, "L'enregistrement non confirmé","",JOptionPane.WARNING_MESSAGE);
        }
}else{
            getToolkit().beep();
       JOptionPane.showMessageDialog(this, "Problème de la séléction des dates de retour","Attention!",JOptionPane.WARNING_MESSAGE);
        }
    }
        
else{
      getToolkit().beep();
     JOptionPane.showMessageDialog(null, "Veuillez séléctionner l'employer et completer les champs vides\n"
             + " comme la date de d'aller, la date de retour, le motif et le type du congé","Information", JOptionPane.INFORMATION_MESSAGE);   
        
    }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        try {
            setClosed(true);        // TODO add your handling code here:
        } catch (PropertyVetoException ex) {
            Logger.getLogger(addCongeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void dateRetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateRetMouseClicked
 dateRet.setMinSelectableDate(new Date());
    }//GEN-LAST:event_dateRetMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateAller;
    private com.toedter.calendar.JDateChooser dateRet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listEmployer;
    private javax.swing.JTextField txtMatricl;
    private javax.swing.JTextField txtNom;
    private javax.swing.JComboBox<String> txtTypconge;
    private javax.swing.JEditorPane txtmotif;
    private javax.swing.JTextField txtpren;
    private javax.swing.JTextField txtrechrch;
    // End of variables declaration//GEN-END:variables

    boolean gererDateRange()
    {
          Date d1=dateAller.getDate();
          Date d2=dateRet.getDate();
          long prDate=d1.getTime();
          long sndDate=d2.getTime();
         
             return (prDate<sndDate);      
    }
}

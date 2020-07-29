/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paiement;

import class_ispg.connexiondata;
import class_ispg.gerer_fenetre;
import gui.general_GUI;
import gui.gui_fiche_salaire;
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
import static paiement.paiement_tab.requestHist;
import static paiement.paiement_tab.requst;

/**
 *
 * @author HP
 */
public final class paiementUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form paiementUI
     */
    public paiementUI() {
        initComponents();
        chargerComboBox();
       
        //table historique
      p.charg_tabl(tbPayHist,requestHist);
      
      //charger la table last payed
      chargLab();
         p.charg_tabl(tbLastPay,requst);
       ((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        
    }
    paiement_tab p=new paiement_tab();
    int ro=-1;
    
//Je charge le combo box pour le choix du numero matricule
    
    public void chargerComboBox()
    {
        ResultSet r=connexiondata.extraireData("select idEmployer,n_matricule from personel  where idEmployer not in"
                + "(select idEmpl from paiement)");
        try {
            while (r.next())
            {
               selectMatr.addItem(r.getString("n_matricule"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(paiementUI.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    //J'initialise les texte affiche
    void InitialiseText(){
        txtire.setText("");
      txtNom.removeAllItems();
      
      txtPr.removeAllItems();
      txtSalTot.setText("");
       txtmut.setText("");
        txtFrInss.setText("");
        txtNetPay.setText("");
        txtpenC.setText("");
    }
    //j'affiche de nouveau mon interface graphique
    void replayMyUI(){
        general_GUI.deskpanne.removeAll();
        paiementUI p=new paiementUI();           
        general_GUI.deskpanne.add(p);
        try {
            p.setMaximum(true);
            p.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(paiementUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
      
    //recuperation de l'ID de l'employer
    String getIdEmployer(){
        String stringId=null;
       ResultSet id=connexiondata.extraireData("select idEmployer from personel where n_matricule='"+selectMatr.getSelectedItem()+"'");
        try {
            while(id.next()){
              stringId=id.getString("idEmployer");
            }} catch (SQLException ex) {
            Logger.getLogger(paiementUI.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    return stringId;
    }
    
    
    boolean check_salary(){
        return (txtSalTot.getText().length()>0&&txtFrInss.getText().length()>0&&txtmut.getText().length()>0
                &&txtNetPay.getText().length()>0&&txtpenC.getText().length()>0);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabedHist = new javax.swing.JTabbedPane();
        panNouv = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPren = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectMatr = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalTot = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFrInss = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmut = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNetPay = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JEditorPane();
        jLabel9 = new javax.swing.JLabel();
        txtpenC = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtire = new javax.swing.JLabel();
        txtNom = new javax.swing.JComboBox<>();
        txtPr = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        panDer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        removeHist = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLastPay = new javax.swing.JTable();
        panHist = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPayHist = new javax.swing.JTable();

        TabedHist.setBackground(new java.awt.Color(102, 102, 102));
        TabedHist.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        TabedHist.setOpaque(true);
        TabedHist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabedHistMouseClicked(evt);
            }
        });

        panNouv.setForeground(new java.awt.Color(153, 153, 255));

        txtPren.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel1.setText("Nom                           :");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel2.setText("Prénom               :");

        selectMatr.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        selectMatr.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        selectMatr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectMatrItemStateChanged(evt);
            }
        });
        selectMatr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMatrMouseClicked(evt);
            }
        });
        selectMatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMatrActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel4.setText(" Matricule                :");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel5.setText("Net  à payer              :");

        txtSalTot.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtSalTot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalTot.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel6.setText("Frais d' INSS         :");

        txtFrInss.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtFrInss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFrInss.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel7.setText("Frais de Mutualité     :");

        txtmut.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtmut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtmut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel8.setText("Salaire brut             :");

        txtNetPay.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtNetPay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNetPay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));

        txtComment.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jScrollPane4.setViewportView(txtComment);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel9.setText("Commentaire");

        txtpenC.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtpenC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtpenC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel10.setText("Frais de pension complementaire     :");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel11.setText("Impot(I.R.E)    :");

        txtire.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtire.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));

        txtNom.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtNom.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtNom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtNomItemStateChanged(evt);
            }
        });
        txtNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomMouseClicked(evt);
            }
        });
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtPr.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        txtPr.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtPr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtPrItemStateChanged(evt);
            }
        });
        txtPr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrMouseClicked(evt);
            }
        });
        txtPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtPrenLayout = new javax.swing.GroupLayout(txtPren);
        txtPren.setLayout(txtPrenLayout);
        txtPrenLayout.setHorizontalGroup(
            txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtPrenLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(txtPrenLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNetPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpenC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNom, 0, 163, Short.MAX_VALUE)
                    .addComponent(txtSalTot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMatr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPrenLayout.createSequentialGroup()
                        .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPrenLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFrInss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtmut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPr, 0, 200, Short.MAX_VALUE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        txtPrenLayout.setVerticalGroup(
            txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPrenLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFrInss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(txtSalTot, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNetPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmut, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpenC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtire, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(txtPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(txtPren);

        jRadioButton1.setText("Enregister le paiement");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton1.setHideActionText(true);
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_save_25px.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Quitter le paiement");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_exit_25px_1.png"))); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Voir le fiche salaire");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_last_quarter_25px.png"))); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Recommencer le paiemement");
        jRadioButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_restart_25px.png"))); // NOI18N
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton11.setText("Synchroniser");
        jRadioButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_synchronize_30px.png"))); // NOI18N
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNouvLayout = new javax.swing.GroupLayout(panNouv);
        panNouv.setLayout(panNouvLayout);
        panNouvLayout.setHorizontalGroup(
            panNouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNouvLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(panNouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panNouvLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton8)
                        .addGap(28, 28, 28)
                        .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1316, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        panNouvLayout.setVerticalGroup(
            panNouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNouvLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panNouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        TabedHist.addTab("Nouveau", panNouv);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        removeHist.setBackground(new java.awt.Color(0, 51, 51));
        removeHist.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        removeHist.setForeground(new java.awt.Color(255, 255, 255));
        removeHist.setText("Retirer");
        removeHist.setToolTipText("");
        removeHist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        removeHist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_delete_48px.png"))); // NOI18N
        removeHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeHistActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Imprimer");
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_print_48px_1.png"))); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Exporter comme excel");
        jRadioButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_ms_excel_48px.png"))); // NOI18N
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton10.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Actualiser");
        jRadioButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refresh_48px.png"))); // NOI18N
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(removeHist)
                .addGap(50, 50, 50)
                .addComponent(jRadioButton4)
                .addGap(38, 38, 38)
                .addComponent(jRadioButton5)
                .addGap(39, 39, 39)
                .addComponent(jRadioButton10)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(removeHist)))
                .addContainerGap())
        );

        jScrollPane6.setBorder(null);

        jPanel4.setPreferredSize(new java.awt.Dimension(1500, 533));

        tbLastPay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbLastPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLastPayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbLastPay);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel4);

        javax.swing.GroupLayout panDerLayout = new javax.swing.GroupLayout(panDer);
        panDer.setLayout(panDerLayout);
        panDerLayout.setHorizontalGroup(
            panDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panDerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );
        panDerLayout.setVerticalGroup(
            panDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDerLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabedHist.addTab("Dernier paiement", panDer);

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jRadioButton6.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Imprimer");
        jRadioButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_print_48px_1.png"))); // NOI18N
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Exporter comme excel");
        jRadioButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_ms_excel_48px.png"))); // NOI18N
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Actualiser");
        jRadioButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refresh_48px.png"))); // NOI18N
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton9))
                .addGap(27, 27, 27))
        );

        jScrollPane5.setBorder(null);

        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 446));

        jScrollPane3.setBorder(null);

        tbPayHist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPayHist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPayHistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbPayHist);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel3);

        javax.swing.GroupLayout panHistLayout = new javax.swing.GroupLayout(panHist);
        panHist.setLayout(panHistLayout);
        panHistLayout.setHorizontalGroup(
            panHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panHistLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        panHistLayout.setVerticalGroup(
            panHistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHistLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabedHist.addTab("Historique ", panHist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabedHist)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabedHist, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void selectMatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMatrActionPerformed
    }//GEN-LAST:event_selectMatrActionPerformed
    private void selectMatrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMatrMouseClicked
    }//GEN-LAST:event_selectMatrMouseClicked
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
if(check_salary())
{
    Date aujour=new Date();
    DateFormat forma=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM,Locale.FRANCE);
    String ladate=forma.format(aujour);
        Addpaiement addp=new Addpaiement();
        if(JOptionPane.showConfirmDialog(null, "Voulez-vous faire l'enregistrement")==JOptionPane.OK_OPTION)
         {

         if(getIdEmployer().length()>0)
          {
              addp.setIdEmpl(Integer.parseInt(getIdEmployer()));
              addp.setSalTot(Integer.parseInt(txtSalTot.getText()));
              addp.setSalPay(Integer.parseInt(txtNetPay.getText()));
              addp.setFrinss(Integer.parseInt(txtFrInss.getText()));
              addp.setFrmut(Integer.parseInt(txtmut.getText()));
              addp.setFrpensc(Integer.parseInt(txtpenC.getText()));
              addp.setDate_paye(ladate);
              System.out.println(ladate);
              
              addp.setCommentaire(txtComment.getText());
         
          if(addp.insert_paiement()>0&&addp.insert_historiqe()>0)
              {
             JOptionPane.showMessageDialog(null, "Succès", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
             replayMyUI();
             
              }
          else 
          {
              JOptionPane.showMessageDialog(null, "La personne existe déjà", "Erreur", JOptionPane.ERROR_MESSAGE);
            
          }
         
         }
         else
           {
                 JOptionPane.showMessageDialog(null, "Aucun personne trouvé","", JOptionPane.WARNING_MESSAGE);
           }
        }
    else
    {
   JOptionPane.showMessageDialog(null, "Refus d'insertion", "", JOptionPane.ERROR_MESSAGE);

    }
}else{
       JOptionPane.showMessageDialog(null, "Les champs sont vide", "", JOptionPane.ERROR_MESSAGE);

}
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
gui_fiche_salaire gf=new gui_fiche_salaire();
general_GUI.deskpanne.removeAll();
general_GUI.deskpanne.add(gf);
        try {
            gf.setMaximum(true);
            gf.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(paiementUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        try
        {
            this.setClosed(true);       
        } catch (PropertyVetoException ex) {
            Logger.getLogger(paiementUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void selectMatrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectMatrItemStateChanged
        chargLab();        // TODO add your handling code here:
    }//GEN-LAST:event_selectMatrItemStateChanged

    private void TabedHistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabedHistMouseClicked
    }//GEN-LAST:event_TabedHistMouseClicked

    private void removeHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeHistActionPerformed
    
     ro=tbLastPay.getSelectedRow();
     if(ro>=0){
          p.RemovePaiement(tbLastPay,ro);
          p.charg_tabl(tbLastPay,requst);
          p.selectedVar=null;
          ro=-1;
     }else{
         getToolkit().beep();
         JOptionPane.showMessageDialog(this,"Sélectionner une ligne","",JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_removeHistActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        gerer_fenetre.ImprimerLaTable(tbLastPay);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        gerer_fenetre.export(tbLastPay, ".xls");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "La liste du dernier paiement faite va être archivé.\nVeuillez confirmer","Attention",
                JOptionPane.INFORMATION_MESSAGE);
        if(JOptionPane.showConfirmDialog(null, "Êtes-vous sûr?")==JOptionPane.OK_OPTION)
        {
         connexiondata.modifierDB("truncate table paiement");
         JOptionPane.showMessageDialog(null, "Les données sont détruites ");
        }else{
         getToolkit().beep();
         JOptionPane.showMessageDialog(null, "Les données ne sont pas détruites ","",JOptionPane.ERROR_MESSAGE);
 
        }
        

        
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
         p.charg_tabl(tbLastPay,requst);
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        p.charg_tabl(tbPayHist,requestHist);
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        gerer_fenetre.export(tbPayHist, ".xls");        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        gerer_fenetre.ImprimerLaTable(tbPayHist);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void tbPayHistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPayHistMouseClicked
int row=tbPayHist.getSelectedRow();  
if(row>=0)
{
 p.setSelectedVar((String) tbPayHist.getValueAt(row,11));
}
    }//GEN-LAST:event_tbPayHistMouseClicked

    private void tbLastPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLastPayMouseClicked
  int  row=tbLastPay.getSelectedRow();
        if(row>=0){
        p.setSelectedVar((String) tbLastPay.getValueAt(row, 11)); 
        }
    }//GEN-LAST:event_tbLastPayMouseClicked

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
replayMyUI();
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void txtNomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtNomItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomItemStateChanged

    private void txtNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomMouseClicked

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtPrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtPrItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrItemStateChanged

    private void txtPrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrMouseClicked

    private void txtPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabedHist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panDer;
    private javax.swing.JPanel panHist;
    private javax.swing.JPanel panNouv;
    private javax.swing.JRadioButton removeHist;
    public javax.swing.JComboBox<String> selectMatr;
    private javax.swing.JTable tbLastPay;
    private javax.swing.JTable tbPayHist;
    private javax.swing.JEditorPane txtComment;
    private javax.swing.JLabel txtFrInss;
    private javax.swing.JLabel txtNetPay;
    public javax.swing.JComboBox<String> txtNom;
    public javax.swing.JComboBox<String> txtPr;
    private javax.swing.JPanel txtPren;
    private javax.swing.JLabel txtSalTot;
    private javax.swing.JLabel txtire;
    private javax.swing.JLabel txtmut;
    private javax.swing.JLabel txtpenC;
    // End of variables declaration//GEN-END:variables

    // on charge les label
    String s;
    
    
    public synchronized void chargLab()
    {
         s=(String) selectMatr.getSelectedItem();
        
        ResultSet  rslt=connexiondata.extraireData("select n_matricule,nom,prenom,qualification,salBase,indm_log,indm_depl,alloc_fam,indam_grade,"
                   + "prime,sal_brut,insspers,insspatr,inssrisquepro,mutualiteperso,mutualitepatro,pensCompl,sal_impos,"
                   + "ire,avanc_sal,retSurSal,netpayable,netApay,dateEnr"
                   + " from personel inner join fiche_salaire where(personel.idEmployer=fiche_salaire.idEmployer and personel.n_matricule='"+s+"')");
           InitialiseText();
     try {
        while(rslt.next()){
         
         txtNom.addItem(rslt.getString("nom"));
         txtPr.addItem(rslt.getString("prenom"));
        
//               int ent=rslt.getInt("salBase")+
//               rslt.getInt("indm_log")+rslt.getInt("indm_depl")+rslt.getInt("alloc_fam")+ rslt.getInt("indam_grade")
//               +rslt.getInt("prime")+rslt.getInt("sal_brut")+
//               +rslt.getInt("sal_impos")+rslt.getInt("avanc_sal")+
//               rslt.getInt("retSurSal"); 
             
                
//               int salTot=ent+frInss+frmut+pensc+imp;
 
               txtSalTot.setText(""+rslt.getInt("netpayable"));
               txtNetPay.setText(""+rslt.getInt("netApay"));
               int frInss=rslt.getInt("insspers")+rslt.getInt("insspatr")+rslt.getInt("inssrisquepro");
               int frmut=rslt.getInt("mutualiteperso")+rslt.getInt("mutualitepatro");
               int pensc=rslt.getInt("pensCompl");
               int imp=rslt.getInt("ire");
               txtFrInss.setText(""+frInss);
               txtmut.setText(""+frmut);
               txtpenC.setText(""+pensc);
               txtire.setText(""+imp);
               
        } 
    } 
     catch (SQLException ex)
     {
            Logger.getLogger(paiementUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //je recupere l'id de l'employer
   
    int getMyId()
    { 
     String matricule=selectMatr.getSelectedItem().toString();
    String name=txtNom.getSelectedItem().toString();
    String pren=txtPr.getSelectedItem().toString();
    int id=-1;
        ResultSet myident=connexiondata.extraireData("select idEmployer from personel where n_matricule='"+matricule+"' and nom='"+name+"' and prenom='"+pren+"'");
        try {
            while(myident.next())
            {
                id=myident.getInt("idEmployer");
                System.out.println(""+id);
                return id;
            } } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this,"L'employé n'a pas été trouvé","Information",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
         return id;
    }
 
}



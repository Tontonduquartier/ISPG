

package gui;

import home.home;
import class_ispg.connexiondata;
import class_ispg.gerer_fenetre;
import java.beans.PropertyVetoException;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import myProf.AddMyPrSI;
import myProf.AddMyprSF;
import myProf.AddMyprSP;
import myProf.AddprDC;
import paiement.paiementUI;
import paiement.paiement_tab;
import suivi.AddPresence;
import suivi.addCongeUI;
import suivi.gestListCong;
import tables.tb_employers;
import tables.tb_history;

/**
 *
 * @author HP
 */
public final class general_GUI extends javax.swing.JFrame {

    /**
     * Creates new form general_GUI
     */
    public general_GUI() {
        initComponents();
        clon_var();
          gerer_fenetre.centrer_fenetre(this);
          getHome();
    
         this.setIconImage(new ImageIcon(getClass().getResource("skull.png")).getImage());

    }
    
    void getHome(){
        home h=new home();
        deskpanne.removeAll();
        deskpanne.add(h);
        try {
            h.setMaximum(true);
            h.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskpanne = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator32 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenuItem30 = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        jMenuItem31 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jMenuItem32 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem24 = new javax.swing.JMenuItem();
        jSeparator33 = new javax.swing.JPopupMenu.Separator();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JPopupMenu.Separator();
        jMenuItem37 = new javax.swing.JMenuItem();

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        scroll.setViewportView(table);

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        deskpanne.setBackground(new java.awt.Color(153, 153, 153));
        deskpanne.setNextFocusableComponent(deskpanne);
        deskpanne.setOpaque(false);
        deskpanne.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout deskpanneLayout = new javax.swing.GroupLayout(deskpanne);
        deskpanne.setLayout(deskpanneLayout);
        deskpanneLayout.setHorizontalGroup(
            deskpanneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        deskpanneLayout.setVerticalGroup(
            deskpanneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(deskpanne);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        jMenu1.setBackground(new java.awt.Color(0, 51, 51));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_employee_card_30px.png"))); // NOI18N
        jMenu1.setText("Employer  ");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenu10.setForeground(new java.awt.Color(0, 0, 153));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_contract_job_30px_1.png"))); // NOI18N
        jMenu10.setText("Nouveau Employer ");
        jMenu10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_men_age_group_5_25px.png"))); // NOI18N
        jMenuItem18.setText("Direction");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem18);
        jMenu10.add(jSeparator14);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_classroom_25px.png"))); // NOI18N
        jMenuItem7.setText("Enseignant");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);
        jMenu10.add(jSeparator32);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_housekeeper_male_25px.png"))); // NOI18N
        jMenuItem13.setText("Travailleurs");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenu1.add(jMenu10);
        jMenu1.add(jSeparator5);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_list_30px_1.png"))); // NOI18N
        jMenuItem2.setText("Liste de tous les  empoyers ");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 51, 51));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cash_in_hand_30px_1.png"))); // NOI18N
        jMenu2.setText("Fiche Salaire");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem14.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem14.setText("Ajouter nouveau");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);
        jMenu2.add(jSeparator15);

        jMenuItem8.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem8.setText(" Fiche Salaire des employers");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 51, 51));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_classroom_30px.png"))); // NOI18N
        jMenu3.setText("Enseigant");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenu7.setForeground(new java.awt.Color(0, 0, 153));
        jMenu7.setText("Ajouter un ensignant en ");

        jMenuItem29.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem29.setText("Santé Public (SP)");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem29);
        jMenu7.add(jSeparator19);

        jMenuItem30.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem30.setText("Sage Femme (SF)");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem30);
        jMenu7.add(jSeparator20);

        jMenuItem31.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem31.setText("Soins Infirmier (SI)");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem31);
        jMenu7.add(jSeparator21);

        jMenuItem32.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem32.setText("Développement Communautaire (DC)");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem32);

        jMenu3.add(jMenu7);
        jMenu3.add(jSeparator1);

        jMenuItem1.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem1.setText("Nouveau enseigant");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 51, 51));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_courses_30px.png"))); // NOI18N
        jMenu4.setText("Cours   ");
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenu13.setForeground(new java.awt.Color(0, 0, 153));
        jMenu13.setText("Nouveau cours en");

        jMenuItem21.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem21.setText("Santé Public (SP)");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem21);
        jMenu13.add(jSeparator8);

        jMenuItem22.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem22.setText("Sage Femme (SF)");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem22);
        jMenu13.add(jSeparator9);

        jMenuItem23.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem23.setText("Soins Infirmier (SI)");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem23);
        jMenu13.add(jSeparator7);

        jMenuItem24.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem24.setText("Développement Communautaire (DC)");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem24);

        jMenu4.add(jMenu13);
        jMenu4.add(jSeparator33);

        jMenu12.setForeground(new java.awt.Color(0, 0, 153));
        jMenu12.setText("Liste des cours en");

        jMenuItem9.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem9.setText("Santé Public (SP)");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem9);
        jMenu12.add(jSeparator4);

        jMenuItem10.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem10.setText("Sage Femme (SF)");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem10);
        jMenu12.add(jSeparator25);

        jMenuItem20.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem20.setText("Soins Infirmier (SI)");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem20);
        jMenu12.add(jSeparator6);

        jMenuItem19.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem19.setText("Développement Communautaire (DC)");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem19);

        jMenu4.add(jMenu12);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 51, 51));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refund_30px.png"))); // NOI18N
        jMenu5.setText("Paiement   ");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem15.setText("Nouveau paiement");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);
        jMenu5.add(jSeparator11);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem4.setText("Paiement du mois");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);
        jMenu5.add(jSeparator10);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem16.setText("Historique ");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);
        jMenu5.add(jSeparator2);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem17.setText("Recommencer le paiement pour ce mois");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(0, 51, 51));
        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_following_30px.png"))); // NOI18N
        jMenu6.setText("Suivi");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem27.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_present_25px.png"))); // NOI18N
        jMenuItem27.setText("Ajouter les Présences");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem27);
        jMenu6.add(jSeparator13);

        jMenuItem28.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Traveler_25px.png"))); // NOI18N
        jMenuItem28.setText("Ajouter un Congé");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);
        jMenu6.add(jSeparator30);

        jMenuItem37.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_list_20px_1.png"))); // NOI18N
        jMenuItem37.setText("Liste des congés");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem37);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

    paiementUI paiem=new paiementUI();
    deskpanne.removeAll();
    deskpanne.repaint();
    deskpanne.add(paiem);
        try {
            paiem.setMaximum(true);
            paiem.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        paiement_tab pt=new paiement_tab();
        deskpanne.removeAll();
        deskpanne.repaint();
        deskpanne.add(pt);
        try {
            pt.setMaximum(true);
            pt.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
tb_history his=new tb_history();
     general_GUI.deskpanne.removeAll();
     general_GUI.deskpanne.repaint();
     general_GUI.deskpanne.add(his);
        try {
            his.setMaximum(true);
            his.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(paiement_tab.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
 sagFcours cdep=new sagFcours();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
  sagFemmeUI sgf=new sagFemmeUI();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(sgf);
        try {
            sgf.setMaximum(true);
            sgf.show();
            
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
 cours_devC cdep=new cours_devC();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
 soinfUI cdep=new soinfUI();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
 devComUI cdep=new devComUI();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 AjoutEns ens=new AjoutEns();
       deskpanne.removeAll();
       deskpanne.add(ens);
        try {
            ens.setMaximum(true);
            ens.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        tb_employers tb=new tb_employers();
        deskpanne.removeAll();
        deskpanne.repaint();
        deskpanne.add(tb);
        try {
            tb.setMaximum(true);
            tb.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        ajTrav tr=new ajTrav();
        deskpanne.removeAll();
        deskpanne.repaint();
        deskpanne.add(tr);
        try {
            tr.setMaximum(true);
            tr.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        AjoutEns ens=new AjoutEns();
        deskpanne.removeAll();
        deskpanne.add(ens);
        try {
            ens.setMaximum(true);
            ens.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

        persoGUI pg=new persoGUI();
        deskpanne.removeAll();
        deskpanne.repaint();
        deskpanne.add(pg);
        try {
            pg.setMaximum(true);
            pg.show();

        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItem13ActionPerformed
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
     nauvfchSal n=new nauvfchSal();
     deskpanne.removeAll();
     deskpanne.add(n);
        try {
            n.setMaximum(true);
            n.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
 tb_cors cdep=new tb_cors();
 deskpanne.removeAll();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
 soinfTab cdep=new soinfTab();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
 DevCotb cdep=new DevCotb();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
gui_fiche_salaire gf=new gui_fiche_salaire();
deskpanne.removeAll();
deskpanne.repaint();
deskpanne.add(gf);
        try {
            gf.setMaximum(true);
            gf.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
AddMyprSP sp=new AddMyprSP();
deskpanne.removeAll();
deskpanne.repaint();
deskpanne.add(sp);
        try {
            sp.setMaximum(true);
            sp.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
AddMyprSF sf=new AddMyprSF();
deskpanne.removeAll();
deskpanne.repaint();
deskpanne.add(sf);
        try {
            sf.setMaximum(true);
            sf.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem30ActionPerformed
    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
AddMyPrSI si=new AddMyPrSI();
deskpanne.removeAll();
deskpanne.repaint();
deskpanne.add(si);
        try {
            si.setMaximum(true);
            si.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem31ActionPerformed
    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
AddprDC dc=new AddprDC();
deskpanne.removeAll();
deskpanne.repaint();
deskpanne.add(dc);
        try {
            dc.setMaximum(true);
            dc.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        getToolkit().beep();
        JOptionPane.showMessageDialog(null, "La liste du dernier paiement faite va être archivé.\nVeuillez confirmer","Attention",
                JOptionPane.INFORMATION_MESSAGE);
        if(JOptionPane.showConfirmDialog(null, "Êtes-vous sûr?")==JOptionPane.OK_OPTION)
        {
         connexiondata.modifierDB("truncate table paiement");
         JOptionPane.showMessageDialog(null, "Les données sont détruites ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Les données ne sont pas détruites ");
        } 
        
      

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
AddPresence p=new AddPresence();
deskpanne.removeAll();
deskpanne.add(p);
        try {
            p.setMaximum(true);
            p.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
  p.show();
      
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
    addCongeUI c=new addCongeUI();
    deskpanne.removeAll();
    deskpanne.add(c);
        try {
            c.setMaximum(true);
            c.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
gestListCong co=new gestListCong();
deskpanne.removeAll();
deskpanne.add(co);
        try {
            co.setMaximum(true);
            co.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(general_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(general_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(general_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(general_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new general_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane deskpanne;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator25;
    private javax.swing.JPopupMenu.Separator jSeparator30;
    private javax.swing.JPopupMenu.Separator jSeparator32;
    private javax.swing.JPopupMenu.Separator jSeparator33;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
DefaultTableModel ft;
        public void matable(String requet){
        ft =new DefaultTableModel();
         Object colonne[]={"Numero matricule","Nom","Prenom","Sexe","Date de naissance","Nationalité","Colline/Qartier","Zone","Commune","Province",
       "Nom du Banque","Numero Bancaire","Type de contrat","Date Embauché"};
      table.setModel(ft);
      ft.setColumnIdentifiers(colonne);
       ResultSet rs=connexiondata.extraireData(requet);
        try {
            while(rs.next()){
                
                Object []lign={rs.getString("n_matricule"),rs.getString("nom"),rs.getString("prenom"), rs.getString("sexe"),
                    rs.getString("date_naissance"),rs.getString("nationalite"),rs.getString("col_naissance"),rs.getString("commune"),
                    rs.getString("province"),rs.getString("banque"),rs.getString("n_compte"),rs.getString("typecontrat"),rs.getString("date_embaucher")};

                  ft.addRow(lign);
            }   } catch (SQLException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        
        
     void clon_var()
        {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String datinstr="2019-08-23";
            Date d=new Date();
        try {
            Date d2=sdf.parse(datinstr);
            long last=d2.getTime();
            long limit=d.getTime();
                        
            while(last<limit||last==limit){
            JOptionPane.showMessageDialog(null,"Votre logiciel a expiré\ncontacter le super administrateur pour "
                    + "obtenir l'aide", "Erreur 606", JOptionPane.ERROR_MESSAGE);
            }
         
        } catch (ParseException ex) {
            Logger.getLogger(general_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}

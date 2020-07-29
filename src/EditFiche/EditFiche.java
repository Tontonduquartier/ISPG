/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditFiche;

import class_ispg.connexiondata;
import class_ispg.fiche_salaire;
import com.sun.glass.events.KeyEvent;
import gui.general_GUI;
import gui.gui_fiche_salaire;
import gui.nauvfchSal;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author HP
 */
public class EditFiche extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditFiche
     */
    public EditFiche() {
        initComponents();
        ((BasicInternalFrameUI)getUI()).setNorthPane(null);
    }
    nauvfchSal n=new nauvfchSal();
    gui_fiche_salaire g;
    public String existant;
    SimpleDateFormat df;
//format entier
      public  void format_field(java.awt.event.KeyEvent evt){
          char c=evt.getKeyChar();
           if(!((c>='0')&&(c<='9')||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
           evt.consume();
         JOptionPane.showMessageDialog(this, "Essayer avec les entiers seulement");
        
     }
  }

     public void charg_label(){
       ResultSet r;
       String string=combo_matri.getSelectedItem().toString();
       r=connexiondata.extraireData("select nom,prenom from personel where n_matricule='"+string+"'");
        try {
            while(r.next()){

                txt_lab_nom.setText(r.getString("nom"));
                txt_lab_prenom.setText(r.getString("prenom"));
            }} catch (SQLException ex) 
            {
            Logger.getLogger(gui_fiche_salaire.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_indmn_dep = new javax.swing.JTextField();
        combo_matri = new javax.swing.JComboBox<>();
        txt_prime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_sal_av = new javax.swing.JTextField();
        txt_qual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_lab_nom = new javax.swing.JLabel();
        txt_mutperso = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_net_pay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_sal_br = new javax.swing.JTextField();
        txt_indmn_grad = new javax.swing.JTextField();
        txt_Ret_sur_sal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_commentaire = new javax.swing.JTextArea();
        txt_alloc_fam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_lab_prenom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_indmn_log = new javax.swing.JTextField();
        txt_inssPerso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtsalbase = new javax.swing.JTextField();
        txtmarie = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txtnEnfant = new javax.swing.JSpinner();
        txtPensCompl = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtIRE = new javax.swing.JTextField();
        txtpayabl = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_inssPens = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_inssprof = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_mutpatr = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_salimpos = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Date_enr = new javax.swing.JLabel();
        btn_enr_fiche = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setText("Indaminité de grade");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel13.setText("Mutualité/Personnel            :");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        txt_indmn_dep.setEditable(false);
        txt_indmn_dep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_indmn_dep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_indmn_dep.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_indmn_dep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_indmn_dep.setOpaque(false);
        txt_indmn_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_indmn_depMouseClicked(evt);
            }
        });
        txt_indmn_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_indmn_depActionPerformed(evt);
            }
        });
        txt_indmn_dep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_indmn_depKeyTyped(evt);
            }
        });

        combo_matri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo_matri.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_matriItemStateChanged(evt);
            }
        });
        combo_matri.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                combo_matriHierarchyChanged(evt);
            }
        });
        combo_matri.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                combo_matriAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        combo_matri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_matriMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_matriMousePressed(evt);
            }
        });
        combo_matri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_matriActionPerformed(evt);
            }
        });

        txt_prime.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_prime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_prime.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_prime.setOpaque(false);
        txt_prime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_primeMouseClicked(evt);
            }
        });
        txt_prime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_primeActionPerformed(evt);
            }
        });
        txt_prime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primeKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setText(" INSS/Personnel                  :");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        txt_sal_av.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_sal_av.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_sal_av.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_sal_av.setOpaque(false);
        txt_sal_av.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_sal_avMouseClicked(evt);
            }
        });
        txt_sal_av.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sal_avActionPerformed(evt);
            }
        });
        txt_sal_av.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sal_avKeyTyped(evt);
            }
        });

        txt_qual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_qual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_qual.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_qual.setOpaque(false);
        txt_qual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_qualKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Nom                                  :");

        txt_lab_nom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_lab_nom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_lab_nom.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_lab_nom.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_lab_nomAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txt_mutperso.setEditable(false);
        txt_mutperso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_mutperso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mutperso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_mutperso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_mutperso.setOpaque(false);
        txt_mutperso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_mutpersoMouseClicked(evt);
            }
        });
        txt_mutperso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mutpersoKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setText("Avance sur salaire ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("Qualification");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText("Indamnité de déplacement  :");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setText("Salaire brut                           :");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setText("Prime de fonction   ");

        txt_net_pay.setEditable(false);
        txt_net_pay.setBackground(new java.awt.Color(255, 255, 255));
        txt_net_pay.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_net_pay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_net_pay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_net_pay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_net_pay.setOpaque(false);
        txt_net_pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_net_payMouseClicked(evt);
            }
        });
        txt_net_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_net_payKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Commentaire :");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel16.setText("Retenus sur salaires                   :");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel17.setText("Net à payer                               :");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        txt_sal_br.setEditable(false);
        txt_sal_br.setBackground(new java.awt.Color(255, 255, 255));
        txt_sal_br.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_sal_br.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_sal_br.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_sal_br.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_sal_br.setOpaque(false);
        txt_sal_br.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_sal_brMouseClicked(evt);
            }
        });
        txt_sal_br.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sal_brKeyTyped(evt);
            }
        });

        txt_indmn_grad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_indmn_grad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_indmn_grad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_indmn_grad.setOpaque(false);
        txt_indmn_grad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_indmn_gradMouseClicked(evt);
            }
        });
        txt_indmn_grad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_indmn_gradActionPerformed(evt);
            }
        });
        txt_indmn_grad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_indmn_gradKeyTyped(evt);
            }
        });

        txt_Ret_sur_sal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_Ret_sur_sal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Ret_sur_sal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_Ret_sur_sal.setOpaque(false);
        txt_Ret_sur_sal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_Ret_sur_salMouseClicked(evt);
            }
        });
        txt_Ret_sur_sal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Ret_sur_salKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Numero matricule");

        jScrollPane2.setBorder(null);

        txt_commentaire.setColumns(20);
        txt_commentaire.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_commentaire.setRows(5);
        txt_commentaire.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_commentaire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_commentaire.setOpaque(false);
        jScrollPane2.setViewportView(txt_commentaire);

        txt_alloc_fam.setBackground(new java.awt.Color(255, 255, 255));
        txt_alloc_fam.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txt_alloc_fam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_alloc_fam.setBorder(null);
        txt_alloc_fam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_alloc_fam.setOpaque(false);
        txt_alloc_fam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_alloc_famMouseClicked(evt);
            }
        });
        txt_alloc_fam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_alloc_famKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Prénom                            :");

        txt_lab_prenom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_lab_prenom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_lab_prenom.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_lab_prenom.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_lab_prenomAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Indamnité de logement     :");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        txt_indmn_log.setEditable(false);
        txt_indmn_log.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_indmn_log.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_indmn_log.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_indmn_log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_indmn_log.setOpaque(false);
        txt_indmn_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_indmn_logMouseClicked(evt);
            }
        });
        txt_indmn_log.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_indmn_logKeyTyped(evt);
            }
        });

        txt_inssPerso.setEditable(false);
        txt_inssPerso.setBackground(new java.awt.Color(255, 255, 255));
        txt_inssPerso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_inssPerso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_inssPerso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_inssPerso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_inssPerso.setOpaque(false);
        txt_inssPerso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_inssPersoMouseClicked(evt);
            }
        });
        txt_inssPerso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inssPersoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Allocation familiale              :");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel18.setText("Salaire de Base    ");

        txtsalbase.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtsalbase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsalbase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txtsalbase.setOpaque(false);
        txtsalbase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsalbaseKeyTyped(evt);
            }
        });

        txtmarie.setText("Marié ?");
        txtmarie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel19.setText("Nombre d'enfant en charge  :");

        txtnEnfant.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtnEnfant.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtnEnfant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPensCompl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPensCompl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPensCompl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txtPensCompl.setOpaque(false);
        txtPensCompl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPensComplMouseClicked(evt);
            }
        });
        txtPensCompl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPensComplKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel20.setText("Pension Complémentaire");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel21.setText("Impôt sur revenu d'emploi (IRE): ");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        txtIRE.setEditable(false);
        txtIRE.setBackground(new java.awt.Color(255, 255, 255));
        txtIRE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIRE.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txtIRE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIRE.setOpaque(false);
        txtIRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIREMouseClicked(evt);
            }
        });
        txtIRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIREKeyTyped(evt);
            }
        });

        txtpayabl.setEditable(false);
        txtpayabl.setBackground(new java.awt.Color(255, 255, 255));
        txtpayabl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtpayabl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpayabl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txtpayabl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtpayabl.setOpaque(false);
        txtpayabl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpayablMouseClicked(evt);
            }
        });
        txtpayabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayablActionPerformed(evt);
            }
        });
        txtpayabl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpayablKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel22.setText("Net Payable                              :");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        txt_inssPens.setEditable(false);
        txt_inssPens.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_inssPens.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_inssPens.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_inssPens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_inssPens.setOpaque(false);
        txt_inssPens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_inssPensMouseClicked(evt);
            }
        });
        txt_inssPens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inssPensKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel23.setText(" INSS pension                    : ");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        txt_inssprof.setEditable(false);
        txt_inssprof.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_inssprof.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_inssprof.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_inssprof.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_inssprof.setOpaque(false);
        txt_inssprof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_inssprofMouseClicked(evt);
            }
        });
        txt_inssprof.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inssprofKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel24.setText("INSS risque professionnel  :");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        txt_mutpatr.setEditable(false);
        txt_mutpatr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_mutpatr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mutpatr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_mutpatr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_mutpatr.setOpaque(false);
        txt_mutpatr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_mutpatrMouseClicked(evt);
            }
        });
        txt_mutpatr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mutpatrKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel25.setText("Mutualité/Patronal                :");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        txt_salimpos.setEditable(false);
        txt_salimpos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_salimpos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_salimpos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        txt_salimpos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_salimpos.setOpaque(false);
        txt_salimpos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_salimposMouseClicked(evt);
            }
        });
        txt_salimpos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salimposKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel26.setText(" Salaire imposable               :");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Georgia Pro Light", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setText("Date d'enregistrement était  :");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        Date_enr.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Date_enr.setForeground(new java.awt.Color(0, 0, 102));
        Date_enr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Date_enr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Date_enrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_indmn_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_lab_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_lab_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_matri, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_qual, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnEnfant, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtsalbase, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(txt_indmn_log)
                                            .addComponent(txt_indmn_grad)
                                            .addComponent(txt_prime, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_salimpos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txt_mutperso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_mutpatr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPensCompl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_inssprof)
                            .addComponent(txt_sal_br)
                            .addComponent(txt_alloc_fam)
                            .addComponent(txt_inssPens)
                            .addComponent(txt_inssPerso)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txtmarie, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(55, 55, 55))
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_net_pay)
                                    .addComponent(txtIRE, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(txtpayabl)
                                    .addComponent(txt_Ret_sur_sal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_sal_av)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Date_enr, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date_enr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_matri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_alloc_fam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_sal_br, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIRE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_lab_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_inssPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sal_av, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_lab_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_qual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_inssPens, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpayabl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_indmn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_indmn_grad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mutperso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsalbase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_inssprof, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_net_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_salimpos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Ret_sur_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_indmn_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mutpatr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_prime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPensCompl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(txtmarie)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnEnfant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(115, 115, 115))
        );

        jScrollPane1.setViewportView(jPanel1);

        btn_enr_fiche.setBackground(new java.awt.Color(0, 0, 51));
        btn_enr_fiche.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_enr_fiche.setForeground(new java.awt.Color(255, 255, 255));
        btn_enr_fiche.setText("Confirmer la modification");
        btn_enr_fiche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_enr_fiche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_checkmark_25px_1.png"))); // NOI18N
        btn_enr_fiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enr_ficheActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 51));
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Fermer");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_25px_1.png"))); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(btn_enr_fiche, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enr_fiche)
                    .addComponent(jRadioButton2))
                .addGap(55, 55, 55))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGap(102, 102, 102)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enr_ficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enr_ficheActionPerformed
classEdit c=new classEdit();
Date d=new Date();
DateFormat forma=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.MEDIUM,new Locale("FR"));
String date=forma.format(d);
c.setQualif(txt_qual.getText());
c.setSalbase(salBase());
c.setIndamLog(indamLog());
c.setIndamDep(indamdeplacement());
c.setAllocFam(allocatFam());
c.setIndamGrad(indamgrad());
c.setPrimeFonct(prime());
c.setSalBrut(salbrut());
c.setInssPerso(inssPerso());
c.setInssPatro(insspatr());
c.setInssRisq(inssrisqueprofessionel());
c.setMutPerso(mutperso());
c.setMutPatro(mutpatronal());
c.setPensCompl(penscompl());
c.setSalImpos(salimposable());
c.setIre(impot());

c.setAvancSal(avancSurSal());
c.setRetSurSal(retSurSal());
c.setNetPayabl(netPayable());
c.setNetApayer(netApayer());

c.setDateEnreg(date);
c.setExistVal(Date_enr.getText());
c.setCommentaire(txt_commentaire.getText());

if(c.EditerFile()>0){
    JOptionPane.showMessageDialog(this, "La fiche a été modifié");
    general_GUI.deskpanne.removeAll();
    g=new gui_fiche_salaire();
    general_GUI.deskpanne.add(g);
    try {
        g.setMaximum(true);
        g.show();
    } catch (PropertyVetoException ex) {
        Logger.getLogger(EditFiche.class.getName()).log(Level.SEVERE, null, ex);
    }
}else{
    getToolkit().beep();
    JOptionPane.showMessageDialog(null, "La fiche n'a pas été modifié","Message d'erreur",JOptionPane.ERROR_MESSAGE);

}

    }//GEN-LAST:event_btn_enr_ficheActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        try {
            setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(EditFiche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        txt_mutperso.setText(""+mutperso());
    }//GEN-LAST:event_jLabel13MouseClicked

    private void txt_indmn_depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_indmn_depMouseClicked
        txt_indmn_dep.setText(""+indamdeplacement());
    }//GEN-LAST:event_txt_indmn_depMouseClicked

    private void txt_indmn_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_indmn_depActionPerformed
        txt_indmn_dep.setText(""+indamdeplacement());
    }//GEN-LAST:event_txt_indmn_depActionPerformed

    private void txt_indmn_depKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_indmn_depKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_indmn_depKeyTyped

    private void combo_matriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_matriItemStateChanged
        charg_label();
    }//GEN-LAST:event_combo_matriItemStateChanged

    private void combo_matriHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_combo_matriHierarchyChanged

    }//GEN-LAST:event_combo_matriHierarchyChanged

    private void combo_matriAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_combo_matriAncestorAdded

    }//GEN-LAST:event_combo_matriAncestorAdded

    private void combo_matriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_matriMouseClicked

    }//GEN-LAST:event_combo_matriMouseClicked

    private void combo_matriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_matriMousePressed

    }//GEN-LAST:event_combo_matriMousePressed

    private void combo_matriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_matriActionPerformed

    }//GEN-LAST:event_combo_matriActionPerformed

    private void txt_primeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_primeMouseClicked

    }//GEN-LAST:event_txt_primeMouseClicked

    private void txt_primeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_primeActionPerformed

    }//GEN-LAST:event_txt_primeActionPerformed

    private void txt_primeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primeKeyTyped
        format_field(evt);
        if(txt_prime.getText().length()>7){
            evt.consume();
        }
    }//GEN-LAST:event_txt_primeKeyTyped

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        txt_inssPerso.setText(""+inssPerso());
    }//GEN-LAST:event_jLabel11MouseClicked

    private void txt_sal_avMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_sal_avMouseClicked

    }//GEN-LAST:event_txt_sal_avMouseClicked

    private void txt_sal_avActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sal_avActionPerformed

    }//GEN-LAST:event_txt_sal_avActionPerformed

    private void txt_sal_avKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sal_avKeyTyped
        format_field(evt);
        if(txtsalbase.getText().length()>7){
            evt.consume();
        }
    }//GEN-LAST:event_txt_sal_avKeyTyped

    private void txt_qualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qualKeyTyped

    }//GEN-LAST:event_txt_qualKeyTyped

    private void txt_lab_nomAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_lab_nomAncestorAdded

    }//GEN-LAST:event_txt_lab_nomAncestorAdded

    private void txt_mutpersoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mutpersoMouseClicked
        txt_mutperso.setText(""+mutperso());
    }//GEN-LAST:event_txt_mutpersoMouseClicked

    private void txt_mutpersoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mutpersoKeyTyped
        format_field(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mutpersoKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        txt_indmn_dep.setText(""+indamdeplacement());
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        txt_sal_br.setText(""+salbrut());
    }//GEN-LAST:event_jLabel10MouseClicked

    private void txt_net_payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_net_payMouseClicked
        txt_net_pay.setText(""+netApayer());
    }//GEN-LAST:event_txt_net_payMouseClicked

    private void txt_net_payKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_net_payKeyTyped
        format_field(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txt_net_payKeyTyped

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        txt_net_pay.setText(""+netApayer());
    }//GEN-LAST:event_jLabel17MouseClicked

    private void txt_sal_brMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_sal_brMouseClicked
        txt_sal_br.setText(""+salbrut());
    }//GEN-LAST:event_txt_sal_brMouseClicked

    private void txt_sal_brKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sal_brKeyTyped
        format_field(evt);
    }//GEN-LAST:event_txt_sal_brKeyTyped

    private void txt_indmn_gradMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_indmn_gradMouseClicked

    }//GEN-LAST:event_txt_indmn_gradMouseClicked

    private void txt_indmn_gradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_indmn_gradActionPerformed

    }//GEN-LAST:event_txt_indmn_gradActionPerformed

    private void txt_indmn_gradKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_indmn_gradKeyTyped
        format_field(evt);
        if(txt_indmn_grad.getText().length()>7)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_indmn_gradKeyTyped

    private void txt_Ret_sur_salMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Ret_sur_salMouseClicked

    }//GEN-LAST:event_txt_Ret_sur_salMouseClicked

    private void txt_Ret_sur_salKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Ret_sur_salKeyTyped
        format_field(evt);
        if(txt_Ret_sur_sal.getText().length()>7){
            evt.consume();
        }
    }//GEN-LAST:event_txt_Ret_sur_salKeyTyped

    private void txt_alloc_famMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_alloc_famMouseClicked
        txt_alloc_fam.setText(""+allocatFam());
    }//GEN-LAST:event_txt_alloc_famMouseClicked

    private void txt_alloc_famKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alloc_famKeyTyped
        format_field(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alloc_famKeyTyped

    private void txt_lab_prenomAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_lab_prenomAncestorAdded

    }//GEN-LAST:event_txt_lab_prenomAncestorAdded

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        txt_indmn_log.setText(""+indamLog());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txt_indmn_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_indmn_logMouseClicked
        txt_indmn_log.setText(""+indamLog());
    }//GEN-LAST:event_txt_indmn_logMouseClicked

    private void txt_indmn_logKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_indmn_logKeyTyped
        format_field(evt);
    }//GEN-LAST:event_txt_indmn_logKeyTyped

    private void txt_inssPersoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_inssPersoMouseClicked
        txt_inssPerso.setText(""+inssPerso());
    }//GEN-LAST:event_txt_inssPersoMouseClicked

    private void txt_inssPersoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inssPersoKeyTyped
        format_field(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inssPersoKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        txt_alloc_fam.setText(""+allocatFam());
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtsalbaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalbaseKeyTyped
        format_field(evt);
        if(txtsalbase.getText().length()>7){
            evt.consume();
        }
    }//GEN-LAST:event_txtsalbaseKeyTyped

    private void txtPensComplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPensComplMouseClicked

    }//GEN-LAST:event_txtPensComplMouseClicked

    private void txtPensComplKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPensComplKeyTyped
        format_field(evt);
        if(txtsalbase.getText().length()>7)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtPensComplKeyTyped

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        txtIRE.setText(""+impot());
    }//GEN-LAST:event_jLabel21MouseClicked

    private void txtIREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIREMouseClicked
        txtIRE.setText(""+impot());
    }//GEN-LAST:event_txtIREMouseClicked

    private void txtIREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIREKeyTyped

    }//GEN-LAST:event_txtIREKeyTyped

    private void txtpayablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpayablMouseClicked
        txtpayabl.setText(""+netPayable());
    }//GEN-LAST:event_txtpayablMouseClicked

    private void txtpayablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayablActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayablActionPerformed

    private void txtpayablKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpayablKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayablKeyTyped

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        txtpayabl.setText(""+netPayable());
    }//GEN-LAST:event_jLabel22MouseClicked

    private void txt_inssPensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_inssPensMouseClicked
        txt_inssPens.setText(""+insspatr());
    }//GEN-LAST:event_txt_inssPensMouseClicked

    private void txt_inssPensKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inssPensKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inssPensKeyTyped

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        txt_inssPens.setText(""+insspatr());
    }//GEN-LAST:event_jLabel23MouseClicked

    private void txt_inssprofMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_inssprofMouseClicked
        txt_inssprof.setText(""+inssrisqueprofessionel());

    }//GEN-LAST:event_txt_inssprofMouseClicked

    private void txt_inssprofKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inssprofKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inssprofKeyTyped

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        txt_inssprof.setText(""+inssrisqueprofessionel());
    }//GEN-LAST:event_jLabel24MouseClicked

    private void txt_mutpatrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mutpatrMouseClicked
        txt_mutpatr.setText(""+mutpatronal());
    }//GEN-LAST:event_txt_mutpatrMouseClicked

    private void txt_mutpatrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mutpatrKeyTyped

    }//GEN-LAST:event_txt_mutpatrKeyTyped

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        txt_mutpatr.setText(""+mutpatronal());
    }//GEN-LAST:event_jLabel25MouseClicked

    private void txt_salimposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salimposMouseClicked
        txt_salimpos.setText(""+salimposable());
    }//GEN-LAST:event_txt_salimposMouseClicked

    private void txt_salimposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salimposKeyTyped

    }//GEN-LAST:event_txt_salimposKeyTyped

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        txt_salimpos.setText(""+salimposable());
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void Date_enrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Date_enrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Date_enrMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Date_enr;
    private javax.swing.JRadioButton btn_enr_fiche;
    public javax.swing.JComboBox<String> combo_matri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txtIRE;
    public javax.swing.JTextField txtPensCompl;
    public javax.swing.JTextField txt_Ret_sur_sal;
    public javax.swing.JTextField txt_alloc_fam;
    public javax.swing.JTextArea txt_commentaire;
    public javax.swing.JTextField txt_indmn_dep;
    public javax.swing.JTextField txt_indmn_grad;
    public javax.swing.JTextField txt_indmn_log;
    public javax.swing.JTextField txt_inssPens;
    public javax.swing.JTextField txt_inssPerso;
    public javax.swing.JTextField txt_inssprof;
    public javax.swing.JLabel txt_lab_nom;
    public javax.swing.JLabel txt_lab_prenom;
    public javax.swing.JTextField txt_mutpatr;
    public javax.swing.JTextField txt_mutperso;
    public javax.swing.JTextField txt_net_pay;
    public javax.swing.JTextField txt_prime;
    public javax.swing.JTextField txt_qual;
    public javax.swing.JTextField txt_sal_av;
    public javax.swing.JTextField txt_sal_br;
    public javax.swing.JTextField txt_salimpos;
    private javax.swing.JRadioButton txtmarie;
    private javax.swing.JSpinner txtnEnfant;
    public javax.swing.JTextField txtpayabl;
    public javax.swing.JTextField txtsalbase;
    // End of variables declaration//GEN-END:variables

/*
    1)salaire de base
gestion des salaires par les fonctions de calcul et retoure les valeur
 2)calcul Indamnité de logement  c-à-d 60% de la salaire de base
*/     
boolean verifsalbase()
{
   return txtsalbase.getText().length()>0;
}
int salBase()
{
    if(verifsalbase())
        return (Integer.parseInt(txtsalbase.getText()));
    else
        return 0;
   
    
}


int indamLog()
{
    if(salBase()>0)
       {
        
         return ((salBase()*60)/100);
       }
 
 return 0;  
}
/*
3) calcul de l'Indemnité de déplacement soit 15% de la salaire de base

*/
int indamdeplacement(){
        return((salBase()*15)/100);
  }
/*  
5) calcul d'Allocation familliale si on la radio button selectioné on a la valeur 5000fr si non sa valeur est 0fr
le nombre d'enfant en charge par defaut est 0
*/
int allocatFam(){
    int fraisConjoin;
    int enfant=(int)txtnEnfant.getValue();
    if(txtmarie.isSelected())
    {
        fraisConjoin=5000;
        return ((enfant*2000)+fraisConjoin); 
        
    }else{
      return 0;
    }  
}
/*
indamnite de grade et la prime de fonction n'ont pas de formule par defaut ses valeurs est 0
    indamnite de grade d'abord et la prime 
*/

int indamgrad(){
    if(txt_indmn_grad.getText().length()>0)
        return Integer.parseInt(txt_indmn_grad.getText());
   return 0;
}
/*
    la prime de fonction:pas de formule
*/
int prime(){
    if(txt_prime.getText().length()>0)
        return (Integer.parseInt(txt_prime.getText()));
   return 0;
}
/*
    calcul de la salaire brute
    7)  la salaire brute =salairebase + indam de log + indam depl + prime fonct + alloc fam + indam grade

*/
int salbrut()
{  
      return   ((salBase())+prime()+indamgrad()+indamLog()+indamdeplacement());
}
/*
    calcul de l'inss personel c-a-d 18mille  pour ceux qui recoivent 450 mille et plus 
    si non c'est du 4% salaire brut - allocation familiale
*/
int inssPerso()
{
    if(salbrut()>allocatFam())
    {
        if((salbrut()-allocatFam())>450000)
        {
             return 18000;
        }else{
            return (int) ((4*(salbrut()-allocatFam()))/100);
        }
        
    }else{
          return 0;
    }   
}
/*
    frais d'inss pension ou patronal =27mille  pour ceux qui recoivent 450 mille et plus 
si non c'est du 6% salaire brut - allocation familiale
*/
int insspatr()
{
    if(salbrut()>allocatFam())
    {
        if((salbrut()-allocatFam())>450000)
        {
             return 27000;
        }else{
            return (int) ((6*(salbrut()-allocatFam()))/100);
        }
        
    }else{
      
        return 0;
    } 
}

/*
    frais d'inss professionel =2400fr  pour ceux qui recoivent 80 mille et plus 
    si non c'est du 3% salaire brut - allocation familiale
*/
int inssrisqueprofessionel()
{
    if(salbrut()>allocatFam())
    {
        if((salbrut()-allocatFam())>80000)
        {
             return 2400;
        }else{
            return (int) ((3*(salbrut()-allocatFam()))/100);
        }
        
    }else{
    
        return 0;
    }  
}

/*
    mutualite personnel= 4% du salaire brut -(indam logement+allocation familliale)
*/
int mutperso()
{
    int val=(int) (indamLog()+allocatFam());
    if(salbrut()>val)
    {
        return (int) ((4*(salbrut()-val))/100);
    }else
    {
        return 0;
    }   
}
/*
    mutualite patronal= 5% du salaire brut -(indam logement+allocation familliale)
*/
int mutpatronal()
  {
   int valeur=(int) (indamLog()+allocatFam());
    if(salbrut()>valeur)
    {
        return (int) ((6*(salbrut()-valeur))/100);
    }else
    {
        return 0;
    }       
 }
/*
    pension complementaire sa valeur par defaut est 0
*/
int penscompl(){
    if(txtPensCompl.getText().length()>0){
        return (Integer.parseInt(txtPensCompl.getText()));
    }
   return 0;
}
/*
    la salaire imposable
*/

 int salimposable()
{
  int mavaleur=(indamLog()+indamdeplacement()+inssPerso()+mutperso()+penscompl());
  if(salbrut()>mavaleur){
      return (salbrut()-mavaleur);
  }
  else{
     return 0; 
   }   
}
/*
    calcul de l'impot sur les revenus I.R.E si salaire imposable est entre 150 mille et 300 mille
    I.R.E=20% de (salaire imposable-150mille) si nom I.R.E=14% de((salaire imposable-300mille)+30mille)
*/
int impot(){
    int a;
    if(150000<=salimposable()&& salimposable()<300000)
    {
         a=((20*(salimposable()-150000))/100);
         return a;
    }else{
        if(300000<=salimposable()){
            a=(30*((salimposable()-300000)+30000)/100);
                return a;
        }
        else{
            return 0; 
        }   
    }
  
}

/*
    Net payable
*/
int netPayable(){
    
  int autresal=(int) (inssPerso()+mutperso()+penscompl()+impot());
  if(salbrut()>autresal){
    return (int) (salbrut()-autresal);
  }else{
 return 0;
  }
    
}
/*
    retenu sur salaire
*/
int retSurSal(){
    if(txt_Ret_sur_sal.getText().length()>0){
        return Integer.parseInt(txt_Ret_sur_sal.getText());
    }
        return 0;
}
/*
    avance sur salaire
*/
int avancSurSal()
{
    if(txt_sal_av.getText().length()>0)
        return Integer.parseInt(txt_sal_av.getText());
    return 0;    
}
/*
    net à payer=net payable-(avance sur salaire + retenu sur salaire)
*/
int netApayer()
{
    int ent=avancSurSal()+retSurSal();
    if(netPayable()>=ent)
        return netPayable()-ent;
   else
        return 0;
    
}

}

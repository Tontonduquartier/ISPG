/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myProf;

import class_ispg.connexiondata;
import class_ispg.gerer_fenetre;
import gui.cours_devC;
import static gui.general_GUI.deskpanne;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public final class AddMyprSP extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddMyprSP
     */
    public AddMyprSP() {
        initComponents();
        ((BasicInternalFrameUI)getUI()).setNorthPane(null);
        chargetbleEns();
        playTableCours();
        chargerEnsCours();
        
    }
    //Declaration des variable utilisable
    SimpleDateFormat dt;
    int num_row=-1,ens=-1;
    String mtrcl,nomcours,annee;
    boolean retirer=false,relier=false,editer=false;
    DefaultTableModel deft;
    
 
    //je charge la table des cours
    public void chargetbleEns(){ 
        deft=new DefaultTableModel();
        Object colonne[]={"Numero matricule","Nom","Prénom"};
        tb_ens.setModel(deft);
        deft.setColumnIdentifiers(colonne);
      
        ResultSet res=connexiondata.extraireData("select n_matricule,nom,prenom from personel where enseignant='"+true+"' order by nom");
        try {
            while(res.next())
            {
                Object[] ligne={res.getString("n_matricule"),res.getString("nom"),res.getString("prenom")};
               deft.addRow(ligne);
                
            }
                }
        catch (SQLException ex)
        {
            Logger.getLogger(AddMyprSP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //chargement de la table des cours
    public void playTableCours(){
        deft=new DefaultTableModel();
        tb_cours.setModel(deft);
       Object []colon={"Cours","Année","Volume Horaire","Nombre de crédit","Semestre"};
       deft.setColumnIdentifiers(colon);
       ResultSet r=connexiondata.extraireData("select n_cours,annee,n_heure,credit,semestre from cours where sant_pub='"+true+"' order by annee");
        try {
            while(r.next()){
                Object[] line={r.getString("n_cours"),r.getString("annee"),r.getString("n_heure"),r.getString("credit")
                ,r.getString("semestre")};
                deft.addRow(line);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddMyprSP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // je veux retourner le cle primaire de la table des employers
    int getPrimaryEmpl(){
       int a=0;
       ens=tb_ens.getSelectedRow();
       mtrcl=(String) tb_ens.getValueAt(ens,0);
       ResultSet res=connexiondata.extraireData("select idEmployer from personel where enseignant='"+true+"'&& n_matricule='"+mtrcl+"'");
        try {
            while(res.next()){
                a=res.getInt("idEmployer");
                return a;  
            }
               
        } catch (SQLException ex) {
            
            Logger.getLogger(AddMyprSP.class.getName()).log(Level.SEVERE, null, ex);
         
        }
         return a; 
   }
   //ici je veux retourner cle primaire de la table cours
    int getPrimaryCours(){
       num_row =tb_cours.getSelectedRow();
       nomcours=new String();
       annee=new String();
       nomcours=tb_cours.getValueAt(num_row,0).toString();
       annee=tb_cours.getValueAt(num_row, 1).toString();
       
       ResultSet resulta=connexiondata.extraireData("select idCours from cours where sant_pub='"+true+"'&& n_cours='"+nomcours+"'&& annee='"+annee+"'");
        try {
            while(resulta.next()){
                int b=resulta.getInt("idCours");
                return b;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddMyprSP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
}

   public boolean selectedtableEnseignant(){
       
         ens=tb_ens.getSelectedRow();
       return ens>=0;
   }
 //  je  veux retourner la valeur vraie si la ligne de la table des cours a ete selectionne
  boolean selectedTableCours(){
      num_row=tb_cours.getSelectedRow();
      return num_row>=0;
  }
  //retour de la variable suivant le numero de la table dont on veux faire la recherche des donnees
  
int a=0;
//  int Entierselected()
//  {
//    if(frdList.isSelected())
//    {
//        return 1;
//    }
//     if(sndList.isSelected())
//     {
//            return 2;
//     }
//      
//    if(prList.isSelected())
//    {
//                return 3;
//    }
//     return -1;      
//}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_cours = new javax.swing.JTable();
        srchCours = new javax.swing.JTextField();
        radio_Relier1 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ens = new javax.swing.JTable();
        radio_Relier = new javax.swing.JRadioButton();
        radio_ret = new javax.swing.JRadioButton();
        radio_edit = new javax.swing.JRadioButton();
        srchEns_cours = new javax.swing.JTextField();
        btnApp = new javax.swing.JRadioButton();
        btnIgnore = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        srchEns_cours1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_ensCours = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        printFile = new javax.swing.JLabel();
        excelFile = new javax.swing.JLabel();
        pr_select = new javax.swing.JCheckBox();
        d_select = new javax.swing.JCheckBox();
        tr_select = new javax.swing.JCheckBox();
        all_select = new javax.swing.JCheckBox();

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des cours en Santé Public", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tb_cours.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_cours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_coursMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_cours);

        srchCours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchCoursActionPerformed(evt);
            }
        });
        srchCours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srchCoursKeyTyped(evt);
            }
        });

        radio_Relier1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        radio_Relier1.setForeground(new java.awt.Color(0, 0, 102));
        radio_Relier1.setText("Nouveau cours");
        radio_Relier1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radio_Relier1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        radio_Relier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGif/GAESTEBO.GIF"))); // NOI18N
        radio_Relier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_Relier1ActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGif/PCSEARCH.GIF"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(srchCours, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(radio_Relier1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srchCours, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radio_Relier1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste de tous les Professeurs", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tb_ens.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_ens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_ens);

        radio_Relier.setText("Attribuer");
        radio_Relier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_RelierActionPerformed(evt);
            }
        });

        radio_ret.setText("Retirer");
        radio_ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_retActionPerformed(evt);
            }
        });

        radio_edit.setText("Editer");
        radio_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_editActionPerformed(evt);
            }
        });

        srchEns_cours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchEns_coursActionPerformed(evt);
            }
        });
        srchEns_cours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srchEns_coursKeyTyped(evt);
            }
        });

        btnApp.setText("Appliquer");
        btnApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_save_25px.png"))); // NOI18N
        btnApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppActionPerformed(evt);
            }
        });

        btnIgnore.setText("Ignorer");
        btnIgnore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_event_declined_30px.png"))); // NOI18N
        btnIgnore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgnoreActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGif/PCSEARCH.GIF"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        srchEns_cours1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchEns_cours1ActionPerformed(evt);
            }
        });
        srchEns_cours1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srchEns_cours1KeyTyped(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGif/PCSEARCH.GIF"))); // NOI18N
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(srchEns_cours1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApp)
                .addGap(40, 40, 40)
                .addComponent(btnIgnore)
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(radio_Relier, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radio_edit)
                        .addGap(37, 37, 37)
                        .addComponent(radio_ret, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(srchEns_cours, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srchEns_cours, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_Relier)
                    .addComponent(radio_edit)
                    .addComponent(radio_ret))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnApp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgnore))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(srchEns_cours1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Professeurs en Santé Publique et leurs cours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        tb_ensCours.setAutoCreateRowSorter(true);
        tb_ensCours.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_ensCours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ensCoursMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_ensCours);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Séléctionner les données à exporter en bas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        printFile.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        printFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_print_25px.png"))); // NOI18N
        printFile.setText("Imprimer");
        printFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printFileMouseClicked(evt);
            }
        });

        excelFile.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        excelFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_ms_excel_30px.png"))); // NOI18N
        excelFile.setText("Exporter comme  Fichier excel");
        excelFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excelFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelFileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                excelFileMouseEntered(evt);
            }
        });

        pr_select.setText("La liste des professeurs");
        pr_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pr_selectActionPerformed(evt);
            }
        });

        d_select.setText("La liste des cours ");
        d_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_selectActionPerformed(evt);
            }
        });

        tr_select.setText("Liste des Professeurs en Santé Publique et leurs cours");
        tr_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_selectActionPerformed(evt);
            }
        });

        all_select.setText("Tous les liste");
        all_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(all_select, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_select, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pr_select, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(tr_select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printFile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(excelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(619, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pr_select)
                .addGap(18, 18, 18)
                .addComponent(d_select)
                .addGap(18, 18, 18)
                .addComponent(tr_select)
                .addGap(31, 31, 31)
                .addComponent(all_select)
                .addGap(18, 18, 18)
                .addComponent(printFile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void srchCoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchCoursActionPerformed
    }//GEN-LAST:event_srchCoursActionPerformed
    private void tb_ensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ensMouseClicked
    }//GEN-LAST:event_tb_ensMouseClicked

    private void tb_coursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_coursMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_tb_coursMouseClicked

    private void radio_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_editActionPerformed
                editer=true;
                radio_ret.setSelected(false);
                radio_Relier.setSelected(false);
          
 //       getSelectedRadio();
    }//GEN-LAST:event_radio_editActionPerformed

    private void radio_RelierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_RelierActionPerformed
            relier=true;
            radio_edit.setSelected(false);
            radio_ret.setSelected(false);
       // getSelectedRadio();        // TODO add your handling code here:
    }//GEN-LAST:event_radio_RelierActionPerformed

    private void radio_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_retActionPerformed
             retirer=true;
             radio_Relier.setSelected(false);
             radio_edit.setSelected(false);
       // getSelectedRadio();
    }//GEN-LAST:event_radio_retActionPerformed

    private void tb_ensCoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ensCoursMouseClicked
    }//GEN-LAST:event_tb_ensCoursMouseClicked

    private void srchEns_coursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchEns_coursActionPerformed
    }//GEN-LAST:event_srchEns_coursActionPerformed

    private void srchEns_coursKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchEns_coursKeyTyped
String s=srchEns_cours.getText();
deft=new DefaultTableModel();
gerer_fenetre.gererLaRecherche(tb_ens, deft,srchEns_cours, s);
    }//GEN-LAST:event_srchEns_coursKeyTyped

    private void srchCoursKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchCoursKeyTyped
String s=srchCours.getText();
deft=new DefaultTableModel();
gerer_fenetre.gererLaRecherche(tb_cours, deft,srchCours, s);
    }//GEN-LAST:event_srchCoursKeyTyped

    private void excelFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelFileMouseClicked
 String ext=".xls";
 
 
  if(isSelectedyes()) { 
    if(pr_select.isSelected())
        
    {
        if(JOptionPane.showConfirmDialog(this,"Vous voulez exporter comme fichier excel"+" "+s1+" ?")==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.export(tb_ens,ext);
        }else{
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }
    if(d_select.isSelected())
    {
        if(JOptionPane.showConfirmDialog(this,"Vous voulez imprimer"+" "+s2+" ?")==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.export(tb_cours,ext);
        }else{
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    if(tr_select.isSelected())
    {
      if(JOptionPane.showConfirmDialog(this,"Vous voulez imprimer"+s3+" ?")==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.export(tb_ensCours,ext);
        }
      else
        {
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }
    if(all_select.isSelected()){
      if(JOptionPane.showConfirmDialog(this,"Vous voulez imprimer?"+" "+s4)==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.ImprimerLaTable(tb_ens);
             JOptionPane.showMessageDialog(this, "effectuée"+" .La liste des cours de la Santé Publique va suivre");
             gerer_fenetre.export(tb_cours,ext);
             JOptionPane.showMessageDialog(this, "effectuée"+" .la liste des Professeurs en Santé Publique et leurs cours va suivre");
             gerer_fenetre.export(tb_ensCours,ext);
             JOptionPane.showMessageDialog(this, "C'est fini!Merci");
        }else{
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }
  }
  else{
     JOptionPane.showMessageDialog(this, "Séléctionner la liste à exporter", "Information", JOptionPane.WARNING_MESSAGE);
  }
       
    }//GEN-LAST:event_excelFileMouseClicked

    private void printFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printFileMouseClicked
getRadioSelectedPrint();      // TODO add your handling code here:
    }//GEN-LAST:event_printFileMouseClicked

    private void pr_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pr_selectActionPerformed
     if(pr_select.isSelected())
        {
            d_select.setSelected(false);
            tr_select.setSelected(false);
            all_select.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pr_selectActionPerformed

    private void d_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_selectActionPerformed
    if(d_select.isSelected())
        {
            pr_select.setSelected(false);  
            tr_select.setSelected(false);
             all_select.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_d_selectActionPerformed

    private void tr_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_selectActionPerformed
    if(tr_select.isSelected())
        {
            pr_select.setSelected(false);
            d_select.setSelected(false);
            all_select.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tr_selectActionPerformed

    private void all_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_selectActionPerformed
      if(all_select.isSelected())
        {
            pr_select.setSelected(false);
            d_select.setSelected(false);
            tr_select.setSelected(false);
      
        }      
    }//GEN-LAST:event_all_selectActionPerformed

    private void btnAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppActionPerformed

 if(selectedTableCours()&&selectedtableEnseignant()||isEns_cours()>=0)
 {     
        
if(radio_Relier.isSelected())
    {
        if(selectedTableCours()&&selectedtableEnseignant())
        {

        AddProf prof=new AddProf();
          prof.setIdCours(getPrimaryCours());
          prof.setIdProf(getPrimaryEmpl());
         
          if(prof.addmyprof()>0)
            {
              JOptionPane.showMessageDialog(this, "Succès");
                chargetbleEns();
                playTableCours();
                chargerEnsCours();
             }
          else
             { 
              getToolkit().beep();
             JOptionPane.showMessageDialog(this, "Problème d'insertion!\nLe cours existe déjà à l'autre", "Erreur", JOptionPane.ERROR_MESSAGE);
             chargetbleEns();
             playTableCours();
             chargerEnsCours();
            }
    }
     else
        {
             JOptionPane.showMessageDialog(this, "Séléctionner le Professeur et le cours pour faire la liaison", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
}
if(radio_edit.isSelected())
  {
    if(isEns_cours()>=0&&selectedTableCours()&&selectedtableEnseignant())
    {
         if(JOptionPane.showConfirmDialog(this, "Êtes-vous sûr de la modification?","Message de confirmation",JOptionPane.OK_OPTION)
                ==JOptionPane.OK_OPTION)
         {
                int tim=tb_ensCours.getSelectedRow();
                 String dat=tb_ensCours.getValueAt(tim, 4).toString();
                 EditMyprof ed =new EditMyprof();
                 ed.setIdCours(getPrimaryCours());
                 ed.setIdProf(getPrimaryEmpl());
                 ed.setExist_date(dat);
                  if(ed.Editermyprof()>0)
                  {
                     JOptionPane.showMessageDialog(this, "Succès");
                     chargetbleEns();
                     playTableCours();
                     chargerEnsCours();
        
                  }
                  else
                  {
                     getToolkit().beep();
                     JOptionPane.showMessageDialog(this, "Non effectué","Erreur",JOptionPane.ERROR_MESSAGE);
                     chargetbleEns();
                     playTableCours();
                     chargerEnsCours();
                  }
           }
         else
         {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "La modification n'a pas été effectué","Erreur",JOptionPane.PLAIN_MESSAGE);
             chargetbleEns();
             playTableCours();
             chargerEnsCours();
         }
    
    }
   
     else
        {
            getToolkit().beep();
           JOptionPane.showMessageDialog(this,"Veuillez selectionner l'objet à modifier", "Attention", 
            JOptionPane.WARNING_MESSAGE);
             chargetbleEns();
             playTableCours();
             chargerEnsCours();
        }
    

}
if(radio_ret.isSelected())
  {
    if(isEns_cours()>=0)
       {
        if(JOptionPane.showConfirmDialog(this, "Êtes-vous sûr de la suppression?","Message de confirmation",JOptionPane.OK_OPTION)
                ==JOptionPane.OK_OPTION)
          {
                String tim=(String) tb_ensCours.getValueAt(isEns_cours(),4);
                
                RetirerMyProf ret_prof=new RetirerMyProf();
                    ret_prof.setDate(tim);
                 if(ret_prof.Retmyprof()>0)
                    {
                     JOptionPane.showMessageDialog(this, "Effectué","Message",JOptionPane.INFORMATION_MESSAGE);
                        chargetbleEns();
                        playTableCours();
                        chargerEnsCours();
                     
                    }
                 else
                    {
                       getToolkit().beep();
                     JOptionPane.showMessageDialog(this, "Echec de suppression","Message d'erreur",JOptionPane.ERROR);
                      chargetbleEns();
                      playTableCours();
                     chargerEnsCours();
                    }
            }
        else
            {
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "Vous avez refuser la suppression","Attention",JOptionPane.ERROR_MESSAGE);
                chargetbleEns();
                playTableCours();
                chargerEnsCours();
            }
     }
    else
        {
            getToolkit().beep();
             JOptionPane.showMessageDialog(this, "Séléctionner le cours à retirer au professeur","Message d'erreur",JOptionPane.WARNING_MESSAGE);
              chargetbleEns();
             playTableCours();
             chargerEnsCours();
        }

}

 }
 else{
     getToolkit().beep();
     JOptionPane.showMessageDialog(this, "Aucune action valide pour le cas","Message d'erreur",JOptionPane.WARNING_MESSAGE);
 }        // TODO add your handling code here:
    }//GEN-LAST:event_btnAppActionPerformed

    private void btnIgnoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgnoreActionPerformed
        chargetbleEns();
        playTableCours();
        chargerEnsCours();
        radio_Relier.setSelected(false);
        radio_edit.setSelected(false);
        radio_ret.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnIgnoreActionPerformed

    private void excelFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelFileMouseEntered
    }//GEN-LAST:event_excelFileMouseEntered

    private void radio_Relier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_Relier1ActionPerformed
 cours_devC cdep=new cours_devC();
 deskpanne.removeAll();
 deskpanne.repaint();
 deskpanne.add(cdep);
        try {
            cdep.setMaximum(true);
            cdep.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AddMyprSP.class.getName()).log(Level.SEVERE, null, ex);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_radio_Relier1ActionPerformed

    private void srchEns_cours1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchEns_cours1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchEns_cours1ActionPerformed

    private void srchEns_cours1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchEns_cours1KeyTyped
deft=new DefaultTableModel();
        String r=srchEns_cours1.getText();
        gerer_fenetre.gererLaRecherche(tb_ensCours, deft, srchEns_cours1,r);        // TODO add your handling code here:
    }//GEN-LAST:event_srchEns_cours1KeyTyped

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all_select;
    private javax.swing.JRadioButton btnApp;
    private javax.swing.JRadioButton btnIgnore;
    private javax.swing.JCheckBox d_select;
    private javax.swing.JLabel excelFile;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JCheckBox pr_select;
    private javax.swing.JLabel printFile;
    private javax.swing.JRadioButton radio_Relier;
    private javax.swing.JRadioButton radio_Relier1;
    private javax.swing.JRadioButton radio_edit;
    private javax.swing.JRadioButton radio_ret;
    private javax.swing.JTextField srchCours;
    private javax.swing.JTextField srchEns_cours;
    private javax.swing.JTextField srchEns_cours1;
    private javax.swing.JTable tb_cours;
    private javax.swing.JTable tb_ens;
    public javax.swing.JTable tb_ensCours;
    private javax.swing.JCheckBox tr_select;
    // End of variables declaration//GEN-END:variables
public void chargerEnsCours(){
    deft=new DefaultTableModel();
    tb_ensCours.setModel(deft);
    Object col[]={"Nom & Prenom du Professeur","Nom du cours","Année","Volume horaire","Date d'attribution"};
    deft.setColumnIdentifiers(col);
    ResultSet info=connexiondata.extraireData("select n_cours,annee,n_heure,nom,prenom,date_modified from cours,personel,enseignant_cours "
            + "where (cours.sant_pub='"+true+"' and cours.idCours=enseignant_cours.idCours and personel.idEmployer=enseignant_cours.idProf )order by annee");
        try {
            while(info.next()){
                Object ligne[]={info.getString("nom")+"   "+info.getString("prenom"),info.getString("n_cours"),
                    info.getString("annee"),info.getString("n_heure"),info.getString("date_modified")};
                deft.addRow(ligne);
            }   } catch (SQLException ex) {
            Logger.getLogger(AddMyprSP.class.getName()).log(Level.SEVERE, null, ex);
        }
}
//retour de la ligne selectioné au niveau de la combinaison des tables enseignant et cours
int row=-1;
public int isEns_cours()
{
    row =tb_ensCours.getSelectedRow();
    return row;
}
public boolean isSelectedyes(){
 return pr_select.isSelected()||d_select.isSelected()||tr_select.isSelected()||all_select.isSelected();
}
//je veux savoir le nombre des tables à exporter sous différentes format   
    String s1=" la liste de tous les professeurs";
    String s2=" la liste de tous les cours de la SP";
    String s3=" la liste des Professeurs en Santé Publique et leurs cours";
    String s4=" tous les tables";
public void getRadioSelectedPrint(){

  if(isSelectedyes()) { 
    if(pr_select.isSelected())
        
    {
        if(JOptionPane.showConfirmDialog(this,"Vous voulez imprimer "+s1+" ?")==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.ImprimerLaTable(tb_ens);
        }else{
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }
    if(d_select.isSelected())
    {
        if(JOptionPane.showConfirmDialog(this,"Vous voulez imprimer "+s2+" ?")==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.ImprimerLaTable(tb_cours);
        }else{
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    if(tr_select.isSelected()){
      if(JOptionPane.showConfirmDialog(this,"Vous voulez imprimer" +s3+" ?")==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.ImprimerLaTable(tb_ensCours);
        }else{
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.ERROR_MESSAGE);
        }
    }
    if(all_select.isSelected()){
      if(JOptionPane.showConfirmDialog(this,"Vous voulez imprimer"+s4+" ?")==JOptionPane.OK_OPTION)
        {
             gerer_fenetre.ImprimerLaTable(tb_ens);
             JOptionPane.showMessageDialog(this, "effectuée"+" .La liste des cours de la SP suive");
             gerer_fenetre.ImprimerLaTable(tb_cours);
             JOptionPane.showMessageDialog(this, "Effectuée"+" .La liste des Professeurs de la SP et ses cours suive");
             gerer_fenetre.ImprimerLaTable(tb_ensCours);
             JOptionPane.showMessageDialog(this, "C'est fini!Merci");
        }else{
            JOptionPane.showMessageDialog(this, "Action non effectuée", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
  }
  else{
     JOptionPane.showMessageDialog(this, "Séléctionner la liste à exporter", "Information", JOptionPane.WARNING_MESSAGE);
  }
}

}

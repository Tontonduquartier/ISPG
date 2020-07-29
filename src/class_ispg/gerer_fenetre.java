/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_ispg;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public interface gerer_fenetre {

    public static void centrer_fenetre(JFrame window){
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
      //  Dimension dim1=new Dimension(1024,600);
//        window.setLocation(dim.width/2-window.getWidth()/2,dim.height/2-window.getHeight()/2);
        window.setMaximumSize(dim);
    }
   
    public static void gererLaRecherche(JTable table,DefaultTableModel dflt,JTextField field,String string){
               
       dflt=(DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<>(dflt);
        table.setRowSorter(tr);
       
         string=field.getText();
        tr.setRowFilter(RowFilter.regexFilter(string));
    }
    
    public static void gererLesDate(JDateChooser jdate){
        jdate.setMaxSelectableDate(new Date());
    }
    
    //je veux exporter la table sous differente format de fichier
    public static void export(JTable t ,String extion){
       
        TableModel model=t.getModel();
        JFileChooser fc=new JFileChooser();
        
        if(fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
        {
              
                    try (FileWriter writ = new FileWriter(fc.getSelectedFile().getAbsolutePath()+extion); 
                            BufferedWriter buff = new BufferedWriter(writ))
                    {
                        for(int i=0;i<model.getColumnCount();i++){
                            
                            buff.write(model.getColumnName(i)+"\t");
                            
                        }
                        buff.newLine();
                        for(int j=0;j<model.getRowCount();j++)
                        {
                            for(int row=0;row<model.getColumnCount();row++)
                            {
                                buff.write(model.getValueAt(j,row)+"\t");
                            }              
                            buff.newLine();
                            
                        }
                        
                    }
                 
            
         catch (IOException ex) {
            Logger.getLogger(gerer_fenetre.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    }
    //impression
    public static void ImprimerLaTable(JTable tab){
        MessageFormat head=new MessageFormat("");
        MessageFormat done=new MessageFormat("");
        try {
            tab.print(JTable.PrintMode.NORMAL,head,done);
        } catch (PrinterException ex) {
            Logger.getLogger(gerer_fenetre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
}

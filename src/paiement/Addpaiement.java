/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paiement;

import class_ispg.connexiondata;

/**
 *  
 * @author HP
 */

public class Addpaiement {

 
    private String date_paye,commentaire;
    private  int idEmpl,salTot,salPay,frinss,frmut,frpensc,imp;

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    public int getSalTot() {
        return salTot;
    }

    public void setSalTot(int salTot) {
        this.salTot = salTot;
    }

    public int getFrpensc() {
        return frpensc;
    }

    public void setFrpensc(int frpensc) {
        this.frpensc = frpensc;
    }

    public int getSalPay() {
        return salPay;
    }

    public void setSalPay(int salPay) {
        this.salPay = salPay;
    }

    public int getFrinss() {
        return frinss;
    }

    public void setFrinss(int frinss) {
        this.frinss = frinss;
    }

    public int getFrmut() {
        return frmut;
    }

    public void setFrmut(int frmut) {
        this.frmut = frmut;
    }

    public int getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(int idEmpl) {
        this.idEmpl = idEmpl;
    }



    public String getDate_paye() {
        return date_paye;
    }

    public void setDate_paye(String date_paye) {
        this.date_paye = date_paye;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire)
    {
        this.commentaire = commentaire;
    }


    public int insert_paiement(){
       return connexiondata.modifierDB("INSERT INTO paiement (idEmpl,salTot,frInss,frMut,pensCompl,impot,salPay,date_payer,commentaire)"
         + "VALUES('"+idEmpl+"','"+salTot+"','"+frinss+"','"+frmut+"','"+frpensc+"','"+imp+"','"+salPay+"','"+date_paye+"','"+commentaire+"')");
    }
    public int insert_historiqe()
    {
        return connexiondata.modifierDB("INSERT INTO hist_paiement (idEmpl,salTot,frInss,frMut,pensCompl,impot,salPay,date_payer,commentaire)"
              + "VALUES('"+idEmpl+"','"+salTot+"','"+frinss+"','"+frmut+"','"+frpensc+"','"+imp+"','"+salPay+"','"+date_paye+"','"+commentaire+"')");
    }
}

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
public class updatepaiement {
    private String num_compte,banque,date_paye,commentaire,existValue;
    private  int idEmpl, inss,mutualite,salaire_tot,netApay;
    public String getExistValue() 
     {
        return existValue;
    }

    public void setExistValue(String existValue) {
        this.existValue = existValue;
    }
    

    public int getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(int idEmpl) {
        this.idEmpl = idEmpl;
    }

    public int getInss() {
        return inss;
    }

    public void setInss(int inss) {
        this.inss = inss;
    }

    public int getMutualite() {
        return mutualite;
    }

    public void setMutualite(int mutualite) {
        this.mutualite = mutualite;
    }

    public String getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
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

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getSalaire_tot() {
        return salaire_tot;
    }

    public void setSalaire_tot(int salaire_tot) {
        this.salaire_tot = salaire_tot;
    }

    public int getNetApay() {
        return netApay;
    }

    public void setRet_src(int netApay) {
        this.netApay = netApay;
    }
    public int Update_paiement(){
        return connexiondata.modifierDB("UPDATE paiement SET idEmpl='"+idEmpl+"',n_compte='"+num_compte+"',"
               +"banque='"+banque+"',sal_tot='"+salaire_tot+"',inss='"+inss+"',mutualite='"+mutualite+"',NetPay='"+netApay+"',commentaire='"+commentaire+"' where date_payer='"+existValue+"'");
    }
    public int Update_historiqe(){
      
     return connexiondata.modifierDB("UPDATE hist_paiement SET  SET idEmpl='"+idEmpl+"',n_compte='"+num_compte+"',"
               +"banque='"+banque+"',sal_tot='"+salaire_tot+"',inss='"+inss+"',mutualite='"+mutualite+"',NetPay='"+netApay+"',commentaire='"+commentaire+"' where date_payer='"+existValue+"'");
}
}

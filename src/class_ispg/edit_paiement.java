/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_ispg;

/**
 *
 * @author HP
 */
public class edit_paiement {
    private String matricule,nom,prenom,num_compte,banque,date_paye,commentaire;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public int getRet_src() {
        return ret_src;
    }

    public void setRet_src(int ret_src) {
        this.ret_src = ret_src;
    }
    private  int salaire_tot,ret_src;
    
    public void edit_paiement(){
        connexiondata.modifierDB("update paiement matricule='"+matricule+"',nom='"+nom+"'"
         + ",prenom='"+prenom+"',n_compte='"+num_compte+"',banque='"+banque+"',sal_tot='"+salaire_tot+"',"
         + "ret_src='"+ret_src+"',date_payer='"+date_paye+"',commentaire='"+commentaire+"'");
    }
    public void edit_hist(){
        connexiondata.modifierDB("update hist_paiement set"
         + " matricule='"+matricule+"',nom='"+nom+"'"
         + ",prenom='"+prenom+"',n_compte='"+num_compte+"',banque='"+banque+"',sal_tot='"+salaire_tot+"',"
         + "ret_src='"+ret_src+"',date_payer='"+date_paye+"',commentaire='"+commentaire+"'");
    }
}

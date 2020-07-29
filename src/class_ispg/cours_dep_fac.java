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
public class cours_dep_fac {

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }


    public int getNb_hr() {
        return nb_hr;
    }

    public void setNb_hr(int nb_hr) {
        this.nb_hr = nb_hr;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    

    public void setAnnee(String annee) {
        this.annee= annee;
    }

    public String getSemestr() {
        return semestr;
    }

    public void setSemestr(String semestr) {
        this.semestr = semestr;
    }

    public String getDat_fixed() {
        return dat_fixed;
    }

    public void setDat_fixed(String dat_fixed) {
        this.dat_fixed = dat_fixed;
    }  
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    

    public boolean isSagF() {
        return sagF;
    }

    public void setSagF(boolean sagF) {
        this.sagF = sagF;
    }

    public boolean isSanP() {
        return sanP;
    }

    public void setSanP(boolean sanP) {
        this.sanP = sanP;
    }

    public boolean isDevC() {
        return devC;
    }

    public void setDevC(boolean devC) {
        this.devC = devC;
    }

    public boolean isSoinF() {
        return soinF;
    }

    public void setSoinF(boolean soinF) {
        this.soinF = soinF;
    }
    boolean sagF,sanP,devC,soinF;
    String cours,annee,semestr,dat_fixed,commentaire;
    int nb_hr,credit;
    
    public int insert_cours(){
    return connexiondata.modifierDB("INSERT INTO cours (n_cours,sant_pub,sage_fem,dev_com,s_inf,annee,n_heure,credit,semestre,date_fixed,commentaire)"
    + "VALUES('"+cours+"','"+sanP+"','"+sagF+"','"+devC+"','"+soinF+"','"+annee+"','"+nb_hr+"','"+credit+"','"+semestr+"','"+dat_fixed+"','"+commentaire+"')");
}
}

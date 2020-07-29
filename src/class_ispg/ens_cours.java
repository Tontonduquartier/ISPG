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
public class ens_cours {
    String nom,prenom,n_cours,annee,dat_modified,dep,fac,anneeAcademy,commentaire;
         ;
    int nbrHeure;

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

    public String getN_cours() {
        return n_cours;
    }

    public void setN_cours(String n_cours) {
        this.n_cours = n_cours;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public String getAnneeAcademy() {
        return anneeAcademy;
    }

    public void setAnneeAcademy(String anneeAcademy) {
        this.anneeAcademy = anneeAcademy;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getDat_modified() {
        return dat_modified;
    }

    public void setDat_modified(String dat_modified) {
        this.dat_modified = dat_modified;
    }

    public int getNbrHeure() {
        return nbrHeure;
    }

    public void setNbrHeure(int nbrHeure) {
        this.nbrHeure = nbrHeure;
    }
    public int insertEns_cours(){
        return connexiondata.modifierDB("INSERT INTO enseignant_cours(cours,departement,faculte,n_heure,annee,nom_prof,prenon_prof"
                + ",anneeAcademique,date_modified,commentaire) VALUES('"+n_cours+"','"+dep+"','"+fac+"','"+nbrHeure+"','"+annee+"'"
                        + ",'"+nom+"','"+prenom+"','"+anneeAcademy+"','"+dat_modified+"','"+commentaire+"')");
    }
}

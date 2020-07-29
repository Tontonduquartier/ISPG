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
public class enseignant {
    String n_mat,nom,prenom,typ_ens;

    public String getN_mat() {
        return n_mat;
    }

    public void setN_mat(String n_mat) {
        this.n_mat = n_mat;
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

    public String getTyp_ens() {
        return typ_ens;
    }

    public void setTyp_ens(String typ_ens) {
        this.typ_ens = typ_ens;
    }
    public int insert_ens(){
        return connexiondata.modifierDB("INSERT INTO enseignant(n_matricule,nom,prenom,type_enseignant)VALUES('"+n_mat+"','"+nom+"',"
                + "'"+prenom+"','"+typ_ens+"')");
        
    }
   
}

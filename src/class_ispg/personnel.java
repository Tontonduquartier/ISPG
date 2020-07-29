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
public class personnel {
     private String n_matricule,nom,prenom,sexe,prov_naiss,com_naiss,col_naiss,zone,dat_naiss,
            banque,num_banque,typ_contrat,nationalite,post;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
      private String dat_emb;
      private boolean enseignan,travailleur,direction;

    public String getN_matricule(String n_matricule ) {
        return n_matricule;
    }

    public void setN_matricule(String n_matricule) {
        this.n_matricule = n_matricule;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getProv_naiss() {
        return prov_naiss;
    }

    public void setProv_naiss(String prov_naiss) {
        this.prov_naiss = prov_naiss;
    }

    public String getCom_naiss() {
        return com_naiss;
    }

    public void setCom_naiss(String com_naiss) {
        this.com_naiss = com_naiss;
    }

    public String getCol_naiss() {
        return col_naiss;
    }

    public void setCol_naiss(String col_naiss) {
        this.col_naiss = col_naiss;
    }

    public String getDat_naiss() {
        return dat_naiss;
    }

    public void setDat_naiss(String dat_naiss) {
        this.dat_naiss = dat_naiss;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getNum_banque(String num_banque) {
        return num_banque;
    }

    public void setNum_banque(String num_banque) {
        this.num_banque = num_banque;
    }

    public String getTyp_contrat() {
        return typ_contrat;
    }

    public void setTyp_contrat(String typ_contrat) {
        this.typ_contrat = typ_contrat;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getDat_emb() {
        return dat_emb;
    }

    public void setDat_emb(String dat_emb) {
        this.dat_emb = dat_emb;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
 public boolean isEnseignan() {
        return enseignan;
    }

    public void setEnseignan(boolean enseignan) {
        this.enseignan = enseignan;
    }

    public boolean isTravailleur() {
        return travailleur;
    }

    public void setTravailleur(boolean travailleur) {
        this.travailleur = travailleur;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }
 
    
    public int insert(){
       return connexiondata.modifierDB("INSERT INTO personel(n_matricule,nom,prenom,sexe,date_naissance,nationalite,col_naissance,"
               + "zone,commune,province,banque,n_compte,enseignant,travailleur,direction,poste,typecontrat,date_embaucher)VALUES('"+n_matricule+"','"+nom+"','"+prenom+"'"
          + ",'"+sexe+"','"+dat_naiss+"','"+nationalite+"','"+col_naiss+"','"+zone+"','"+com_naiss+"','"+prov_naiss+"'"
         + ",'"+banque+"','"+num_banque+"','"+enseignan+"','"+direction+"','"+travailleur+"','"+post+"','"+typ_contrat+"','"+dat_emb+"')");
    }
    
}

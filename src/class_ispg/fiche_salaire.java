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
public class fiche_salaire {

   
 private String qualif,commentaire,dateEnreg;
 private int idEmpl,salbase,indamLog,indamDep,allocFam,indamGrad,primeFonct,salBrut,inssPerso,inssPatro,inssRisq,
         mutPatro,mutPerso,pensCompl,salImpos,ire,avancSal,retSurSal,netPayabl,netApayer;

    public String getQualif() {
        return qualif;
    }

    public void setQualif(String qualif) {
        this.qualif = qualif;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getDateEnreg() {
        return dateEnreg;
    }

    public void setDateEnreg(String dateEnreg) {
        this.dateEnreg = dateEnreg;
    }

    public int getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(int idEmpl) {
        this.idEmpl = idEmpl;
    }

    public int getSalbase() {
        return salbase;
    }

    public void setSalbase(int salbase) {
        this.salbase = salbase;
    }

    public int getIndamLog() {
        return indamLog;
    }

    public void setIndamLog(int indamLog) {
        this.indamLog = indamLog;
    }

    public int getIndamDep() {
        return indamDep;
    }

    public void setIndamDep(int indamDep) {
        this.indamDep = indamDep;
    }

    public int getAllocFam() {
        return allocFam;
    }

    public void setAllocFam(int allocFam) {
        this.allocFam = allocFam;
    }

    public int getIndamGrad() {
        return indamGrad;
    }

    public void setIndamGrad(int indamGrad) {
        this.indamGrad = indamGrad;
    }

    public int getPrimeFonct() {
        return primeFonct;
    }

    public void setPrimeFonct(int primeFonct) {
        this.primeFonct = primeFonct;
    }

    public int getSalBrut() {
        return salBrut;
    }

    public void setSalBrut(int salBrut) {
        this.salBrut = salBrut;
    }

    public int getInssPerso() {
        return inssPerso;
    }

    public void setInssPerso(int inssPerso) {
        this.inssPerso = inssPerso;
    }

    public int getInssPatro() {
        return inssPatro;
    }

    public void setInssPatro(int inssPatro) {
        this.inssPatro = inssPatro;
    }

    public int getInssRisq() {
        return inssRisq;
    }

    public void setInssRisq(int inssRisq) {
        this.inssRisq = inssRisq;
    }

    public int getMutPatro() {
        return mutPatro;
    }

    public void setMutPatro(int mutPatro) {
        this.mutPatro = mutPatro;
    }

    public int getMutPerso() {
        return mutPerso;
    }

    public void setMutPerso(int mutPerso) {
        this.mutPerso = mutPerso;
    }

    public int getPensCompl() {
        return pensCompl;
    }

    public void setPensCompl(int pensCompl) {
        this.pensCompl = pensCompl;
    }

    public int getSalImpos() {
        return salImpos;
    }

    public void setSalImpos(int salImpos) {
        this.salImpos = salImpos;
    }

    public int getIre() {
        return ire;
    }

    public void setIre(int ire) {
        this.ire = ire;
    }

  
    public int getAvancSal() {
        return avancSal;
    }

    public void setAvancSal(int avancSal) {
        this.avancSal = avancSal;
    }

    public int getRetSurSal() {
        return retSurSal;
    }

    public void setRetSurSal(int retSurSal) {
        this.retSurSal = retSurSal;
    }

    public int getNetPayabl() {
        return netPayabl;
    }

    public void setNetPayabl(int netPayabl) {
        this.netPayabl = netPayabl;
    }

    public int getNetApayer() {
        return netApayer;
    }

    public void setNetApayer(int netApayer) {
        this.netApayer = netApayer;
    }



public int ins_fich_sal(){
  return connexiondata.modifierDB("INSERT INTO fiche_salaire(idEmployer,qualification,salBase,indm_log,indm_depl,"
    + "alloc_fam,indam_grade,prime,sal_brut,insspers,insspatr,inssrisquepro,mutualiteperso,mutualitepatro,"
    + "pensCompl,sal_impos,ire,avanc_sal,retSurSal,netpayable,netApay,dateEnr,commentaire)"
    + " VALUES('"+idEmpl+"','"+qualif+"','"+salbase+"','"+indamLog+"','"+indamDep+"','"+allocFam+"','"+indamGrad+"','"+primeFonct+"',"
    + "'"+salBrut+"','"+inssPerso+"','"+inssPatro+"','"+inssRisq+"','"+mutPatro+"','"+mutPerso+"','"+pensCompl+"','"+salImpos+"',"
    +"'"+ire+"','"+avancSal+"','"+retSurSal+"','"+netPayabl+"','"+netApayer+"','"+dateEnreg+"','"+commentaire+"')");
    }
}

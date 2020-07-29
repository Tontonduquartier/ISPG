/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myProf;

import class_ispg.connexiondata;

/**
 *
 * @author HP
 */
public class EditMyprof {

    int idProf_Edit,idCours_Edit;
    String exist_date;
    
    public int getIdProf_Edit() {
        return idProf_Edit;
    }

    public void setIdProf_Edit(int idProf_Edit) {
        this.idProf_Edit = idProf_Edit;
    }

    public int getIdCours_Edit() {
        return idCours_Edit;
    }

    public void setIdCours_Edit(int idCours_Edit) {
        this.idCours_Edit = idCours_Edit;
    }

    public String getExist_date() {
        return exist_date;
    }

    public void setExist_date(String exist_date) {
        this.exist_date = exist_date;
    }
 

    public int getIdProf() {
        return idProf_Edit;
    }

    public void setIdProf(int idProf) {
        this.idProf_Edit = idProf;
    }

    public int getIdCours() {
        return idCours_Edit;
    }

    public void setIdCours(int idCours) {
        this.idCours_Edit = idCours;
    }

    public int Editermyprof(){
        return connexiondata.modifierDB("update enseignant_cours set idCours='"+idCours_Edit+"',idProf='"+idProf_Edit+"' "
                + "where(date_modified='"+exist_date+"')");
    }


}

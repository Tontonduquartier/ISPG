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
public class AddProf {
    int idProf,idCours;
    

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public int addmyprof(){
        return connexiondata.modifierDB("insert into enseignant_cours(idCours,idProf)values"
                + "('"+idCours+"','"+idProf+"')");
    }
}

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
public class RetirerMyProf {
    

    String date_ret;

    public String getDate() {
        return date_ret;
    }

    public void setDate(String d) {
        this.date_ret = d;
    }
    public int Retmyprof(){
        return connexiondata.modifierDB("delete from enseignant_cours where(date_modified='"+date_ret+"')");
    }

}

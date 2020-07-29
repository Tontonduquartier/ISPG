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
public class DelPaiement {
    String existVal;

    public String getExistVal() {
        return existVal;
    }

    public void setExistVal(String existVal) {
        this.existVal = existVal;
    }
     public int Delete_paiement(){
        return connexiondata.modifierDB("DELETE FROM paiement where date_payer='"+existVal+"'");
    }
    public int Delete_historiqe(){
      
     return connexiondata.modifierDB("DELETE FROM hist_paiement  where date_payer='"+existVal+"'");
}

}

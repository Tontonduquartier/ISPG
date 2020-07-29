/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suivi;

import class_ispg.connexiondata;

/**
 *
 * @author HP
 */
public class presence {
    private int idEmpl;
    private String heurArriv, heurDepart;

    public String getHeurArriv() {
        return heurArriv;
    }

    public void setHeurArriv(String heurArriv) {
        this.heurArriv = heurArriv;
    }


    public int getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(int idEmpl) {
        this.idEmpl = idEmpl;
    }

    public String getHeurDepart() {
        return heurDepart;
    }

    public void setHeurDepart(String heurDepart) {
        this.heurDepart = heurDepart;
    }
    public int Insertion()
    {
       return connexiondata.modifierDB("insert into presence(idEmployer,heurArriver,heurDep)"
               + "values('"+idEmpl+"','"+heurArriv+"','"+heurDepart+"')");
    }
}

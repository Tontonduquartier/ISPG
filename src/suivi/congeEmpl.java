/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suivi;
import class_ispg.connexiondata;
import java.util.Date;

/**
 *
 * @author HP
 */
public class congeEmpl {
   private int idEmployer;
   private String dateAller,dateRetour;
   private String motif,type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   private boolean Onservice; 

    public int getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(int idEmployer) {
        this.idEmployer = idEmployer;
    }

    public String getDateAller() {
        return dateAller;
    }

    public void setDateAller(String dateAller) {
        this.dateAller = dateAller;
    }

    public String getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(String dateRetour) {
        this.dateRetour = dateRetour;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public boolean isOnservice() {
        return Onservice;
    }

    public void setOnservice(boolean Onservice) {
        this.Onservice = Onservice;
    }
    public int Repos()
    {
        return connexiondata.modifierDB("insert into conge(idEmployer,dateAller,dateRetour,motif,typeconge) values('"+idEmployer+"','"+dateAller+"',"
                + "'"+dateRetour+"','"+motif+"','"+type+"')");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import class_ispg.connexiondata;

/**
 *
 * @author HP
 */
public class addUserClass {
    private String username,password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int addus()
    {
        return connexiondata.modifierDB("insert into user (username,pswd) values('"+username+"','"+password+"')");
    }
}

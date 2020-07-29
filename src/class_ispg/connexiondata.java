



package class_ispg;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class connexiondata {


/**
 *
 * @author Lenovo
 */

 
       
    private static Connection con=null;
    
    public static int modifierDB(String sql){
        
            int result=-1;
            try {
                
             if(con==null)
                if(!createConnection())
                    return result;
                            
            Statement st=con.createStatement();
            result=st.executeUpdate(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(connexiondata.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
  
    public static ResultSet extraireData(String requete){
        
        ResultSet result=null;
            
        try {
            
            if(con==null)
                if(!createConnection())
                    return result;
            Statement st=con.createStatement();
            
            result=st.executeQuery(requete);
            
        } catch (SQLException ex) {
            Logger.getLogger(connexiondata.class.getName()).log(Level.SEVERE, null, ex);
        }
    return result;
    }
    
    static boolean createConnection(){
        boolean status=false;
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ispg","root", "");
            
            status=true;
        } catch (ClassNotFoundException | SQLException ex) {
           
            Logger.getLogger(connexiondata.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
  
   

}


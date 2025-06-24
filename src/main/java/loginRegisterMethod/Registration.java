/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginRegisterMethod;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Louvel
 */
public class Registration {
    
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<String> email = new ArrayList<>();
    public static ArrayList<String> password = new ArrayList<>();
    
    public static void registerUser(String uname, String uemail, String upass){
        if(isRegistered(uname, uemail, upass) == false) {
            name.add(uname);
            email.add(uemail);
            password.add(upass);
            System.out.println("Registered: " + uname + ", " + uemail + ", " + upass);
            JOptionPane.showMessageDialog(null, "Registered Successfully");
        }else{
            JOptionPane.showMessageDialog(null,"Account Already Exist");
        } 
    }
    
    public static boolean isRegistered(String uname, String uemail, String upass){
        for(int i = 0; i < name.size(); i++){
           if(uname.equals(name.get(i))&& uemail.equals(email.get(i)) && (upass.equals(password.get(i)))){
                return true;
           }         
       }
        return false;
    }
    
    public static void findUser(String uemail, String upass){
       for(int i = 0; i < name.size(); i++){
           if(uemail.equals(email.get(i)) && (upass.equals(password.get(i)))){
               JOptionPane.showMessageDialog(null, "Welcome\n" + name.get(i));
               break;
           }         
       }
   }
}

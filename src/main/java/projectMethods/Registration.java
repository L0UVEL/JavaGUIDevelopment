/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectMethods;

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
        name.add(uname);
        email.add(uemail);
        password.add(upass);
    }
    
   public static void findUser(String uemail, String upass){
       for(int i = 0; i < name.size(); i++){
           if(uemail.equals(email.get(i)) && (upass.equals(password.get(i)))){
               JOptionPane.showMessageDialog(null, "Welcome\n" + name.get(i));
               break;
           } else {
               JOptionPane.showMessageDialog(null, "Please Enter your Correct Credentials\nIf you still can't Login Please make sure that you have an account");
           }
           
       }
   }
}

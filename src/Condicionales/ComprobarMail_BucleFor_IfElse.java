package Condicionales;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class ComprobarMail_BucleFor_IfElse {
    
    public static void main (String [] args) {
        
        //VARIABLES
        boolean arroba = false;
        
        String mail = JOptionPane.showInputDialog("Introduzca un mail: ");
        
        for (int i = 0; i < mail.length(); i++) {
            
            if (mail.charAt(i) == '@') {
                
                arroba = true;
                
            } else if (mail.charAt(i) != '@') {
                
                arroba = false;
                
            }
            
        }
        
        if (arroba == true) {
            
            System.out.println("El mail es correcto.");
            
        } else if (arroba == false) {
            
            System.out.println("El mail es incorrecto.");
            
        }
        
    }
    
}

package Condicionales;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1
public class ProbarContrase�a_DoWhile {

    public static void main(String[] args) {

        //KEYBOARD
        Scanner sc = new Scanner(System.in);

        //VARIABLES
        String clave = "SoyLaContrase�a";
        String pass;

        do {
            
            pass = JOptionPane.showInputDialog("Introduzca la contrase�a: ");
            
            if (clave.equals(pass) == false) {
                
                System.out.println("Contrase�a incorrecta. Vuelva a probar.");
                
            } else if (clave.equals(pass) == true) {
                
                System.out.println("Contrase�a correcta. Acceso permitido.");
                
            }

        } while (clave.equals(pass) == false);
        
    }

}

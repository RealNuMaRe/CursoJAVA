package Condicionales;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1
public class ProbarContraseña_DoWhile {

    public static void main(String[] args) {

        //KEYBOARD
        Scanner sc = new Scanner(System.in);

        //VARIABLES
        String clave = "SoyLaContraseña";
        String pass;

        do {
            
            pass = JOptionPane.showInputDialog("Introduzca la contraseña: ");
            
            if (clave.equals(pass) == false) {
                
                System.out.println("Contraseña incorrecta. Vuelva a probar.");
                
            } else if (clave.equals(pass) == true) {
                
                System.out.println("Contraseña correcta. Acceso permitido.");
                
            }

        } while (clave.equals(pass) == false);
        
    }

}

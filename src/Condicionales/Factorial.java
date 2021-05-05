package Condicionales;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class Factorial {
    
    public static void main (String [] args) {
        
        //VARIABLES
        Long resultado = 1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
        
        for (int i = numero; i > 0; i--) {
            
            resultado = resultado * i;
            
        }
        
        System.out.println("El factorial de " + numero + " es " + resultado + ".");
        
    }
    
}

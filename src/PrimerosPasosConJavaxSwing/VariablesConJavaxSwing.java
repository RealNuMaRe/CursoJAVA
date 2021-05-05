package PrimerosPasosConJavaxSwing;

import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class VariablesConJavaxSwing {
    
    public static void main (String [] args) {
        
        //VARIABLES
        int edad;
        
        String edadS = JOptionPane.showInputDialog("Introduzca su edad: ");
        edad = Integer.parseInt(edadS);
        System.out.println("Tienes " + edad + " años.");
        
    }
    
}

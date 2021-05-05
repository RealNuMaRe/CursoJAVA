package PrimerosPasosConJavaxSwing;

import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class UsoMathConJavaxSwing {
    
    public static void main (String [] args) {
        
        //VARIABLES
        double num1, num2;
        
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el número del que desea obtener la raíz cuadrada: ");
        String num1S = JOptionPane.showInputDialog("Numero: ");
        num1 = Double.parseDouble(num1S);
        System.out.println("La raíz cuadrada de " + num1 + " es: " + Math.sqrt(num1));
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el número a redondear: ");
        num1S = JOptionPane.showInputDialog("Numero: ");
       num1 = Double.parseDouble(num1S);
        System.out.println("El resultado de redondear el número " + num1 + " es: " + Math.round(num1));
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca los números a elevar: ");
        num1S = JOptionPane.showInputDialog("Numero: ");
        num1 = Double.parseDouble(num1S);
        String num2S = JOptionPane.showInputDialog("Numero: ");
        num2 = Double.parseDouble(num2S);
        System.out.println(num1 + " elevado a " + num2 + " es igual a: " + Math.pow(num1, num2));
        System.out.println("-----------------------------------------------");
    }
    
}

package PrimerosPasosConJavaxSwing;

import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class DeclaracionesOperadoresConJavaxSwing {
    
    public static void main (String [] args) {
        
        //VARIABLES
        double a, b;
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a sumar: ");
        String aS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        a = Integer.parseInt(aS);
        String bS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        b = Integer.parseInt(bS);
        
        System.out.println("La suma de " + a + " y " + b + " es: " + (a + b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a restar: ");
        aS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        a = Integer.parseInt(aS);
        bS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        b = Integer.parseInt(bS);
        
        System.out.println("La resta de " + a + " y " + b + " es: " + (a - b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a multiplicar: ");
        aS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        a = Integer.parseInt(aS);
        bS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        b = Integer.parseInt(bS);
        
        System.out.println("La multiplicaci�n de " + a + " y " + b + " es: " + (a * b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a dividir: ");
        aS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        a = Integer.parseInt(aS);
        bS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        b = Integer.parseInt(bS);
        
        System.out.println("La divisi�n de " + a + " y " + b + " es: " + (a / b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a dividir para obtener el resto: ");
        aS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        a = Integer.parseInt(aS);
        bS = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
        b = Integer.parseInt(bS);
        
        System.out.println("La resta de " + a + " y " + b + " es: " + (a % b));
        
        System.out.println("-----------------------------------------------");
        
    }
    
}

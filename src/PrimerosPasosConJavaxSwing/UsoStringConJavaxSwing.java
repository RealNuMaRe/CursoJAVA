package PrimerosPasosConJavaxSwing;

import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class UsoStringConJavaxSwing {
    
    public static void main (String [] args) {
        
        //VARIABLES PRIMERA PARTE
        String nombre;
        
        System.out.println("Primera parte");
        nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");
        System.out.println("Mi nombre es: " + nombre + ".");
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("La priemra letra de mi nombre es: " + nombre.charAt(0));
        System.out.println("La última letra de mi nombre es: " + nombre.charAt(nombre.length() -1) + ".");
        
        
        //VARIABLES SEGUNDA PARTE
        String frase;
        
        System.out.println("\nSegunda parte");
        frase = JOptionPane.showInputDialog("Introduzca una frase: ");
        System.out.println("Los primeros 10 caracteres de la frase: " + frase + " son: " + frase.substring(0, 9));

        //VARIABLES TERCERA PARTE
        String alumno1, alumno2;
        
        System.out.println("\nTercera parte");
        alumno1 = JOptionPane.showInputDialog("Introduzca el nombre del primer alumno: ");
        alumno2 = JOptionPane.showInputDialog("Introduzca el nombre del segundo alumno: ");
        // ¿Es igual?
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        // ¿Es diferente?
        System.out.println(!alumno1.equalsIgnoreCase(alumno2));
        
    }
    
}

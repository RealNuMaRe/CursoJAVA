package PrimerosPasosConScanner;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

import java.util.*;

public class UsoStringConScanner {
    
    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES PRIMERA PARTE
        String nombre;
        
        System.out.println("Primera parte");
        System.out.print("Introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Mi nombre es: " + nombre + ".");
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("La priemra letra de mi nombre es: " + nombre.charAt(0));
        System.out.println("La última letra de mi nombre es: " + nombre.charAt(nombre.length() -1) + ".");
        
        
        //VARIABLES SEGUNDA PARTE
        String frase;
        
        System.out.println("\nSegunda parte");
        System.out.print("Introduzca una frase: ");
        frase = sc.nextLine();
        System.out.println("Los primeros 10 caracteres de la frase: " + frase + " son: " + frase.substring(0, 9));

        //VARIABLES TERCERA PARTE
        String alumno1, alumno2;
        
        System.out.println("\nTercera parte");
        System.out.print("Introduzca el nombre del primer alumno: ");
        alumno1 = sc.nextLine();
        System.out.print("Introduzca el nombre del segundo alumno: ");
        alumno2 = sc.nextLine();
        // ¿Es igual?
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        // ¿Es diferente?
        System.out.println(!alumno1.equalsIgnoreCase(alumno2));
        
    }
    
}

package PrimerosPasosConScanner;

import java.util.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class VariablesConScanner {

    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES
        int edad;
        
        System.out.print("Introduzca tu edad: ");
        edad = sc.nextInt();
        System.out.println("Tienes " + edad + " años.");
        
    }
    
}

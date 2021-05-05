package PrimerosPasosConScanner;

import java.util.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class PrimeraClase {
    
    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca una frase a imprimir en pantalla: ");
        String frase = sc.nextLine();
        System.out.println(frase);
    }
    
}

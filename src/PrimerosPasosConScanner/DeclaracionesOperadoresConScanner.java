package PrimerosPasosConScanner;

import java.util.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class DeclaracionesOperadoresConScanner {
    
    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES
        double a, b;
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a sumar: ");
        System.out.print("Numero 1: ");
        a = sc.nextDouble();
        System.out.print("Numero 2: ");
        b = sc.nextDouble();
        
        System.out.println("La suma de " + a + " y " + b + " es: " + (a + b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a restar: ");
        System.out.print("Numero 1: ");
        a = sc.nextDouble();
        System.out.print("Numero 2: ");
        b = sc.nextDouble();
        
        System.out.println("La resta de " + a + " y " + b + " es: " + (a - b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a multiplicar: ");
        System.out.print("Numero 1: ");
        a = sc.nextDouble();
        System.out.print("Numero 2: ");
        b = sc.nextDouble();
        
        System.out.println("La multiplicaci�n de " + a + " y " + b + " es: " + (a * b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a dividir: ");
        System.out.print("Numero 1: ");
        a = sc.nextDouble();
        System.out.print("Numero 2: ");
        b = sc.nextDouble();
        
        System.out.println("La divisi�n de " + a + " y " + b + " es: " + (a / b));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Introduzca los n�meros a dividir para obtener el resto: ");
        System.out.print("Numero 1: ");
        a = sc.nextDouble();
        System.out.print("Numero 2: ");
        b = sc.nextDouble();
        
        System.out.println("La resta de " + a + " y " + b + " es: " + (a % b));
        
        System.out.println("-----------------------------------------------");
        
    }
    
}

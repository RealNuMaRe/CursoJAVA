package PrimerosPasosConScanner;

import java.util.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class UsoMathConScanner {
    
    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES
        double num1, num2;
        
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el número del que desea obtener la raíz cuadrada: ");
        System.out.print("Numero: ");
        num1 = sc.nextDouble();
        System.out.println("La raíz cuadrada de " + num1 + " es: " + Math.sqrt(num1));
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el número a redondear: ");
        System.out.print("Numero: ");
        num1 = sc.nextDouble();
        System.out.println("El resultado de redondear el número " + num1 + " es: " + Math.round(num1));
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca los números a elevar: ");
        System.out.print("Numero 1: ");
        num1 = sc.nextDouble();
        System.out.print("Numero 2: ");
        num2 = sc.nextDouble();
        System.out.println(num1 + " elevado a " + num2 + " es igual a: " + Math.pow(num1, num2));
        System.out.println("-----------------------------------------------");
        
    }
    
}

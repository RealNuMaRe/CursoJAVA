package Condicionales;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

import java.util.*;

public class EvaluarEdad_IfElse {
    
    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES
        int edad;
        
        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();
        
        if (edad >= 0 && edad <= 1) {
            System.out.println("Esta en la etapa de infante.");
        } else if (edad > 1 && edad < 3) {
            System.out.println("Esta en la etapa de bebé");
        } else if (edad >= 3 && edad <= 6) {
            System.out.println("Esta en la etapa pre-escolar.");
        } else if (edad >= 7 && edad <= 11) {
            System.out.println("Esta en la etapa escolar.");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Esta en la etapa de adolescente.");
        } else if (edad > 18 && edad < 30) {
            System.out.println("Esta en la etapa de adulto joven.");
        } else if (edad >= 30 && edad <= 50) {
            System.out.println("Esta en la etapa de adulto medio.");
        } else if (edad > 50 && edad <= 65) {
            System.out.println("Esta en la etapa de madurez.");
        } else if (edad > 65) {
            System.out.println("Esta en la etapa de la tercera edad.");
        } else {
            System.out.println("Aún no ha nacido.");
        }
    }
    
}

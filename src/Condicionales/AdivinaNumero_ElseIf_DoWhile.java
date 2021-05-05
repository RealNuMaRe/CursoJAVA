package Condicionales;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class AdivinaNumero_ElseIf_DoWhile {
    
    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES
        int num = 0;
        int intentos;
        int numAleatorio = (int)(Math.random()*100);
        int contador = 0;
        
        while (num != numAleatorio) {
            
            System.out.print("\nIntroduzca un n�mero: ");
            num = sc.nextInt();
            
            if (numAleatorio > num) {
                
                System.out.println("N�mero incorrecto. Introduzca un n�mero m�s grande.");
                contador++;
                
            } else if (numAleatorio < num) {
                
                System.out.println("N�mero incorrecto. Introduzca un n�mero m�s peque�o.");
                contador++;
                
            } else {
                
                System.out.println("N�mero correcto.");
                System.out.print("N�mero de intentos totales: " + contador + ".");
                
            }
            
        }
        
    }
    
}

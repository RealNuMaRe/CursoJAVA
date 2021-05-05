package Arrays;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class Uso_Arrays {
    
    public static void main (String [] args) {
        
        //VARIABLES
        int [] mi_matriz1 = new int[5];
        
        mi_matriz1[0] = 5;
        mi_matriz1[1] = 38;
        mi_matriz1[2] = -15;
        mi_matriz1[3] = 92;
        mi_matriz1[4] = 71;
        
        System.out.println("Primera parte");
        for (int i = 0; i < mi_matriz1.length; i++) {
            
            System.out.println("El valor de la posición " + i + " es: " + mi_matriz1[i]);
            
        }
        
        System.out.println("\nSegunda parte");
        int [] mi_matriz2 = {5, 38, -15, 92, 71};
        
        for (int i = 0; i < mi_matriz2.length; i++) {
            
            System.out.println("El valor de la posición " + i + " es: " + mi_matriz2[i]);
            
        }
        
    }
    
}

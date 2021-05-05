package Arrays;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class Uso_Arrays2_ForEach {
    
    public static void main (String [] args) {
        
        //VARIABLES
        String [] paises1 = new String [8];
        
        paises1[0] = "España";
        paises1[1] = "México";
        paises1[2] = "Colombia";
        paises1[3] = "Perú";
        paises1[4] = "Chile";
        paises1[5] = "Argentina";
        paises1[6] = "Ecuador";
        paises1[7] = "Venezuela";
        
        System.out.println("Primera parte");
        for (int i = 0; i < paises1.length; i++) {
            
            System.out.println("País " + (i+1) + " " + paises1[i] + ".");
            
        }
        
        String [] paises2 = {"España","México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};
        System.out.println("\nSegunda parte");
        for (String elemento:paises2) {
            
            System.out.println("País " + elemento);
            
        }
        
    }
    
}

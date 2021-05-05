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
        
        paises1[0] = "Espa�a";
        paises1[1] = "M�xico";
        paises1[2] = "Colombia";
        paises1[3] = "Per�";
        paises1[4] = "Chile";
        paises1[5] = "Argentina";
        paises1[6] = "Ecuador";
        paises1[7] = "Venezuela";
        
        System.out.println("Primera parte");
        for (int i = 0; i < paises1.length; i++) {
            
            System.out.println("Pa�s " + (i+1) + " " + paises1[i] + ".");
            
        }
        
        String [] paises2 = {"Espa�a","M�xico", "Colombia", "Per�", "Chile", "Argentina", "Ecuador", "Venezuela"};
        System.out.println("\nSegunda parte");
        for (String elemento:paises2) {
            
            System.out.println("Pa�s " + elemento);
            
        }
        
    }
    
}

package Arrays;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class Uso_Arrays3_ForEach {
    
    public static void main (String [] args) {
        
        int [] matrizRandom = new int [150];
        
        System.out.println("Primera parte");
        for (int i = 0; i < matrizRandom.length; i++) {
            
            matrizRandom [i] = (int) Math.round(Math.random() * 100);
            
        }
        
        for (int numeros:matrizRandom) {
            
            System.out.print(numeros + " ");
            
        }
        
    }
    
}

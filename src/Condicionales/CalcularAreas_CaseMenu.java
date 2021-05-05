package Condicionales;

import java.util.*;
import javax.swing.*;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class CalcularAreas_CaseMenu {
    
    public static void main (String [] args) {
        
        //KEYBOARD
        Scanner sc = new Scanner(System.in);
        
        //VARIABLES
        int option;
        
        System.out.println("Seleccione una opción: "
                + "\n1: Cuadrado."
                + "\n2: Rectángulo."
                + "\n3: Triángulo."
                + "\n4: Círculo.");
        
        System.out.print("Opción: ");
        option = sc.nextInt();
        
        switch (option) {
            
            case 1: {
                
                System.out.println("Datos cuadrado");
                String ladoS = JOptionPane.showInputDialog("Introduzca el lado en cm: ");
                double lado = Double.parseDouble(ladoS);
                double area = Math.pow(lado, 2);
                System.out.printf("\nEl área del rectángulo es: %.2f", area);
                break;
                
            }
            
            case 2: {
                
                System.out.println("Datos rectángulo");
                String baseS = JOptionPane.showInputDialog("Introduzca la base en cm: ");
                double base = Double.parseDouble(baseS);
                String alturaS = JOptionPane.showInputDialog("Introduzca el lado en cm: ");
                double altura = Double.parseDouble(alturaS);
                System.out.printf("\nEl área del rectángulo es: %.2f", (base * altura));
                break;
                
            }
            
            case 3: {
                
                System.out.println("Datos triángulo");
                String baseS = JOptionPane.showInputDialog("Introduzca la base en cm: ");
                double base = Double.parseDouble(baseS);
                String alturaS = JOptionPane.showInputDialog("Introduzca el lado en cm: ");
                double altura = Double.parseDouble(alturaS);
                System.out.printf("\nEl área del rectnángulo es: %.2f", (base * altura) / 2);
                break;
                
            }
            
            case 4: {
                
                System.out.println("Datos círculo");
                String radioS = JOptionPane.showInputDialog("Introduzca el radio del círcuo: ");
                double radio = Double.parseDouble(radioS);
                System.out.printf("\nEl área del círculo es: %.2f", Math.PI * Math.pow(radio, 2));
                break;
                
            }
            
            default: {
                
                System.out.println("ERROR - La opción introducida no existe.");
                
            }
            
        }
    }
    
}

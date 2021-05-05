package PrimerosPasos;

// Alberto Brunet Llinas
// Source - JDK 16
// Encoding - ISO-8859-1

public class UsoStrings {
    
    public static void main (String [] args) {
        
        //VARIALBES PRIMERA PARTE
        String nombre = "Alberto";
        
        System.out.println("\nPrimera parte");
        System.out.println("Mi nombre es: " + nombre + ".");
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("La priemra letra de mi nombre es: " + nombre.charAt(0));
        System.out.println("La última letra de mi nombre es: " + nombre.charAt(nombre.length() -1) + ".");
        
        //VARIABLES SEGUNDA PARTE
        String frase = "Hoy es un estupendo día para aprender a programar en JAVA.";
        
        System.out.println("\nSegunda parte");
        System.out.println("Los primeros 10 caracteres de la frase: " + frase + " son: " + frase.substring(0, 9));
        
        //VARIABLES TERCERA PARTE
        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "Juan";
        
        System.out.println("\nTercera parte");
        // ¿Es igual?
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        // ¿Es diferente?
        System.out.println(!alumno1.equalsIgnoreCase(alumno2));
    }
    
}

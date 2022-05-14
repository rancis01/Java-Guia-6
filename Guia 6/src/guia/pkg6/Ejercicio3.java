/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6;

import java.util.Scanner;

/**
 *
 * @author PCFRAN
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase");
        
        String frase = leer.nextLine();
        String fraseMinuscula = frase.toLowerCase();
        String fraseMayuscula = frase.toUpperCase();
        System.out.println("Su frase en Minúsculas es: " + fraseMinuscula); 
        System.out.println("Su frase en Mayúsculas es: " + fraseMayuscula);
        System.out.println("");
    }
}

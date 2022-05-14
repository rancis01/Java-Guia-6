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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Escribe tu nombre");
        String nombre = leer.nextLine();
        String ingreso = nombre;
        System.out.println("Su nombre es: " + ingreso);
   
    }
    
}

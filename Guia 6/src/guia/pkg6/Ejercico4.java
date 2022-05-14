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
public class Ejercico4 {

    /**
    Dada una cantidad de grados centígrados
    * se debe mostrar su equivalente 
    * en grados Fahrenheit. 
    * La fórmula correspondiente
    * es: F = 32 + (9 * C / 5).
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centígrados");
        
        int temperatura = leer.nextInt();
       int conversion;
       conversion = 32 + (9* temperatura / 5);
       
        System.out.println("La temperatura en grados Fahrenheit es: " + conversion);
        // TODO code application logic here
    }
    
}

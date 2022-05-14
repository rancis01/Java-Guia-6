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
public class Ejerccio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
       
         int num1 = leer.nextInt();
         
                 System.out.println("Ingrese otro numero entero");
       
         int num2 = leer.nextInt();
         
         int sumar = (num1 + num2);
           
         System.out.println("La suma de los dos numeros ingresados es: " + sumar );
                 
    }
    
}

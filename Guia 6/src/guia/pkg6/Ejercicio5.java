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
public class Ejercicio5 {

    /**
     * Escribir un programa que lea un número entero por teclado
     * y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
     * Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un número entero");
        
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        
        System.out.println(" El doble de su número es: " + doble);
        
                System.out.println(" El triple de su número es: " + triple);
                
                        System.out.println(" La raíz cuadrada de su número es: " + raiz);
                        
        System.out.println(" Que tal Pascual !! ");
                        
                        
        
        
        // TODO code application logic here
    }
    
}

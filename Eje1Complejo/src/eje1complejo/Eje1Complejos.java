/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje1complejo;



/**
 *
 * @author Victoria
 */
public class Eje1Complejos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Complejo complejoA = new Complejo(3, 5);
        Complejo complejoB = new Complejo(4, 1);
        
        Complejo sumaComplejos = complejoA.sumar(complejoB);
        Complejo restaComplejos = complejoA.restar(complejoB);
        
        System.out.println("La suma de " + complejoA + " + " + complejoB + " es: " + sumaComplejos);
        System.out.println("La resta de " + complejoA + " - " + complejoB + " es: " + restaComplejos);
    }

    
}

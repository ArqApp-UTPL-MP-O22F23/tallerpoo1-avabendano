/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje1racional;

import modelo.Racional;

/**
 *
 * @author Victoria
 */
public class Eje1Racional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Suma
        // se instancia un racional en el objeto r1
        Racional ra1 = new Racional(5, 5);
        Racional ra2 = new Racional(6, 4);
        Racional suma = ra1.sumar(ra2);
        System.out.println("Suma de 5/5 + 6/4");
        System.out.println(suma);

        //Resta
        Racional ra3 = new Racional(8, 2);
        Racional ra4 = new Racional(3, 2);
        Racional resta = ra3.restar(ra4);
        System.out.println("Resta de 8/2 - 3/2");
        System.out.println(resta);

    }
}

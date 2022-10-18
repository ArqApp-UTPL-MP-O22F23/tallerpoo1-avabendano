/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje1complejo;

/**
 *
 * @author Victoria
 */
public class Complejo implements ComplejoI {

    private double entera;
    private double imaginaria;

    public double getEntera() {
        return entera;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public Complejo() {
        this.entera = 0.0;
        this.imaginaria = 0.0;
    }

    public Complejo(double entera, double imaginaria) {
        this.entera = entera;
        this.imaginaria = imaginaria;
    }

    @Override
    public Complejo sumar(Complejo otro) {
        double entera = this.entera + otro.getEntera();
        double imaginaria = this.imaginaria + otro.getImaginaria();

        Complejo resultado = new Complejo(entera, imaginaria);

        return resultado;
    }

    @Override
    public Complejo restar(Complejo otro) {
        double entera = this.entera - otro.getEntera();
        double imaginaria = this.imaginaria - otro.getImaginaria();

        Complejo resultado = new Complejo(entera, imaginaria);

        return resultado;
    }

    @Override
    public String toString() {
        String complejoStr = String.valueOf(this.entera) + "+" + String.valueOf(this.imaginaria) + "i";
        return complejoStr;
    }
}

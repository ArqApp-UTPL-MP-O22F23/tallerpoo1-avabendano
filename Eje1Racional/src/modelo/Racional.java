/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Victoria
 */
public class Racional implements RacionalI {

    private int denominador;
    private int numerador;

    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
// se reduce el numero racional a su valor minimo
// 2/4 -> 1/2
        for (int i = numerador; i > 1; i--) {
            boolean auxNum = numerador % i == 0;
            boolean auxDen = denominador % i == 0;

            if (auxNum && auxDen) {
                numerador = numerador / i;
                denominador = denominador / i;
            }
        }
        this.numerador = numerador;
        this.denominador = denominador;

    }

    @Override // esta sobreescribiendo un metodo de la interfaz RacionalI
    public Racional sumar(Racional otro) {
        int num = this.numerador * otro.denominador + this.denominador * otro.numerador;
        int deno = this.denominador * otro.denominador;

        return new Racional(num, deno);
    }

    @Override
    public Racional restar(Racional otro) {
        int num = this.numerador * otro.denominador - this.denominador * otro.numerador;
        int deno = this.denominador * otro.denominador;

        return new Racional(num, deno);
    }

    @Override
    public String toString() {
        return String.format("Resultado racional :%d/%d", this.numerador, this.denominador);
    }

}

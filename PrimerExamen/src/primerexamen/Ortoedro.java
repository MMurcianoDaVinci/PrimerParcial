/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerexamen;

/**
 *
 * @author marti
 */
public class Ortoedro extends FiguraTridimensional {

    /* ATRIBUTOS */
    double ancho;
    double base;
    double altura;

    /* CONSTANTE */
    final int CARAS = 6;

    /* CONSTRUCTORES */
    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro() {
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }

    /* METODOS */
    @Override
    public double calcularVolumen() {
        return this.ancho * this.base * this.altura;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (this.ancho * this.base) + 2 * (this.ancho * this.altura) + 2 * (this.base * this.altura);
    }

    @Override
    public String toString() {
        return "La figura es un Ortoedro";
    }

}

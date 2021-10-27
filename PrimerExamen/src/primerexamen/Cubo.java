/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerexamen;

/**
 *
 * @author marti
 */
public class Cubo extends FiguraTridimensional {

    /* ATRIBUTO */
    double lado;

    /* CONSTANTE */
    final int CARAS = 6;

    /* CONSTRUCTORES */
    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        this.lado = 1;
    }

    /* METODOS */
    @Override
    public double calcularVolumen() {
        return Math.pow(this.lado, 3);
    }

    @Override
    public double calcularSuperficie() {
        return 6 * Math.pow(this.lado, 2);
    }

    @Override
    public String toString() {
        return "La figura es un cubo";
    }

}

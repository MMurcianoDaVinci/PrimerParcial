/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerexamen;

/**
 *
 * @author marti
 */
public class TetraedroRegular extends FiguraTridimensional {

    /* ATRIBUTO */
    double arista;

    /* CONSTANTE */
    final int CARAS = 4;

    /* CONSTRUCTORES */
    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular() {
        this.arista = 1;
    }

    /* METODOS */
    @Override
    public double calcularVolumen() {
        return (Math.sqrt(2)) * (Math.pow(this.arista, 3)) / 12;
    }

    @Override
    public double calcularSuperficie() {
        return (Math.sqrt(3)) * (Math.pow(this.arista, 2));
    }

    @Override
    public String toString() {
        return "La figura es un TetraedroRegular";
    }

}

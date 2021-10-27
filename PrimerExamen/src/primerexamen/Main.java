/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerexamen;

/**
 *
 * @author marti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* INSTANCIA Y METODOS OBJETO ORTOEDRO */
        Ortoedro ortoedro = new Ortoedro(1, 3, 2);
        
        System.out.println(ortoedro);
        System.out.println("Volumen: " + ortoedro.calcularVolumen());
        System.out.println("Superficie: " + ortoedro.calcularSuperficie());
        
        /* INSTANCIA Y METODOS OBJETO CUBO */
        Cubo cubo = new Cubo(3);
        
        System.out.println(cubo);
        System.out.println("Volumen: " +cubo.calcularVolumen());
        System.out.println("Superficie: " +cubo.calcularSuperficie());
        
        /* INSTANCIA Y METODOS OBJETO TETRAEDROREGULAR */
        TetraedroRegular tetraedroRegular = new TetraedroRegular(2);
        
        System.out.println(tetraedroRegular);
        System.out.println("Volumen: " +tetraedroRegular.calcularVolumen());
        System.out.println("Superficie: " + tetraedroRegular.calcularSuperficie());

    }

}

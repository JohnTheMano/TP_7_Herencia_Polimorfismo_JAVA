/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_y_polimorfismo;

/**
 *
 * @author Win
 */
public class Rectangulo extends FiguraGeometrica {
    private double lado_menor;
    private double lado_mayor;

    public Rectangulo(double lado_menor, double lado_mayor, String nombre) {
        super(nombre);
        this.lado_menor = lado_menor;
        this.lado_mayor = lado_mayor;
    }
    
    @Override
    public double calcularArea() {
        return lado_menor * lado_mayor;
    }
    
}

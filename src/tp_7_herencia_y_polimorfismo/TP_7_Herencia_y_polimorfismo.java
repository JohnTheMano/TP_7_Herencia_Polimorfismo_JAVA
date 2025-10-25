/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_7_herencia_y_polimorfismo;
import java.util.ArrayList;
/**
 *
 * @author Win
 */
public class TP_7_Herencia_y_polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto(5, "Dodge","Journey");
        auto1.mostrarInfo();
        
        Circulo circulo1 = new Circulo("Circulo",10);
        Rectangulo rectangulo1 = new Rectangulo(3,6,"Rectangulo");
        
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo1);
        figuras.add(rectangulo1);
        
        for(FiguraGeometrica figura:figuras){
            System.out.println("La figura es un: " + figura.getNombre());
            System.out.println("Superficie: "+ figura.calcularArea()+ " m2");
            
        }
    }
    
}

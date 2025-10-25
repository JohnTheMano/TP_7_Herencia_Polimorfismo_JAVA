/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_y_polimorfismo;

/**
 *
 * @author Win
 */
public abstract class FiguraGeometrica {
    private String nombre;
    
    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }
    
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "nombre=" + nombre + '}';
    }
    
    
    }
    


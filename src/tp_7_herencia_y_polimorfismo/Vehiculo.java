/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_y_polimorfismo;

/**
 *
 * @author Win
 */
public class Vehiculo {
    private String marca ;
    private String modelo ;
    
    public void mostrarInfo(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo);
    }

    public Vehiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    }
    
}

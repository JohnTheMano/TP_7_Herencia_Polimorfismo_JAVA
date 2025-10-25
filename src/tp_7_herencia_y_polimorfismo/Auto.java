/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_y_polimorfismo;

/**
 *
 * @author Win
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas; 
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: "+this.cantidadPuertas);
    }

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    
    }
    


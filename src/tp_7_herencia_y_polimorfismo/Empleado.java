/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_7_herencia_y_polimorfismo;

/**
 *
 * @author Win
 */
public abstract class Empleado {
    
    
    public double calcularSueldo(Empleado emp){
        if (emp instanceof EmpleadoPlanta){
            return 1000000;
        } 
        else if(emp instanceof EmpleadoTemporal){
            return 600000;
        }
        else{
            return 0;
        }
        
    }
    
    
}

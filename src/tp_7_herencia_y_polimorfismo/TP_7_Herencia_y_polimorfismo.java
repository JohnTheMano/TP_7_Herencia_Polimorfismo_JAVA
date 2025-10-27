package tp_7_herencia_y_polimorfismo;

import java.util.ArrayList;

/**
 * Clase principal donde se ejecuta el programa
 */
public class TP_7_Herencia_y_polimorfismo {

    /**
     * Método main: punto de entrada del programa
     */
    public static void main(String[] args) {
        
        // Creamos un objeto Auto y mostramos su información
        Auto auto1 = new Auto(5, "Dodge","Journey");
        auto1.mostrarInfo();
        
        // Creamos figuras geométricas
        Circulo circulo1 = new Circulo("Circulo",10);
        Rectangulo rectangulo1 = new Rectangulo(3,6,"Rectangulo");
        
        // Creamos una lista para guardar figuras y agregamos las creadas
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo1);
        figuras.add(rectangulo1);
        
        // Recorremos la lista de figuras y mostramos su nombre y superficie
        for(FiguraGeometrica figura : figuras){
            System.out.println("La figura es un: " + figura.getNombre());
            System.out.println("Superficie: "+ figura.calcularArea()+ " m2");
        }
        
        // Creamos una lista para guardar empleados
        ArrayList <Empleado> empleados = new ArrayList<>();
        
        // Creamos empleados de planta y temporales
        EmpleadoPlanta empPlanta1= new EmpleadoPlanta();
        EmpleadoPlanta empPlanta2= new EmpleadoPlanta();
        EmpleadoTemporal empTemporal1= new EmpleadoTemporal();
        EmpleadoTemporal empTemporal2= new EmpleadoTemporal();
        
        // Agregamos los empleados a la lista
        empleados.add(empPlanta1);
        empleados.add(empPlanta2);
        empleados.add(empTemporal1);
        empleados.add(empTemporal2);
        
        // Recorremos la lista de empleados y mostramos su sueldo
        for(Empleado emp : empleados){
            System.out.println("El sueldo del empleado es: " + emp.calcularSueldo(emp));
        }
        
        // Creamos una lista para guardar animales
        ArrayList <Animal> listaAnimales = new ArrayList<>();
        
        // Creamos algunos animales
        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Vaca vaca1 = new Vaca();
        
        // Agregamos los animales a la lista
        listaAnimales.add(perro1);
        listaAnimales.add(gato1);
        listaAnimales.add(vaca1);
        
        // Recorremos la lista de animales y hacemos que cada uno haga su sonido
        for(Animal ani : listaAnimales){
            ani.hacerSonido();
        }
    }
}

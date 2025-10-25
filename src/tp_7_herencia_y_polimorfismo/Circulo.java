package tp_7_herencia_y_polimorfismo;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}

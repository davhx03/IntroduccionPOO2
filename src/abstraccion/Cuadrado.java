package abstraccion;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(String tipo, String color, int lado) {
        super(tipo, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro(){
        return lado*4;
    }
}

package abstraccion;

public class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(String tipo, String color, int base, int altura) {
        super(tipo, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura/2;
    }
}

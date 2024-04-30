package abstraccion;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Cuadrado","Rojo",3);
        Triangulo triangulo = new Triangulo("Triangulo", "Verde",3,5);
        Circulo circulo = new Circulo("Circulo", "Amarillo", 6);

        cuadrado.mostrarInformacionFigura();
        triangulo.mostrarInformacionFigura();
        circulo.mostrarInformacionFigura();
    }
}

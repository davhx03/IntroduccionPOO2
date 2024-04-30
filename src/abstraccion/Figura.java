package abstraccion;

public abstract class Figura {
    private String tipo;
    private String color;

    public Figura(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public void mostrarInformacionFigura(){
        System.out.println("El tipo es: "+ this.tipo+" \nEl color es: "+this.color+"\nEl área es: "+calcularArea()+"\n");


    }
    public abstract double calcularArea();
}

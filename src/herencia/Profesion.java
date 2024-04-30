package herencia;

public class Profesion {
    private String nombre;
    private int sueldoBase;
    //protected int sueldoBase

    //Construnctor
    public Profesion(String nombre, int sueldoBase){
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    //Métodos
    public int calcularSueldoMensual(){
        return this.sueldoBase;
    }
    public double calcularAportePension(){
        return this.sueldoBase*0.16;
    }

    public int getSueldoBase() {
        return this.sueldoBase;
    }
}

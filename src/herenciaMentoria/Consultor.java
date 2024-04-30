package herenciaMentoria;

public class Consultor extends Trabajador {
    private int horas;
    private double tarifa;

    public Consultor(String nombre, int horas, double tarifa) {
        //Solo lo que está en el constructor de trabajador se heredará.
        super(nombre);
        this.horas = horas;
        this.tarifa = tarifa;

    }
@Override
    public double calcularPago() {
        return (horas*tarifa);
    }
    @Override
    public String toString(){
        return "Consultor: "+ super.toString();
    }
}

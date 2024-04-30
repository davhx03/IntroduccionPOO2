package herenciaMentoria;

public class Empleado extends Trabajador{
    private double sueldo;
    private double deducciones;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.deducciones = 0.45*sueldo;
    }

   //El IDE identifica que va un @Override, así que no se hace mandato escribirlo
    public double calcularPago() {
        return (sueldo-deducciones);
    }

    public String toString(){
        return "Empleado: "+ super.toString();
    }
}

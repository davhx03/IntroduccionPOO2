package herenciaMentoria;

public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Jorge");
        Empleado empleado = new Empleado("Armando",1200000);
        Consultor consultor = new Consultor("Carlos",150,70000);

        System.out.println(trabajador);
        System.out.println(consultor);
        System.out.println(empleado);

        //Polimorfismo
        Trabajador[] trabajadores = new Trabajador[2];
        trabajadores[0]= new Empleado("Jorge", 1200000);
        trabajadores[1] = new Consultor("Juan",50,50000);
        for (int i=0; i<2;i++){
            System.out.println(trabajadores[i].calcularPago());
        }
    }
}

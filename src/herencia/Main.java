package herencia;

public class Main {
    public static void main(String[] args) {
        Medico medicoAna = new Medico("San Vicente","12345","Medico",10000);
        Ingeniero ingenieroJuan = new Ingeniero("Parque del rio","Suba","Ingeniero",20000);
        //Calcular el aporte a pensiona sobre el 17% para el ingeniero
        //Sobre escribir el método calcularPendion
        //Polimorfirmso:

        double aportePensionAna = medicoAna.calcularAportePension();
        double aportePensionJuan = ingenieroJuan.calcularAportePension();
        System.out.println(aportePensionAna);
        System.out.println(aportePensionJuan);
    }
}

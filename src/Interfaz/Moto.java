package Interfaz;

public class Moto implements Reservable {
    private String placa;
    private String fabricacion;
    private String cilindraje;
    private String marca;
    private boolean disponibilidad;

    public Moto(String placa, String fabricacion, String cilindraje, String marca) {
        this.placa = placa;
        this.fabricacion = fabricacion;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.disponibilidad = disponibilidad;

    }

    public String getPlaca() {
        return placa;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public String getMarca() {
        return marca;
    }



    @Override
    public int reservar(String fechaInicio, String fechaFin) {
        if(disponibilidad){
            this.disponibilidad = false;
        }
        return 1000;
    }

    @Override
    public boolean retornar() {
        //Validar que la moto este en buen estado
        //validar la identidad de la persona entregando
        //generar factura
        return false;
    }

    @Override
    public void soporte(String mensaje) {
        System.out.println("Llamando soporte desde la motocicleta");
    }
}


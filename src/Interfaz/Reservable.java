package Interfaz;

public interface Reservable {
    //Es un contrato
    //Métodos no implementados
     int reservar(String fechaInicio, String fechaFin);
     boolean retornar();
     void soporte(String mensaje);
}

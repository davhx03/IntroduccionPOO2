package Interfaz;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC123","2019","1000","mercedez");
        Moto moto = new Moto("CDE456","2018","250","hONDA");
        carro.soporte("Ayuda");
        moto.soporte("estoy pinchado");
        carro.retornar();
    }
}

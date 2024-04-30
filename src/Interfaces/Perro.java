package Interfaces;

public class Perro extends Animal{
    private String tamanio;

    public String getTamanio() {
        return tamanio;
    }

    public Perro(String tamanio) {
        this.tamanio = tamanio;
    }
}

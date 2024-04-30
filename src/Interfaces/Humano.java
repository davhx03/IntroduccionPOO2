package Interfaces;
//Clase padre
public class Humano implements InterfazGeneral, InterfazAccionesHumano{
    private int cedula;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public void desplazarse() {
        System.out.println("El humano se está desplazando con cedula "+cedula);
    }

    @Override
    public void jugar() {
        System.out.println("El humano está jugando con cédula "+ cedula);
    }

    @Override
    public void alimentarse() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void bailar(String nombre) {
        System.out.println(nombre+" está bailando");
    }

    @Override
    public void trabajar(String nombre, int cedula) {
        System.out.println(nombre+" con cédula "+cedula+ "está trabajando");
    }
    public void razonar(){
        System.out.println("El humano está razonando, desde la clase humano");
    }

}

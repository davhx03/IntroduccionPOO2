package Interfaces;

public class Animal implements InterfazGeneral{
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void desplazarse() {
        System.out.println("El animal de raza "+raza+" se está desplazando desde la clase animal");
    }

    @Override
    public void jugar() {
        System.out.println("El animal de raza "+ raza + " está jugando desde la clase animal");

    }

    @Override
    public void alimentarse() {

    }

    @Override
    public void dormir() {

    }
    public void cazar(){
        System.out.println("El animal de raza "+raza+"está cazando desde la clase animal");
    }
}

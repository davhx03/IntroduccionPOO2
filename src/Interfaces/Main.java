package Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.setRaza("Doberman");
        perro.cazar();
        perro.desplazarse();
        perro.alimentarse();
        perro.alimentarse();
        perro.jugar();

        System.out.println("******************");

        Humano persona = new Humano();
        persona.setCedula(1234567890);
        persona.alimentarse();
        persona.desplazarse();
        persona.jugar();
        persona.razonar();

        System.out.println("**********************");

        Hombre julio = new Hombre();
        julio.setCedula(987654321);
        julio.setNombre("Julio");
        julio.razonar();
        julio.desplazarse();
        julio.jugar();
        julio.trabajar(julio.getNombre(), julio.getCedula());

        System.out.println("*************************************");

    }
}

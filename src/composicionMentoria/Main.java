package composicionMentoria;

public class Main {
    public static void main(String[] args){
        Direccion direccion= new Direccion("Calle 24", "35", "23", "Medellin","Envigado");
        FechaNacimiento fechaNacimiento = new FechaNacimiento(1895,07,12);
        Cliente cliente1 = new Cliente("Carlos","Mejia","Castro",fechaNacimiento,direccion);

        System.out.println(cliente1.toString());
    }
}

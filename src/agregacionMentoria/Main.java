package agregacionMentoria;

public class Main {
    public static void main(String[] args) {
        Tortuga pericles = new Tortuga("Pericles");
        Tortuga tortugaGalapago = new Tortuga("Galapago");
        Tortuga tortugaVerde = new Tortuga("Verde");

        //Crear el vector u arreglo
        Tortuga lista[] = new Tortuga[3];

        //Asignar tortugas al vector

        Tortuguero tortuguero = new Tortuguero("Tortugas en la zona");
        tortuguero.setLista(lista);
        tortuguero.nombreTortugas();
        //Tarea, imprimir la descripción
    }
}

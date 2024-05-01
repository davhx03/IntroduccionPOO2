package Interfaces_Biblioteca;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se ubican los usuario dentro de un arreglo
        Usuario[] usuario = new Usuario[2];
        usuario[0]= new Usuario("Andrea");
        usuario[1]= new Usuario("Mario");
        //Se le pide al usuario identificarse
        System.out.println("Ingrese su ID de Usuario: ");
        for(int i=0; i<usuario.length;i++){
            int id = i+1;
            System.out.println(id+". "+usuario[i].getNombre());
        }
        //Se toma la posición ingresada por el usuario dentro del arreglo, este es el usuario con el cual se trabajará
       int idUsuario = scanner.nextInt();
        idUsuario=idUsuario-1;
        //Se define el arreglo de libros

        Libro[] libreria= new Libro[3];
        libreria[0] =new Libro("Cien años de soledad","Gabriel García Marquez","abc123");
        libreria[1] = new Libro("El amor en tiempos de cólera", "Gabriel Garcia Marquez","cde432");
        libreria[2] = new Libro("El secreto", "Rhonda Byrne","xyz890");

        System.out.println("Hola "+usuario[idUsuario].getNombre()+"!\nIngrese el libro de su interés: ");
        //Se le pide al usuario que ingrese el id del libro en el que está interesado, el usuario ingresará un número por consola
        for(int i=0; i<= 2 ;i++){
            int id = i+1;
            System.out.println(id +". "+ libreria[i].getTitulo());
        }
        int idLibro = scanner.nextInt();
        idLibro=idLibro-1;
        System.out.println("Usted ha elegido el libro "+libreria[idLibro].getTitulo());
        System.out.println("Ingrese la opción que desea ejecutar: \n1. Solicitar prestamo del libro\n2.Reservar el prestamo del libro\n3.Realizar la devolución del libro");
        int opcion = scanner.nextInt();
        boolean imprimirMenu = true;

            switch (opcion) {
                case 1:
                    libreria[idLibro].prestar(usuario[idUsuario]);
                    System.out.println("El nuevo estado del libro es:" + libreria[idLibro] + "\n");
                    break;
                case 2:
                    libreria[idLibro].reservar();
                    System.out.println("El nuevo estado del libro es:" + libreria[idLibro] + "\n");
                    break;
                case 3:
                    libreria[idLibro].devolver();
                    System.out.println("El nuevo estado del libro es:" + libreria[idLibro] + "\n");
                    break;
        }
    }
}

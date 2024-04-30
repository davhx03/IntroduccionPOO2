package Interfaces_Biblioteca;

public class Usuario {
    private String nombre;
    private Libro libroPrestado;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLibroPrestado(Libro libro) {
        this.libroPrestado = libro;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre: '" + nombre + '\'' +
                ", libro prestado: " + libroPrestado +
                '}';
    }
}

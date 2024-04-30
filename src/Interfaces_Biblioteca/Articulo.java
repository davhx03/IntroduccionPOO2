package Interfaces_Biblioteca;

public class Articulo {
    private String titulo;
    private String Autor;

    public Articulo(String titulo, String autor) {
        this.titulo = titulo;
        Autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}

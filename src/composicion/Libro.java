package composicion;

public class Libro {
    private String titulo;
    private String anioPublicacion;
    private Autor autor;

    public Libro(String titulo, String anioPublicacion, Autor autor){
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor=autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getNombreAutor(){
        return this.autor.getNombre();
    }
}

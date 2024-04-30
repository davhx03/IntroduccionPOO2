package Interfaces_Biblioteca;

public class Libro extends Articulo implements Prestable, Reservable{
    private String codigo;
    private Usuario usuario;
    //Este atributo indicará si el libro está prestado o está disponible

    private boolean prestado;
    //True indica qu el libro está prestado
    //False indica que el libro está disponible para ser prestado.
    private boolean reservado;
    //True está reservado por un Usuario.
    //False si está disponible para ser prestado o reservado.


    public Libro(String titulo, String autor, String codigo) {
        super(titulo, autor);
        this.codigo = codigo;
        this.prestado = false;
        this.reservado = false;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void prestar(Usuario usuario) {
        //Verificar si el libro está disponible
        if(!prestado && !reservado){
            prestado = true;
            setUsuario(usuario);
            //Si no está prestado ni reservado previamente por un usuario
            System.out.println("El libro "+ getTitulo()+ "se prestó exitosamente.");
        } else{
            System.out.println("El libro no está disponible para ser prestado.");
        }
    }

    //Registrar la devolución de un libro prestado
    @Override
    public void devolver() {
        if(prestado){
            prestado=false;
            System.out.println("Libro "+ getTitulo()+ "ha sido devueldo");
        }else{
            System.out.println("El libro no estaba prestado");
        }
    }

    @Override
    public void reservar() {
        //Este libre para ser prestado o reservado
        if(!reservado && prestado){
            reservado = true;
            System.out.println("El libro "+getTitulo()+"ha sido reservado con éxito");
        }else{
            System.out.println("El libro ya fue reservado o no está prestado");
        }

    }

    @Override
    public String toString() {
        return "Libro{" +
                "título: "+ getTitulo()+
                " codigo:'" + codigo + '\'' +
                ", usuario: " + usuario.getNombre() +
                ", prestado: " + prestado +
                ", reservado: " + reservado +
                '}';
    }
}

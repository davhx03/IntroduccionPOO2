public class Persona {
    private String nombre;
    private String identificacion;
    private String nacionalidad;
    private  int edad;
    private String sexo;
    //Constructores
    //[publico] + nombre clase + los argumentos
    //Argumentos metodos(tipo de dato +  nombre del argumento)

    public Persona(String nombre, String identificacion, String nacionalidad, int edad, String sexo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
}

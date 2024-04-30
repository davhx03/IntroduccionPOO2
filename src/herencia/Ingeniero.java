package herencia;

public class Ingeniero extends Profesion{
    private String nombreObra;
    private String ubicacionObra;

    public Ingeniero(String nombreObra, String ubicacionObra,String nombre, int sueldoBase){
        super(nombre, sueldoBase);
        this.nombreObra = nombreObra;
        this.ubicacionObra = ubicacionObra;
    }
    @Override
    public double calcularAportePension(){
        //Si se deja como protegido el atributo sueldo base, se puede acceder sin necesidad del getter
        //return this.SueldoBase()*0.17;
        return this.getSueldoBase()*0.17;
    }
    public String getNombreObra() {
        return nombreObra;
    }

    public String getUbicacionObra() {
        return ubicacionObra;
    }
}

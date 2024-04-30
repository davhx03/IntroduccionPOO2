package herencia;

public class Medico extends Profesion{
    private String nombreHospital;
    private String tarjetaProfesional;

    public Medico(String nombreHospital, String tarjetaProfesional, String nombre, int sueldoBase){
        super(nombre, sueldoBase);
        this.nombreHospital = nombreHospital;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }
}

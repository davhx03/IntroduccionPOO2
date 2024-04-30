public class Main {
    public static void main(String[] args) {
        Persona personaDavid = new Persona("David","12345","COL",21,"M");
        System.out.println(personaDavid.getNombre());
        System.out.println(personaDavid.getIdentificacion());
        personaDavid.setNacionalidad("MEX");
        System.out.println(personaDavid.getNacionalidad());

    }
}
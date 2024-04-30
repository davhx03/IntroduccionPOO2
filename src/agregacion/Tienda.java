package agregacion;

public class Tienda {
    private String ubicacion;
    private String nombre;
    private Cliente[] clientes;
    private int contadorClientes; //un atributo para contar el numero de clientes
    public Tienda(String ubicacion, String nombre){
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        //Se crea un arreglo vacío de clientes
        this.clientes = new Cliente[4];
        this.contadorClientes = 0;
    }
    public void agregarCliente(Cliente cliente){
        if(this.contadorClientes < this.clientes.length){ //lenght es 4
            this.clientes[contadorClientes] = cliente;
            this.contadorClientes++;
        } else{
            System.out.println("NO SE PUEDEN AGREGAR MÁS CLIENTES");
        }
    }
    //TAREA: Imprimir los clientes
}

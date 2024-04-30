package agregacion;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Bogotá", "Al agua patos");
        Cliente cliente1 = new Cliente("Rosa","123abc",58);
        tienda.agregarCliente(cliente1);
        Cliente cliente2 = new Cliente("Pepe","1111",25);
        tienda.agregarCliente(cliente2);

    }
}

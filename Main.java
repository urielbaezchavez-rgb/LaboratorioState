public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA 1: Flujo Normal de Pedido ---");
        Pedido pedido1 = new Pedido();
        pedido1.mostrarEstado(); // EstadoPendiente

        pedido1.procesar();      // Transición a EstadoProcesado
        pedido1.mostrarEstado();

        pedido1.enviar();        // Transición a EstadoEnviado
        pedido1.mostrarEstado();

        pedido1.entregar();      // Transición a EstadoEntregado
        pedido1.mostrarEstado();

        System.out.println("\n--- PRUEBA 2: Validacion de Operaciones Invalidas ---");
        Pedido pedido2 = new Pedido();
        pedido2.enviar();        // ERROR: No se puede enviar un pedido pendiente
        pedido2.cancelar();      // Cancela el pedido
        pedido2.procesar();      // ERROR: No se puede procesar un pedido cancelado
        pedido2.mostrarEstado();
    }
}
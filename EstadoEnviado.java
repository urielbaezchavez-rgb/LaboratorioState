public class EstadoEnviado implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya fue procesado y enviado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERROR: No se puede cancelar un pedido que ya va en camino");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya se encuentra enviado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Entregando pedido al cliente...");
        pedido.setEstado(new EstadoEntregado());
    }
}
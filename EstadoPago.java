// EstadoPago.java
public class EstadoPago extends EstadoBase {
    public String nome() { return "Pago"; }
    @Override public void enviar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getCodigo() + " despachado.");
        pedido.definirEstado(new EstadoEnviado());
    }
    @Override public void cancelar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getCodigo() + " cancelado após pagamento (estorno iniciado).");
        pedido.definirEstado(new EstadoCancelado());
    }
}

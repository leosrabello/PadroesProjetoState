// EstadoNovo.java
public class EstadoNovo extends EstadoBase {
    public String nome() { return "Novo"; }
    @Override public void pagar(Pedido pedido) {
        System.out.println("Pagamento confirmado para " + pedido.getCodigo());
        pedido.definirEstado(new EstadoPago());
    }
    @Override public void cancelar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getCodigo() + " cancelado antes do pagamento.");
        pedido.definirEstado(new EstadoCancelado());
    }
}

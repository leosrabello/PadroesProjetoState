// EstadoEnviado.java
public class EstadoEnviado extends EstadoBase {
    public String nome() { return "Enviado"; }
    @Override public void entregar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getCodigo() + " entregue ao cliente.");
        pedido.definirEstado(new EstadoEntregue());
    }
}

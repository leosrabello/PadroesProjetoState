// EstadoBase.java — Implementação base que bloqueia transições inválidas
public abstract class EstadoBase implements EstadoPedido {
    protected void erro(String acao) {
        throw new IllegalStateException("Ação '" + acao + "' não é permitida no estado '" + nome() + "'.");
    }
    public void pagar(Pedido pedido)    { erro("pagar"); }
    public void enviar(Pedido pedido)   { erro("enviar"); }
    public void entregar(Pedido pedido) { erro("entregar"); }
    public void cancelar(Pedido pedido) { erro("cancelar"); }
}

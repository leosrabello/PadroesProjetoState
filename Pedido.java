// Pedido.java — Contexto do padrão State
public class Pedido {
    private final String codigo;
    private EstadoPedido estado;

    public Pedido(String codigo) {
        this.codigo = codigo;
        this.estado = new EstadoNovo();
    }

    void definirEstado(EstadoPedido novo) { this.estado = novo; }
    public String getCodigo() { return codigo; }
    public String getEstadoAtual() { return estado.nome(); }

    public void pagar()    { estado.pagar(this); }
    public void enviar()   { estado.enviar(this); }
    public void entregar() { estado.entregar(this); }
    public void cancelar() { estado.cancelar(this); }

    @Override
    public String toString() {
        return "Pedido{codigo='" + codigo + "', estado='" + getEstadoAtual() + "'}";
    }
}

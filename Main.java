// Main.java — Demonstração simples do padrão State para Pedido
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("PX-1001");
        System.out.println(pedido);

        pedido.pagar();
        pedido.enviar();
        pedido.entregar();
        System.out.println(pedido);

        // Exemplo de erro: tentar pagar após entregue
        try {
            pedido.pagar();
        } catch (IllegalStateException e) {
            System.out.println("[ERRO ESPERADO] " + e.getMessage());
        }

        // Novo pedido cancelado antes do pagamento
        Pedido outro = new Pedido("PX-1002");
        outro.cancelar();
        System.out.println(outro);
    }
}

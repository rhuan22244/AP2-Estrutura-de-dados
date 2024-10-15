public class SistemaPedidos {

    FilaPedidos filaPedidos = new FilaPedidos();
    PilhaPedidosCancelados pilhaCancelados = new PilhaPedidosCancelados();

    public void adicionarPedido(int id, String descricao) {
        filaPedidos.enqueue(id, descricao);
        System.out.println("Pedido adicionado: " + descricao);
    }

    public void atenderPedido() {
        Nodo atendido = filaPedidos.dequeue();
        if (atendido != null) {
            System.out.println("Pedido atendido: " + atendido.descricao);
        }
    }

    public void cancelarPedido() {
        Nodo cancelado = filaPedidos.dequeue();
        if (cancelado != null) {
            pilhaCancelados.push(cancelado.id, cancelado.descricao);
            System.out.println("Pedido cancelado: " + cancelado.descricao);
        }
    }

    public void restaurarPedido() {
        Nodo restaurado = pilhaCancelados.pop();
        if (restaurado != null) {
            filaPedidos.enqueue(restaurado.id, restaurado.descricao);
            System.out.println("Pedido restaurado: " + restaurado.descricao);
        }
    }

    public void imprimirPedidosPendentes() {
        filaPedidos.printQueue();
    }

    public void imprimirPedidosCancelados() {
        pilhaCancelados.printStack();
    }
}


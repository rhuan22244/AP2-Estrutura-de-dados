class PilhaPedidosCancelados {
    private Nodo topo;

    public PilhaPedidosCancelados() {
        this.topo = null;
    }

    public void push(int id, String descricao) {
        Nodo novoPedido = new Nodo(id, descricao);
        novoPedido.proximo = topo;
        topo = novoPedido;
    }

    public Nodo pop() {
        if (topo == null) {
            System.out.println("Pilha vazia.");
            return null;
        }
        Nodo pedidoCancelado = topo;
        topo = topo.proximo;
        return pedidoCancelado;
    }

    public void printStack() {
        Nodo atual = topo;
        while (atual != null) {
            System.out.println("Pedido Cancelado ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.proximo;
        }
    }
}

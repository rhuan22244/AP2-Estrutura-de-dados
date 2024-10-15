class FilaPedidos {
    private Nodo inicio;
    private Nodo fim;

    public FilaPedidos() {
        this.inicio = null;
        this.fim = null;
    }

    public void enqueue(int id, String descricao) {
        Nodo novoPedido = new Nodo(id, descricao);
        if (this.fim != null) {
            fim.proximo = novoPedido;
        }
        fim = novoPedido;
        if (inicio == null) {
            inicio = fim;
        }
    }

    public Nodo dequeue() {
        if (inicio == null) {
            System.out.println("Fila vazia.");
            return null;
        }
        Nodo pedidoAtendido = inicio;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return pedidoAtendido;
    }

    public void printQueue() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.println("Pedido ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.proximo;
        }
    }
}


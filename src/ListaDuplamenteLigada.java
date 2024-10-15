class ListaDuplamenteLigada {
    private NodoDuplo inicio;
    private NodoDuplo fim;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarNoInicio(int id, String titulo, String autor) {
        NodoDuplo novoLivro = new NodoDuplo(id, titulo, autor);
        if (inicio == null) {
            inicio = fim = novoLivro;
        } else {
            novoLivro.proximo = inicio;
            inicio.anterior = novoLivro;
            inicio = novoLivro;
        }
    }

    public void adicionarNoFim(int id, String titulo, String autor) {
        NodoDuplo novoLivro = new NodoDuplo(id, titulo, autor);
        if (fim == null) {
            inicio = fim = novoLivro;
        } else {
            fim.proximo = novoLivro;
            novoLivro.anterior = fim;
            fim = novoLivro;
        }
    }

    public NodoDuplo removerDoInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return null;
        }
        NodoDuplo removido = inicio;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        } else {
            inicio.anterior = null;
        }
        return removido;
    }

    public NodoDuplo removerDoFim() {
        if (fim == null) {
            System.out.println("Lista vazia.");
            return null;
        }
        NodoDuplo removido = fim;
        fim = fim.anterior;
        if (fim == null) {
            inicio = null;
        } else {
            fim.proximo = null;
        }
        return removido;
    }

    public NodoDuplo buscarPorId(int id) {
        NodoDuplo atual = inicio;
        while (atual != null) {
            if (atual.id == id) {
                return atual;
            }
            atual = atual.proximo;
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public void imprimirEmOrdem() {
        NodoDuplo atual = inicio;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Título: " + atual.titulo + ", Autor: " + atual.autor);
            atual = atual.proximo;
        }
    }

    public void imprimirEmOrdemReversa() {
        NodoDuplo atual = fim;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Título: " + atual.titulo + ", Autor: " + atual.autor);
            atual = atual.anterior;
        }
    }
}

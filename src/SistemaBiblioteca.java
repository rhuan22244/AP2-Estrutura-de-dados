public class SistemaBiblioteca {

    ListaDuplamenteLigada listaLivros = new ListaDuplamenteLigada();

    public void adicionarLivroNoInicio(int id, String titulo, String autor) {
        listaLivros.adicionarNoInicio(id, titulo, autor);
        System.out.println("Livro adicionado no início: " + titulo);
    }

    public void adicionarLivroNoFim(int id, String titulo, String autor) {
        listaLivros.adicionarNoFim(id, titulo, autor);
        System.out.println("Livro adicionado no fim: " + titulo);
    }

    public void removerPrimeiroLivro() {
        NodoDuplo removido = listaLivros.removerDoInicio();
        if (removido != null) {
            System.out.println("Livro removido: " + removido.titulo);
        }
    }

    public void removerUltimoLivro() {
        NodoDuplo removido = listaLivros.removerDoFim();
        if (removido != null) {
            System.out.println("Livro removido: " + removido.titulo);
        }
    }

    public void buscarLivroPorId(int id) {
        NodoDuplo livro = listaLivros.buscarPorId(id);
        if (livro != null) {
            System.out.println("Livro encontrado - ID: " + livro.id + ", Título: " + livro.titulo + ", Autor: " + livro.autor);
        }
    }

    public void imprimirLivrosEmOrdem() {
        listaLivros.imprimirEmOrdem();
    }

    public void imprimirLivrosEmOrdemReversa() {
        listaLivros.imprimirEmOrdemReversa();
    }
}


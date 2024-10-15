class NodoDuplo {
    int id;
    String titulo;
    String autor;
    NodoDuplo proximo;
    NodoDuplo anterior;

    public NodoDuplo(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.proximo = null;
        this.anterior = null;
    }
}

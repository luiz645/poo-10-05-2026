package pasta6;
class Livro {

    String titulo;
    String isbn;

    // Construtor
    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Livro: " + titulo + " | ISBN: " + isbn;
    }

    // Método equals()
    // Dois livros serão considerados iguais
    // se tiverem o mesmo ISBN
    @Override
    public boolean equals(Object obj) {

        // Verifica se é o mesmo objeto
        if (this == obj) return true;

        // Verifica se o objeto é da classe Livro
        if (!(obj instanceof Livro)) return false;

        // Conversão de Object para Livro
        Livro outro = (Livro) obj;

        // Compara apenas o ISBN
        return this.isbn.equals(outro.isbn);
    }
}


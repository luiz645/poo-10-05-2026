package pasta7;

import java.util.Objects;

public class Livro {
      String titulo;
    String isbn;

    // Construtor
    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    // Método equals()
    // Dois livros são iguais se tiverem o mesmo ISBN
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Livro)) return false;

        Livro outro = (Livro) obj;

        return this.isbn.equals(outro.isbn);
    }

    // Método hashCode()
    // Usa o mesmo campo do equals()
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}


package pasta5;

public class livro {
    String titulo;
    String isbn;

    public livro(String titulo, String isbn){
    this.titulo = titulo;
    this.isbn = isbn;

    }

  /* @Override
    public String toString(){
        return "  titulo  " + titulo + "  isbn  " + isbn;

    }
         */ 

                @Override
            public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof livro)) return false;
            livro outro = (livro) obj;
            return this.isbn.equals(outro.isbn);
            }
}

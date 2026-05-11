package pasta5;

public class livro {
    String titulo;
    String isbn;

    public livro(String titulo, String isbn){
    this.titulo = titulo;
    this.isbn = isbn;

    }

    @Override
    public String toString(){
        return "  titulo  " + titulo + "  isbn  " + isbn;

    }
}

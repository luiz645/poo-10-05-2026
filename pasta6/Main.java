package pasta6;

public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Código Limpo", "978-0132350884");

         Livro l3 = new Livro("Java Básico", "111-222");

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1.equals(l2)); 
        System.out.println(l1.equals(l3));

        System.out.println(l1.equals(null));
        System.out.println(l1.equals("teste"));

        /*
        Saída:
        true

        Explicação:
        - O método equals() compara apenas o ISBN.
        - Mesmo com títulos diferentes,
          os livros são considerados iguais
          porque possuem o mesmo ISBN.
        */
    }
}

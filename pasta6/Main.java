package pasta6;

import pasta5.livro;

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


         /*  Explicação:

        l1.equals(l2) -> true
        - Porque possuem o mesmo ISBN.

        l1.equals(l3) -> false
        - Porque os ISBNs são diferentes.

        l1.equals(null) -> false
        - Não lança exceção.
        - O instanceof já trata isso.

        l1.equals("Teste") -> false
        - Não lança exceção.
        - String não é um objeto Livro.

        Por que comparar pelo ISBN e não pelo título?
        - Porque o ISBN é único para cada livro.
        - Dois livros podem ter títulos iguais,
          mas ISBNs diferentes.
        - O ISBN identifica corretamente a obra.
        */
    }
}

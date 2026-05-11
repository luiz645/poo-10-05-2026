package pasta5;

public class Main {
    public static void main(String[] args) {
       /*  livro l1 = new livro("Clean Code", "978-0132350884");
livro l2 = new livro("Clean Code", "978-0132350884"); */


     livro l1 = new livro("Clean Code", "978-0132350884");
    livro l2 = new livro("titulo", "978-0132350884");


     

             System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1.equals(l2)); // true

            /*
        System.out.println(l1 == l2); // ?
        System.out.println(l1.equals(l2)); // ?
        
        */



    }


  /*   Explicação:

        l1 == l2 -> false
        - O operador == compara referências de memória.
        - l1 e l2 são objetos diferentes na memória.

        l1.equals(l2) -> false
        - Porque a classe Livro ainda não sobrescreveu
          o método equals().

        Sem override:
        - equals() da classe Object compara memória,
          exatamente como ==.

        Mesmo tendo os mesmos dados:
        - título igual
        - isbn igual

        Os objetos continuam sendo diferentes.
        */
}

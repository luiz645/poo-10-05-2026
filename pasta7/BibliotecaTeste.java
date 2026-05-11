package pasta7;

import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {
         HashSet<Livro> biblioteca = new HashSet<>();

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        biblioteca.add(l1);
        biblioteca.add(l2);

        System.out.println(biblioteca.size()); // 1

        /*
        Rodada A:
        Com equals() e hashCode() implementados,
        o tamanho do HashSet é 1.

        O HashSet entende que l1 e l2 são iguais,
        porque:
        - equals() retorna true
        - hashCode() retorna o mesmo valor

        O HashSet usa internamente:
        - hashCode() para localizar objetos
        - equals() para confirmar igualdade

        ------------------------------------------------
        Rodada B:
        Se comentar o hashCode(),
        o tamanho pode virar 2.

        Isso acontece porque:
        - Cada objeto recebe um hashCode diferente
          herdado da classe Object.
        - O HashSet coloca os objetos em posições diferentes.
        - Assim ele não reconhece corretamente a duplicata.

        Regra importante:
        Se sobrescrever equals(),
        sobrescreva hashCode() também.
        Sempre os dois juntos.
        */
    }
}

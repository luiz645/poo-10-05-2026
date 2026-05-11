package pasta4;

public class validadorSenha {
    public static void main(String[] args) {
                String senhaCorreta = new String("1234");
        String tentativa = "1234";

       /* if (tentativa == senhaCorreta) {
        System.out.println("Acesso liberado");
        } else {
        System.out.println("Acesso negado"); // este roda!
        }
         */


         if (tentativa.equals(senhaCorreta)) {
        System.out.println("Acesso liberado");
        } else {
        System.out.println("Acesso negado"); // este roda!
        }

        /*
        Saída:
        Acesso negado

        Por que isso acontece?
        O operador == compara referências de memória.
        senhaCorreta foi criada com new String(),
          então virou um novo objeto na memória.
        tentativa aponta para o String Pool.
        Mesmo com o mesmo conteúdo ("1234"),
          os objetos são diferentes.
        */
    }
}

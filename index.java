public class index {
    public static void main(String[] args) {
        produto P  = new produto("shampoo", 12);
          produto P1  = new produto("escova", 14);

          System.out.println(P);
          System.out.println(P1);

           /*
        Saída esperada:

        Produto@5acf9800
        Produto@4617c264

        O que aparece?
        - O nome da classe + um código hexadecimal.

        É legível?
        - Não muito. Porque o método toString() não foi sobrescrito.
        - O Java usa a implementação padrão da classe Object.
        */

    }
}

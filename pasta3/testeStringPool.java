package pasta3;

public class testeStringPool {
    public static void main(String[] args) {
        String a = "Java";
String b = "Java";
String d = "Java";
String c = new String("Java");
System.out.println(a == b); 
System.out.println(a == c);
System.out.println(a == d); 
System.out.println(a.equals(c)); 


 /*
        Explicação:

        a == b retorna true
        - Porque as duas variáveis apontam para o mesmo objeto
          dentro do String Pool.

        a == c retorna false
        - Porque o operador == compara referências de memória.
        - "new String("Java")" cria um novo objeto na memória,
          diferente do objeto do String Pool.

        a.equals(c) retorna true
        - Porque equals() compara o conteúdo das Strings,
          e ambas possuem o texto "Java".

        O que é o String Pool?
        - O String Pool é uma área especial da memória onde o Java
          armazena Strings literais para reutilização.
        - Isso evita criar vários objetos iguais e economiza memória.

        Exemplo:
        String x = "Java";
        String y = "Java";

        x e y apontam para o mesmo objeto no Pool.
        */
    }
}

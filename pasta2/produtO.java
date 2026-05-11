package pasta2;

public class produtO {
    // variaveis
    String nome;
    double proco;
    // metodo construtor
    public produtO(String nome , double preco){
        this.nome = nome;
        this.proco = preco;
    }
        //metodo toString
    @Override
    public String toString() {
        return  "nome :  " + nome + "  preco  " + proco;
    }
}

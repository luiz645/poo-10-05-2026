package pasta2;

public class produtO {
    String nome;
    double proco;
    public produtO(String nome , double preco){
        this.nome = nome;
        this.proco = preco;
    }

    @Override
    public String toString() {
        return  "nome :  " + nome + "  preco  " + proco;
    }
}

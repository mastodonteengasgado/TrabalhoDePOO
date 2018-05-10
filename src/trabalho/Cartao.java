package trabalho;


public class Cartao extends TipoPagamento {
    String nome;
    String numero;
    
    Cartao(){
    }
    
    Cartao(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    String GetNome(){
        return nome;
    }
    
    void SetNome(String nome){
        this.nome = nome;
    }
    
    String GetNumero(){
        return numero;
    }
    
    void SetNumero(String numero){
        this.numero = numero;
    }
    
    void ExibirDados(){
        System.out.println("Pagamento Com Cartão!!");
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
    }
}

package trabalho;


public class Cheque extends TipoPagamento{
    String nomeEmissor;
    String numeroCheque;
    
    Cheque(){
    }
    
    Cheque(String nomeEmissor, String numeroCheque){
        this.nomeEmissor = nomeEmissor;
        this.numeroCheque = numeroCheque;
    }
    
    String GetNomeEmissor(){
        return nomeEmissor;
    }
    
    void SetNomeEmissor(String nomeEmissor){
        this.nomeEmissor = nomeEmissor;
    }
    
    String GetNumeroCheque(){
        return numeroCheque;
    }
    
    void SetNumeroCheque(String numeroCheque){
        this.numeroCheque = numeroCheque;
    }
    
    void ExibirDados(){
        System.out.println("Pagamento Com Cheque!!");
        System.out.println("Nome do Emissor: " + nomeEmissor);
        System.out.println("Numero do Cheque: " + numeroCheque);
    }
}

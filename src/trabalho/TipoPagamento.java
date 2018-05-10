package trabalho;


public abstract class TipoPagamento {
    String tipoPagamento;
    
    TipoPagamento(){
    }
    
    TipoPagamento(String tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }
    
    String GetTipoPagamento(){
        return tipoPagamento;
    }
    
    void SetTipoPagamento(String tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }
    
    abstract void ExibirDados();
}

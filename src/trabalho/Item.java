package trabalho;


public class Item {
    int num;
    String codigoProduto;
    String descricao;
    float valor;
    float quantidade;
    
    Item(){
    }
    
    Item(int num, String codigoProduto, String descricao, float valor, float quantidade){
        this.num = num;
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    int GetNum(){
        return num;
    }
    
    void SetNum(int num){
        this.num = num;
    }
    
    String GetCodigoProduto(){
        return codigoProduto;
    }
    
    void SetCodigoProduto(String codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    
    String GetDescricao(){
        return descricao;
    }
    
    void SetDescricao(String descricao){
        this.descricao = descricao;
    }
    
    float GetValor(){
        return valor;
    }
    
    void SetValor(float valor){
        this.valor = valor;
    }
    
    float GetQuantidade(){
        return quantidade;
    }
    
    void SetQuantidade(float quantiade){
        this.quantidade = quantidade;
    }
    
    float CalcularTotal(){
        return (quantidade * valor);
    }
    
}

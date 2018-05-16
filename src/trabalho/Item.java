package trabalho;


public class Item {
    private int num;
    private String codigoProduto;
    private String descricao;
    private float valor;
    private int quantidade;
    
    Item(){
    }
    
    Item(int num, String codigoProduto, String descricao, float valor, int quantidade){
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
    
    void SetQuantidade(int quantiade){
        this.quantidade = quantidade;
    }
    
    float CalcularTotal(){
        return (quantidade * valor);
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}

package trabalho;


public abstract class Produto {
    String codigo;
    String descricao;
    float valor;
    
    Produto(String codigo, String descricao, float valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    String GetCodigo(){
        return codigo;
    }
    
    void SetCodigo(String codigo){
        this.codigo = codigo;
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
    
    abstract float CalcularPreco();
}

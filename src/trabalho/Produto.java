package trabalho;

import javax.swing.JOptionPane;


public abstract class Produto {
    protected String codigo;
    protected String descricao;
    protected float valor;
    protected static int cont;
    
    Produto(){
    }
    
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

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    abstract float CalcularPreco();
    
    public static int BuscaProduto(Produto produtos[], String codigo){
        for(int i = 0; i < cont; i++){
            if((produtos[i].GetCodigo()).equals(codigo)) return i;
        }
        JOptionPane.showMessageDialog(null, "Item inválido!");
        return -1;
    }
}

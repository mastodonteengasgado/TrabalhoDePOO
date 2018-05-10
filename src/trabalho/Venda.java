package trabalho;

import java.util.Calendar;


public class Venda {
    private String numero;
    private Item itens[];
    private TipoPagamento tipoPgto;
    private Cliente cliente;
    private Calendar data;
    private int cont;
    
    Venda(){
    }
    
    Venda(String numero, Item itens[], TipoPagamento tipoPgto, Cliente cliente, Calendar data){
        this.numero = numero;
        this.itens = itens;
        this.tipoPgto = tipoPgto;
        this.cliente = cliente;
        this.data = data;
        cont = 0;
    }
    
    String GetNumero(){
        return numero;
    }
    
    void SetNumero(String numero){
        this.numero = numero;
    }
    
    Item[] GetItens(){
        return itens;
    }
    
    TipoPagamento GetTipoPgto(){
        return tipoPgto;
    }
    
    void SetTipoPgto(TipoPagamento tipoPgto){
        this.tipoPgto = tipoPgto;
    }
    
    Cliente GetCliente(){
        return cliente;
    }
    
    Calendar GetData(){
        return data;
    }
    
    int GetCont(){
        return cont;
    }
    
    void AddItem(Item item){
        itens[cont] = item; 
    }
    
    float CalculaTotal(){
        int i = 0;
        float soma = 0f;
        for(; i < cont; i ++){
            soma += itens[i].CalcularTotal();
        }
        return soma;
    }
}

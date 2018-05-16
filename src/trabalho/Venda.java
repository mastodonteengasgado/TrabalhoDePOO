package trabalho;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Venda {
    private String numero;
    private Item itens[];
    private TipoPagamento tipoPgto;
    private Cliente cliente;
    private Calendar data;
    private int cont;
    private static int cont2;
    
    Venda(){
        cont = 0;
        cont2 = 0;
    }
    
    Venda(String numero, Item itens[], TipoPagamento tipoPgto, Cliente cliente, Calendar data){
        this.numero = numero;
        this.itens = itens;
        this.tipoPgto = tipoPgto;
        this.cliente = cliente;
        this.data = data;
        cont = 0;
        cont2 = 0;
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
        cont++;
    }
    
    float CalculaTotal(){
        int i = 0;
        float soma = 0f;
        for(; i < cont; i ++){
            soma += itens[i].CalcularTotal();
        }
        return soma;
    }
    
    int BuscarItem(String codigo){
        //Item[] intensSalvos = getItensSalvos();
       // for(int i = 0; i < 25; i++){
            
          //  if((itensSalvos[i].GetCodigoProduto()).equals(codigo)){
           //    AddItem(itensSalvos[i]); 
           //    return 1;
           // }   
       // }
       // JOptionPane.showMessageDialog(null, "Item inválido!");
        return 0;
    }
    
    void RegistrarCompra(){
        int max = 25, cont = 1, resp, add;
        String aux;
        Item intens[] = new Item[max];
        //System.out.println("Informações da compra:");
       /*Scanner entrada = new Scanner(System.in);
        String continua = "S";
        while(continua.equals("S") || continua.equals("s") || cont < max){
            
            //Digita o codigo do item
            System.out.println("Digite o código do produto:");
            int codProduto = entrada.nextInt();
            
           System.out.println(String.format("%05d", 1234567));
            
            
            //AddItem();
            continua = entrada.nextLine();
        }    
        */
        do{
            aux = JOptionPane.showInputDialog("Digite o código do produto:");
            add = BuscarItem(aux);
            if(add == 1) cont++;
            resp = JOptionPane.showConfirmDialog(null, "Cadastrar outro produto?");
        } while(resp == JOptionPane.OK_OPTION && cont <= max);
        if(cont > max) System.out.println("Limite máximos de produtos atingido.");
    }
}

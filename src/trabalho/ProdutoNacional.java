package trabalho;

import java.util.Scanner;


public class ProdutoNacional extends Produto {
    private float taxaImposto;
    static private int cont;
    
    ProdutoNacional(){
        this.cont = 0;
    }
    
    ProdutoNacional(String codigo, String descricao, float valor, float taxaImposto){
        super(codigo,descricao,valor);
        this.taxaImposto = taxaImposto;
        cont = 0;
    }
   
    float GetTaxaImposto(){
        return taxaImposto;
    }
    
    void SetTaxaImposto(float taxaImposto){
        this.taxaImposto = taxaImposto;
    }
    
    static int GetCont(){
        return cont;
    }
    
    @Override
    float CalcularPreco(){
      return (valor + taxaImposto);  
    }
    
    static void CadastrarProduto(ProdutoNacional produtos[]){
        String aux;
        float aux2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o codigo do produto:");
        aux = scan.nextLine();
        produtos[cont].SetCodigo(aux);
        System.out.println("Insira a descrição do produto:");
        aux = scan.nextLine();
        produtos[cont].SetDescricao(aux);
        System.out.println("Insira o valor do produto:");
        aux2 = scan.nextFloat();
        produtos[cont].SetValor(aux2);
        System.out.println("Insira a taxa de imposto:");
        aux2 = scan.nextFloat();
        produtos[cont].SetTaxaImposto(aux2);
        cont ++;
    }
    
    void Relatorio(){
        System.out.println("Codigo do produto: " + codigo);
        System.out.println("Descrição do produto: " + descricao);
        System.out.println("Valor do produto: " + valor);
        System.out.println("Taxa de imposto: " + taxaImposto);
    } 
}

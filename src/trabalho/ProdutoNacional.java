package trabalho;

import java.util.Scanner;


public class ProdutoNacional extends Produto {
    private float taxaImposto;
    static private int cont;
    
    ProdutoNacional(String codigo, String descricao, float valor, float taxaImposto){
        super(codigo,descricao,valor);
        this.taxaImposto = taxaImposto;
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
    
    void CadastrarProduto(ProdutoNacional produtos[]){
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
}

package trabalho;

import java.util.Scanner;


public class ProdutoImportado extends Produto {
    private float taxaImposto;
    private float taxaImportacao;
    static private int cont;
    
    ProdutoImportado(){
        this.cont = 0;
    }
    
    ProdutoImportado(String codigo, String descricao, float valor, float taxaImposto, float taxaImportacao){
        super(codigo,descricao,valor);
        this.taxaImposto = taxaImposto;
        this.taxaImportacao = taxaImportacao;
        cont = 0;
    }
    
    float GetTaxaImposto(){
        return taxaImposto;
    }
    
    void SetTaxaImposto(float taxaImposto){
        this.taxaImposto = taxaImposto;
    }
    
    float GetTaxaImportacao(){
        return taxaImportacao;
    }
    
    void SetTaxaImportacao(float taxaImportacao){
        this.taxaImportacao = taxaImportacao;
    }
    
    static int GetCont(){
        return cont;
    }
    
    @Override
    float CalcularPreco(){
        return (valor + taxaImposto + taxaImportacao);
    }
    
    static void CadastrarProduto(ProdutoImportado produtos[]){
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
        System.out.println("Insira a taxa de importação:");
        aux2 = scan.nextFloat();
        produtos[cont].SetTaxaImportacao(aux2);
        cont ++;
    }
    
}

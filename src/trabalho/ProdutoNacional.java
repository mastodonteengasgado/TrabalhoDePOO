package trabalho;


public class ProdutoNacional extends Produto {
    float taxaImposto;
    
    ProdutoNacional(float taxaImposto){
        this.taxaImposto = taxaImposto;
    }
   
    float GetTaxaImposto(){
        return taxaImposto;
    }
    
    void SetTaxaImposto(float taxaImposto){
        this.taxaImposto = taxaImposto;
    }
    
    @Override
    float CalcularPreco(){
      return (valor + taxaImposto);  
    }
}

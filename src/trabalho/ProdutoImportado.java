package trabalho;


public class ProdutoImportado extends Produto {
    float taxaImposto;
    float taxaImportacao;
    
    ProdutoImportado(float taxaImposto, float taxaImportacao){
        this.taxaImposto = taxaImposto;
        this.taxaImportacao = taxaImportacao;
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
    
    float CalcularPreco(){
        return (valor + taxaImposto + taxaImportacao);
    }
    
}

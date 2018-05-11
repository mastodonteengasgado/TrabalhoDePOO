package trabalho;


public class Relatorio {
    
    static void ClientesGeral(Cliente clientes[]){
        int i;
        int cli = Cliente.GetCont();
        for(i = 0; i < cli; i ++){
            clientes[i].Relatorio();
            System.out.println(" \n ");
        }
    }
    
    static int ClienteEspecifico(Cliente clientes[], String cpf){
        int i;
        int cli = Cliente.GetCont();
        for(i = 0; i < cli; i ++){
            if(clientes[i].GetCPF() == cpf){
                clientes[i].Relatorio();
                return 1;
            }
        }
        return 0;
    }
    
    static void ProdutosNacionaisGeral(ProdutoNacional produtos[]){
        int i;
        int pro = ProdutoNacional.GetCont();
        for(i = 0; i < pro; i ++){
            produtos[i].Relatorio();
            System.out.println(" \n ");
        }
    }
    
    static int ProdutoNacionalEspecifico(ProdutoNacional produtos[], String codigo){
        int i;
        int pro = ProdutoNacional.GetCont();
        for(i = 0; i < pro; i ++){
            if(produtos[i].GetCodigo() == codigo){
                produtos[i].Relatorio();
                return 1;
            }
        }
        return 0;
    }
    
    static void ProdutosImportadosGeral(ProdutoImportado produtos[]){
        int i;
        int pro = ProdutoImportado.GetCont();
        for(i = 0; i < pro; i ++){
            produtos[i].Relatorio();
            System.out.println(" \n ");
        }
    }
    
    static int ProdutoImportadoEspecifico(ProdutoImportado produtos[], String codigo){
        int i;
        int pro = ProdutoImportado.GetCont();
        for(i = 0; i < pro; i ++){
            if(produtos[i].GetCodigo() == codigo){
                
            }
        }
    }
}

package trabalho;

import java.util.Scanner;


public class Trabalho {

    static int PrimeiroMenu(){
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Registrar Compra");
        System.out.println("3 - Relatórios");
        System.out.println("4 - Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        return opcao;
    }
   
    static int SegundoMenu(){
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Produto");
        System.out.println("3 - Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        return opcao;
    }
        
    public static void main(String[] args) {
        int op = 0, op2 = 0, op3 = 0, sair = 0, cli, pro,pro2;
        String continua = "S";
        Scanner scan = new Scanner(System.in);
        Cliente clientes[] = new Cliente[15];
        ProdutoNacional produtosnacionais[] = new ProdutoNacional[25];
        ProdutoImportado produtosimportados[] = new ProdutoImportado[25];
        while(continua.equals("S") || continua.equals("s")){
            op = PrimeiroMenu();
            System.out.println("Teste: " + op);
            switch(op){
                case 1:
                    op2 = SegundoMenu();
                    switch(op2){
                        case 1:
                            cli = Cliente.GetCont();
                            clientes[cli] = new Cliente();
                            Cliente.CadastrarCliente(clientes);
                            break;
                        case 2:
                            System.out.println("1 - Cadastrar Produto Nacional");
                            System.out.println("2 - Cadastrar Produto Importado");
                            op3 = scan.nextInt();
                            switch(op3){
                                case 1:
                                    pro = ProdutoNacional.GetCont();
                                    produtosnacionais[pro] = new ProdutoNacional();
                                    ProdutoNacional.CadastrarProduto(produtosnacionais);
                                    break;
                                case 2:
                                    pro2 = ProdutoImportado.GetCont();
                                    produtosimportados[pro2] = new ProdutoImportado();
                                    ProdutoImportado.CadastrarProduto(produtosimportados);
                                    break;
                                default:
                                    System.out.println("Erro na seleção de opção!!");
                                    break;
                            }
                            break;
                        case 3:
                            sair = 1;
                            break;
                        default:
                            System.out.println("Erro na seleção da opção!!");
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    sair = 1;
                    break;
                default:
                    System.out.println("Erro na seleção da opção!!");
                    break;
             }
            if(sair == 0){
                System.out.println("Deseja continuar no programa?");
                continua = scan.nextLine();
            }
            else continua = "N";
        }
    }  
}

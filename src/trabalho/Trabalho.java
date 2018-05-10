package trabalho;

import java.util.Scanner;


public class Trabalho {

    static void PrimeiroMenu(int opcao){
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Registrar Compra");
        System.out.println("3 - Relatórios");
        System.out.println("4 - Salvar Dados");
        System.out.println("5 - Carregar Dados");
        System.out.println("6 - Sair");
        Scanner scan = new Scanner(System.in);
        opcao = scan.nextInt();
    }
   
    static void SegundoMenu(int opcao){
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Produto");
        System.out.println("3 - Sair");
        Scanner scan = new Scanner(System.in);
        opcao = scan.nextInt();
    }
        
    public static void main(String[] args) {
        int op = 0, op2 = 0, op3 = 0, sair = 0, cli;
        String continua = "S";
        Scanner scan = new Scanner(System.in);
        Cliente clientes[] = new Cliente[15];
        ProdutoNacional produtosnacionais[] = new ProdutoNacional[25];
        ProdutoImportado produtosimportados[] = new ProdutoImportado[25];
        while(continua == "S" || continua == "s"){
            PrimeiroMenu(op);
            switch(op){
                case 1:
                    SegundoMenu(op2);
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
                                    break;
                                case 2:
                                    break;
                                default:
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
                    break;
                case 5:
                    break;
                case 6:
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

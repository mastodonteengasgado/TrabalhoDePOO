package trabalho;

import java.util.Scanner;
import javax.swing.JOptionPane;


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
        int op = 0, op2 = 0, op3 = 0, sair = 0, cli, pro,pro2, nro_item, cont, qtd, resp;
        String continua = "S", aux;
        Scanner scan = new Scanner(System.in);
        Cliente clientes[] = new Cliente[15];
        Venda venda = new Venda();
        Produto produtos[] = new Produto[25];
        ProdutoNacional produtosnacionais[] = new ProdutoNacional[25];
        ProdutoImportado produtosimportados[] = new ProdutoImportado[25];
        while(continua.equals("S") || continua.equals("s")){
            op = PrimeiroMenu();
            //System.out.println("Teste: " + op);
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
                    System.out.println("klfdsajkl");
                    Item itens[] = new Item[25];
                    System.out.println("fdas");
                    do{
                        System.out.println("Entrou no 'do'");
                        aux = JOptionPane.showInputDialog("Digite o código do produto:");
                        nro_item = Produto.BuscaProduto(produtos, aux);
                        cont = venda.GetCont();
                        
                        if(nro_item != -1){
                            itens[cont].SetNum(cont);
                            itens[cont].SetCodigoProduto(produtos[nro_item].GetCodigo());
                            itens[cont].SetDescricao(produtos[nro_item].GetDescricao());
                            itens[cont].SetValor(produtos[nro_item].GetValor());
                            qtd = Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade:"));
                            itens[cont].SetQuantidade(qtd);
                            itens[cont].setValorTotal(produtos[nro_item].GetValor() * qtd);
                            venda.AddItem(itens[cont]);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Item inválido!");
                        }
                        
                        resp = JOptionPane.showConfirmDialog(null, "Cadastrar outro produto?");
                    } while(resp == JOptionPane.OK_OPTION && cont <= 25);
                    if(cont > 25) System.out.println("Limite máximos de produtos atingido.");
 
                    //venda.RegistrarCompra();
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

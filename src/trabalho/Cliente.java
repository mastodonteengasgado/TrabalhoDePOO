package trabalho;

import java.util.Scanner;


public class Cliente {
    private String cpf;
    private String nome;
    static private int cont;
    
    Cliente(){
    }
    
    Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
        cont = 0;
    }
    
    String GetCPF(){
        return cpf;
    }
    
    void SetCPF(String cpf){
        this.cpf = cpf;
    }
    
    String GetNome(){
        return nome;
    }
    
    void SetNome(String nome){
        this.nome = nome;
    }
    
    static int GetCont(){
        return cont;
    }
    
    static void CadastrarCliente(Cliente clientes[]){
        String aux;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o CPF do cliente:");
        aux = scan.nextLine();
        clientes[cont].SetCPF(aux);
        System.out.println("Insira o nome do cliente:");
        aux = scan.nextLine();
        clientes[cont].SetNome(aux);
        cont ++;
    }
   
}

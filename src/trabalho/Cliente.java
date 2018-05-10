package trabalho;


public class Cliente {
    String cpf;
    String nome;
    
    Cliente(){
    }
    
    Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
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
}

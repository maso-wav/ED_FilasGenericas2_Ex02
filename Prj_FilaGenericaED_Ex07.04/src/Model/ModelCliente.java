package Model;

public class ModelCliente {
    
    String nome; 
    int qtdPecas;
    float valorPecas;
    
    public ModelCliente(){
        
        this("",0,0);
    }
    
    public ModelCliente(String nome, int pecas, float valorPc){
        
        this.nome = nome;
        this.qtdPecas = pecas;
        this.valorPecas = valorPc;
    }
    
    public String getNome(){
        
        return nome;
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
    }
    
    public int getQuantidade(){
        
        return qtdPecas;
    }
    
    public void setQuantidade(int qtdPecas){
        
        this.qtdPecas = qtdPecas;
    }
    
    public float getValor(){
        
        return valorPecas;
    }
    
    public void setValor(float valorPecas){
        
        this.valorPecas = valorPecas;
    }
}

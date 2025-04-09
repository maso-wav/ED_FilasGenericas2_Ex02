package Controller;

import br.fateczl.edu.FilaGenerica.*;
import Model.ModelCliente;

public class OperacaoController {
    
    public OperacaoController(){
        
        super();
    }
    
    public void caixa (fila<ModelCliente> fila){
        
        ModelCliente cliente = new ModelCliente();
        
        while(!fila.isEmpty()){
        
            try {
                
                cliente = fila.remove();
                float valorTotal = cliente.getQuantidade() * cliente.getValor();
                System.out.println("O " + cliente.getNome() + " gastou um total de R$ " + String.format("%.2f", valorTotal) + " em mercadorias.");
                
                
            } catch (Exception e) {
                
                System.err.println(e.getMessage());
            }                    
        }
    }
    
}

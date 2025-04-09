package View;

import br.fateczl.edu.FilaGenerica.fila;
import Controller.OperacaoController;
import Model.ModelCliente;

public class Principal {
    
    public static void main (String args[]){
        
        fila<ModelCliente> fila = new fila<>();
        OperacaoController n = new OperacaoController();
        
        for(int i = 0; i < 20; i++){
            
            ModelCliente cliente = new ModelCliente("Cliente " + (i + 1), (int)((Math.random() * 31) + 20), (float)((Math.random() * 96) + 5));
            fila.insert(cliente);
        }
        
        n.caixa(fila);
               
    }              
}

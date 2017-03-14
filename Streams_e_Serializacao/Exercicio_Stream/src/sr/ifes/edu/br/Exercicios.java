/*
Exercicios de programacao em java
 */
package sr.ifes.edu.br;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList listaClientes = new ArrayList();
        String numeroClientes = JOptionPane.showInputDialog(null, "Informe o número de clientes?");
        int numClientes = Integer.parseInt(numeroClientes);
        for (int indiceCliente = 0; indiceCliente < numClientes; indiceCliente++) {         
            String nomeCliente = JOptionPane.showInputDialog(null, "Informe o nome do cliente");            
            listaClientes.add(nomeCliente);            
        }        
        for(int indiceCliente = 0; indiceCliente < listaClientes.size() ; indiceCliente++){
            JOptionPane.showMessageDialog(null, "Cliente:" + listaClientes.get(indiceCliente));            
        }            
    }
    
}

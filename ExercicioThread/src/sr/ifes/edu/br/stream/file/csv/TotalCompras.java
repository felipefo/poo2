/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.file.csv;

import sr.ifes.edu.br.stream.file.csv.Cliente;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author felipe
 */
public class TotalCompras {
    
     public double calculaSomaTotal(LinkedList<Cliente> clientes){        
        Iterator listaClientes = clientes.iterator();
        double somaTotal=0;
        while(listaClientes.hasNext()){
            Cliente cliente = (Cliente) listaClientes.next();
            somaTotal += cliente.getTotalCompras();            
        }
        return somaTotal;        
    }
}

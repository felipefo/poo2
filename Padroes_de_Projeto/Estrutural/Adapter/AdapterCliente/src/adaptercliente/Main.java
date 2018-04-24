
package adaptercliente;

import adaptercliente.model.Cliente;
import adaptercliente.visao.VisaoCliente;

public class Main {    
    public static void main(String[] args) {
        // TODO code application logic here        
        Cliente cliente = new Cliente();
        cliente.setNomeCompleto("João da Silva");
        cliente.setEmail("jao.silva@email.com");
        cliente.setTelefone("27 33233444");
        cliente.setCelular("27 828203837");                       
        VisaoCliente visao = new VisaoCliente();
        visao.setInformacoesCliente(cliente);
        visao.setVisible(true);
    }
    
}

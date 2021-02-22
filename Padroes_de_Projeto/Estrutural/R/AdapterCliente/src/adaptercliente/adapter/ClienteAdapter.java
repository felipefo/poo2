
package adaptercliente.adapter;

import adaptercliente.model.ICliente;
import lib.ClienteExterno;


public class ClienteAdapter implements ICliente{

    private ClienteExterno clienteExterno;
    
    public ClienteAdapter(ClienteExterno clienteExterno) {
        this.clienteExterno   = clienteExterno;        
    }
            
    @Override
    public String getNomeCompleto() {
        return this.clienteExterno.getNome()  + " "  +  this.clienteExterno.getSobreNome();
    }

    @Override
    public String getTelefone() {
        return this.clienteExterno.getDddTelefone()  + "-"  + this.clienteExterno.getTelefone();                
    }

    @Override
    public String getEmail() {
        return this.clienteExterno.getEmail();
    }
  
    @Override
    public String getCelular() {
        return this.clienteExterno.getDddCelular()+ "-"  + this.clienteExterno.getCelular();
    }

    @Override
    public void setTelefone(String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCelular(String celular) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

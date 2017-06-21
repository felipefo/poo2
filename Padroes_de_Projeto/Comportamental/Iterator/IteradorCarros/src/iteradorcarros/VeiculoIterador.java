
package iteradorcarros;

import iteradorcarros.modelo.Veiculo;

public class VeiculoIterador implements Iterador {
    Object[] veiculos = null;
    int position =0;    
    VeiculoIterador(Object[] veiculos){
        this.veiculos =  veiculos;
    }    
    @Override
    public boolean hasNext() {
        if(position >= veiculos.length || veiculos[position] == null ){
            return false;}            
        else return true;
    }
    @Override
    public Object next() {
        Veiculo veiculo = (Veiculo)veiculos[position];
        position++;
        return veiculo;        
    }       
}


package teletaxi;

import java.util.ArrayList;


public class MotoristaAutonomo implements TaxiVisitor {

    ArrayList<String> comandosDestino = new ArrayList();
    public MotoristaAutonomo(ArrayList comandos){
        this.comandosDestino = comandos;
    }
    @Override
    public void visit(Taxi taxi) {  
                
        for(String comando: comandosDestino){
            if(comando.equalsIgnoreCase("Frente")){
                taxi.andarParaFrente();                        
            }else if(comando.equalsIgnoreCase("Direita")){
                taxi.virarDireita();        
            }else if(comando.equalsIgnoreCase("Esquerda")){
                taxi.virarEsquerda();        
            }else if(comando.equalsIgnoreCase("Parar")){
                taxi.parar();
            }
        }
    }
}

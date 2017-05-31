
package mementoexamplo;


public class ConfigSOMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
  public static void main(String[] args) throws CloneNotSupportedException {

       
       ConfiguracaoSO configuracao = new ConfiguracaoSO();
       configuracao.setUsb(false);
       configuracao.setVersaoSO(1.0);
       configuracao.setWifi(false);
       
       MementoArmazenaConfiguracao lembranca = new MementoArmazenaConfiguracao();
       
       //utilize o padrão memento para restaurar as configurações do sistema
       //após realizada uma modificação

       configuracao.setVersaoSO(2.0);
       configuracao.setUsb(true);
       
       //lembranca.restoreState();       
       
     
   }
    
}

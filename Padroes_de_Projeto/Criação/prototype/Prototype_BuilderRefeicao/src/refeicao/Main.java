
package refeicao;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;


public class Main {
    
    static HashMap<String, Refeicao>  refeicoes = new HashMap<>();
    
    public static void main(String[] args) {        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //controi uma refeicao.                
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco");                
        refeicoes.put("laranja/suco" , refeicao1 );        
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante");       
        refeicoes.put("guarana/refrigerante" , refeicao2 );           
        Refeicao  refeicaoClone1 = (Refeicao) refeicoes.get("laranja/suco").clone();                
        Refeicao  refeicaoClone2 = (Refeicao) refeicoes.get("guarana/refrigerante").clone();          
        refeicao1.getBebida().setSabor("morango");
        System.out.println("clone refeicao 1 " + refeicaoClone1.getBebida().getSabor());
        System.out.println("refeicao1 " + refeicao1.getBebida().getSabor());                
        
        Refeicao novaRefeicao = (Refeicao) deepClone(refeicao1);        
        novaRefeicao.getBebida().setSabor("abacaxi");
        System.out.println("nova Refeicao1: " + novaRefeicao.getBebida().getSabor());                
        System.out.println("refeicao1 " + refeicao1.getBebida().getSabor());                
        
    }    
    
 /*
 * This method makes a "deep clone" of any Java object it is given.
 */
 public static Object deepClone(Object object) {
   try {
     ByteArrayOutputStream baos = new ByteArrayOutputStream();
     ObjectOutputStream oos = new ObjectOutputStream(baos);
     oos.writeObject(object);
     ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
     ObjectInputStream ois = new ObjectInputStream(bais);
     return ois.readObject();
   }
   catch (Exception e) {
     e.printStackTrace();
     return null;
   }
 }
}

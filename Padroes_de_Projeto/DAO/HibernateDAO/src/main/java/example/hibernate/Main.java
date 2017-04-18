package example.hibernate;

import example.hibernate.model.Veiculo;
import example.hibernate.persistencia.VeiculoDAO;
import example.hibernate.persistencia.VeiculoDAOImpl;
import java.util.List;


public class Main {    		
	public static void main(String[] args) throws Exception {                                    
                        
            
           VeiculoDAO veiculoDAO = new VeiculoDAOImpl();            
           Veiculo veiculo = new Veiculo();
           veiculo.setAno("2010");
           veiculo.setMarca("Fiat");
           veiculo.setModelo("Uno");
           veiculo.setQuilometragem("1000");
           veiculo.setTipo("carro");              
           veiculoDAO.inserir(veiculo);           
           List<Veiculo> listar = veiculoDAO.listar(Veiculo.class);
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
           veiculoDAO.deletar(veiculo);           
           listar = veiculoDAO.listar(Veiculo.class);
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
            
	}                
}

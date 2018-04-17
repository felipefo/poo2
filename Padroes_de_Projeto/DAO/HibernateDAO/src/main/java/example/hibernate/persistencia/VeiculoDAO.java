

package example.hibernate.persistencia;

import example.hibernate.model.Veiculo;
import java.util.List;

/**
 *
 * @author felipe
 */
public interface VeiculoDAO extends GenericDAO<Veiculo> {
    
       public List<Veiculo> buscaVeiculosApartirDoAno(int ano);
       
    
}

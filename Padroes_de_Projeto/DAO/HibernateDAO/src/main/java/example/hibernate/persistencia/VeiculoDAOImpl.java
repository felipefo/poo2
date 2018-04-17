

package example.hibernate.persistencia;

import example.hibernate.model.Veiculo;
import java.util.List;



/**
 *
 * @author felipe
 */
public class VeiculoDAOImpl  extends GenericDAOImpl<Veiculo> implements VeiculoDAO {

        public List<Veiculo> buscaVeiculosApartirDoAno(int ano){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Veiculo> lista = sessao.createQuery("from Veiculo where ano >= " + ano).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}

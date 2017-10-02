

package example.hibernate.persistencia;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;


public abstract class GenericDAOImpl<T> implements GenericDAO<T>
{
    protected Session sessao;
    protected Transaction transacao;
    /** Creates a new instance of GenericDAO */
   
    public void inserir( T obj ) throws Exception
    {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    
    public void alterar( T obj ) throws Exception
    {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.update(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public void deletar( T obj ) throws Exception
    {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.delete(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public List<T> listar(Class clazz) throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(clazz);
        transacao.commit();
        objts = selectAll.list();
        sessao.close();
        return objts;
    }
     public T listar(Class clazz, String pk) throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        //Object objt = sessao.load(clazz, new Integer(Integer.parseInt(pk)) );
        Object ob =  sessao.load(clazz, new Integer(Integer.parseInt(pk)));
        transacao.commit();
        sessao.flush();
        sessao.close();
        return (T)ob;
    }
    public void rollBack()
    {
        transacao.rollback();
        sessao.close();
    }

   
}

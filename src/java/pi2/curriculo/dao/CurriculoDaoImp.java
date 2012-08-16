/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2.curriculo.dao;

import pi2.curriculo.models.Curriculo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alezonez
 */
public class CurriculoDaoImp implements CurriculoDao{

    @Override
    public Curriculo getCurriculo(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Curriculo) session.load(Curriculo.class, id);
    }

    @Override
    public List<Curriculo> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Curriculo").list();
        t.commit();
        return lista;        
    }

    @Override
    public void remove(Curriculo curriculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Curriculo curriculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(curriculo);
        t.commit();
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Curriculo curriculo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

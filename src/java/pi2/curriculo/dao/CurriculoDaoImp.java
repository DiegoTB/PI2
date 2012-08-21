/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2.curriculo.dao;

import pi2.curriculo.models.Curriculo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 *
 * @author alezonez
 */
public class CurriculoDaoImp implements CurriculoDao{

    @Override
    public Curriculo getCurriculo(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session =sessionFactory.openSession();        
        return (Curriculo) session.load(Curriculo.class, id);
    }

    @Override
    public List<Curriculo> list() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Curriculo").list();
        t.commit();
        return lista;        
    }

    @Override
    public void remove(Curriculo curriculo) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        session.delete(curriculo);
        t.commit();        
    }

    @Override
    public void save(Curriculo curriculo) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        session.save(curriculo);
        t.commit();        
    }

    @Override
    public void update(Curriculo curriculo) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        session.update(curriculo);
        t.commit();
    }
    
}

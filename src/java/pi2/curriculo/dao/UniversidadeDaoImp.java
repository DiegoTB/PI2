/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2.curriculo.dao;

import pi2.curriculo.models.Universidade;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 *
 * @author alezonez
 */
public class UniversidadeDaoImp implements UniversidadeDao{
    
    @Override
    public Universidade getUniversidade(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();        
        return (Universidade) session.load(Universidade.class, id);
    }
    
    @Override
    public List<Universidade> list() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Universidade").list();
        t.commit();
        return lista;        
    }
    
    @Override
    public void remove(Universidade universidade) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        session.delete(universidade);
        t.commit();        
    }
    
    @Override
    public void save(Universidade universidade) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        session.save(universidade);
        t.commit();        
    }
    
    @Override
    public void update(Universidade universidade) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();      
        Transaction t = session.beginTransaction();
        session.update(universidade);
        t.commit();
    }
}

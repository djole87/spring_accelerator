package rs.refreshit.contacts.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Djordje on 4/25/2016.
 */
public abstract class AbstractHibernateDao<T> {

    private SessionFactory sessionFactory;

    AbstractHibernateDao(final SessionFactory sessisonFactory){
        this.sessionFactory = sessisonFactory;
    }

    protected Session session() {
        Session session = sessionFactory.getCurrentSession();
        return session;
    }

    protected List<T> loadAll(final Class<T> type){
        final DetachedCriteria criteria = DetachedCriteria.forClass(type);
        return criteria.getExecutableCriteria(session()).list();
    }

    protected T loadById(final Class<T> type,final Serializable id){
        return session().load(type, id);
    }

    protected T persist(final T type){
        return (T) session().save(type);
    }

    protected void edit(final T type){
        session().update(type);
    }

    protected void remove(final T type){
        session().delete(type);
    }

}

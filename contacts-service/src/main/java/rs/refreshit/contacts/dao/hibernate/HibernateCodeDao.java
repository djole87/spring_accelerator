package rs.refreshit.contacts.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rs.refreshit.contacts.dao.CodeDao;
import rs.refreshit.contacts.model.code.AbstractCode;

import java.util.List;

/**
 * Created by Djordje on 4/25/2016.
 */
@Repository("codeDao")
public class HibernateCodeDao<T extends AbstractCode> extends AbstractHibernateDao<T> implements CodeDao<T> {

    @Autowired
    public HibernateCodeDao(final SessionFactory sesisonFactory) {
        super(sesisonFactory);
    }

    @Override
    public T fetchById(final Class<T> type,final Long id) {
        return loadById(type, id);
    }

    @Override
    public List<T> fetchAll(Class<T> type) {
        return loadAll(type);
    }
}

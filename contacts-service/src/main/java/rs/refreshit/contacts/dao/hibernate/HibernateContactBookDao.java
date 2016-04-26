package rs.refreshit.contacts.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rs.refreshit.contacts.dao.ContactBookDao;
import rs.refreshit.contacts.model.entity.ContactBook;

/**
 * Created by Djordje on 4/25/2016.
 */
@Repository("contactBookDao")
public class HibernateContactBookDao extends AbstractHibernateDao<ContactBook> implements ContactBookDao{

    @Autowired
    HibernateContactBookDao(SessionFactory sesisonFactory) {
        super(sesisonFactory);
    }

    @Override
    public ContactBook fetchById(final Long id) {
        return fetchById(id);
    }

    @Override
    public ContactBook save(final ContactBook contactBook) {
        return persist(contactBook);
    }

    @Override
    public void update(final ContactBook contactBook) {
        edit(contactBook);
    }
}

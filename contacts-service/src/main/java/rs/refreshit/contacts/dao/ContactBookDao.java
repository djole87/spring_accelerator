package rs.refreshit.contacts.dao;

import rs.refreshit.contacts.model.entity.ContactBook;

import java.io.Serializable;

/**
 * Created by Djordje on 4/25/2016.
 */
public interface ContactBookDao {
    ContactBook fetchById(final Long id);
    Serializable save(final ContactBook contactBook);
    void update(final ContactBook contactBook);
}

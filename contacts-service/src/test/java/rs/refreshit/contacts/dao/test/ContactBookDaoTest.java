package rs.refreshit.contacts.dao.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import rs.refreshit.contacts.dao.hibernate.HibernateCodeDao;
import rs.refreshit.contacts.dao.hibernate.HibernateContactBookDao;
import rs.refreshit.contacts.model.code.City;
import rs.refreshit.contacts.model.code.Sex;
import rs.refreshit.contacts.model.entity.Address;
import rs.refreshit.contacts.model.entity.Contact;
import rs.refreshit.contacts.model.entity.ContactBook;

/**
 * Created by Djordje on 4/25/2016.
 */
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class ContactBookDaoTest extends AbstractDaoTest{

    private boolean setupDone = false;
    private Long id = new Long(1);

    @Autowired
    private HibernateContactBookDao hcbd;

    @Autowired
    private HibernateCodeDao hcd;

    @Before
    public void shouldSaveContactBook(){
        if(!setupDone){
            Sex sex = (Sex) hcd.fetchById(Sex.class, id);
            City city = (City) hcd.fetchById(City.class, id);

            Address address = new Address("Hilandarska", "8/7");
            address.setCity(city);

            Contact contact = new Contact("Djordje", "Stanojevic", "+381604433018");
            contact.setSex(sex);
            contact.setAddress(address);

            ContactBook contactBook = new ContactBook();
            contactBook.getContacts().add(contact);

            Long persistedCbId = (Long) hcbd.save(contactBook);
            Assert.assertNotNull(persistedCbId);

            id = persistedCbId;
            setupDone = true;
        }
    }

    @Test
    public void shouldFetchContactBook(){
        ContactBook persisted = hcbd.fetchById(id);
        Assert.assertFalse(persisted.getContacts().isEmpty());
        Assert.assertEquals(1, persisted.getContacts().size());
    }

    @Test
    public void shouldUpdateContactBook(){
        ContactBook persisted = hcbd.fetchById(id);

        Sex sex = (Sex) hcd.fetchById(Sex.class, new Long(1));
        City city = (City) hcd.fetchById(City.class, new Long(1));

        Address address = new Address("Norveskih Interniraca", "10");
        address.setCity(city);

        Contact contact = new Contact("Marko", "Markovic", "+381619879879");
        contact.setSex(sex);
        contact.setAddress(address);

        persisted.getContacts().add(contact);
        hcbd.update(persisted);

        persisted = hcbd.fetchById(id);
        Assert.assertEquals(2, persisted.getContacts().size());
    }

}

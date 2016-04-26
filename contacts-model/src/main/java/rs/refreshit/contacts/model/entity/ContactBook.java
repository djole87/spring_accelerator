package rs.refreshit.contacts.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Djordje on 4/11/2016.
 */
@Table(name = "CONTACT_BOOK")
@Entity
public class ContactBook extends AbstractEntity{

    @OneToMany(targetEntity = Contact.class, cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JoinColumn(name = "CONTACT_BOOK_ID", referencedColumnName = "ID")
    private Set<Contact> contacts = new HashSet<>();

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
}

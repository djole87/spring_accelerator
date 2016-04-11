package rs.refreshit.contacts.model.entity;

import rs.refreshit.contacts.model.code.Sex;

import javax.persistence.*;

/**
 * Created by Administrator on 4/10/2016.
 */
@Table(name = "CONTACT")
@Entity
public final class Contact extends AbstractEntity {

    @Column(name = "FIRSTNAME", table = "CONTACT", nullable = false)
    private String firstName;

    @Column(name = "LASTNAME", table = "CONTACT", nullable = false)
    private String lastName;

    @Column(name = "PHONE", table = "CONTACT", nullable = false)
    private String phone;

    @Column(name = "EMAIL", table = "CONTACT")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Address.class, optional = false)
    @JoinColumn(table = "CONTACT", name = "SEX_ID", nullable = false)
    private Sex sex;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Sex.class, optional = false)
    @JoinColumn(table = "CONTACT", name = "ADDRESS_ID", nullable = false)
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

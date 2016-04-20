package rs.refreshit.contacts.model.entity;

import rs.refreshit.contacts.model.code.City;

import javax.persistence.*;

/**
 * Created by Administrator on 4/10/2016.
 */
@Table(name = "ADDRESS")
@Entity
public final class Address extends AbstractEntity{

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "STREET_NO", nullable = false)
    private String streetNo;

    @ManyToOne(targetEntity = City.class, optional = false)
    @JoinColumn(table = "ADDRESS", name = "CITY_ID", nullable = false)
    private City city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

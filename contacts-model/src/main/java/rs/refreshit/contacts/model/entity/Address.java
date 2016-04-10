package rs.refreshit.contacts.model.entity;

import rs.refreshit.contacts.model.code.City;

/**
 * Created by Administrator on 4/10/2016.
 */
public final class Address extends AbstractEntity{
    private String street;
    private String streetNo;
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

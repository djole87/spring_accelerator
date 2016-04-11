package rs.refreshit.contacts.model.code;

import javax.persistence.*;

/**
 * Created by Administrator on 4/10/2016.
 */
@Access(AccessType.FIELD)
@Table(name = "CITY")
@Entity
public final class City extends AbstractCode {

    @Column(name = "ZIP_CODE", table = "CITY", nullable = false)
    private final String zipCode;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Country.class, optional = false)
    @JoinColumn(table = "CITY", name = "COUNTRY_ID", nullable = false)
    private final Country country;

    public City() {
        zipCode = null;
        country = null;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Country getCountry() {
        return country;
    }
}

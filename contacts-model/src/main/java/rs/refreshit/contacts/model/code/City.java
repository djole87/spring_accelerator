package rs.refreshit.contacts.model.code;

/**
 * Created by Administrator on 4/10/2016.
 */
public final class City extends AbstractCode {

    private final String zipCode;
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

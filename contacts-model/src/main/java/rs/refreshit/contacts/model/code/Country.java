package rs.refreshit.contacts.model.code;

import javax.persistence.*;

/**
 * Created by Administrator on 4/10/2016.
 */
@Access(AccessType.FIELD)
@Table(name = "COUNTRY")
@Entity
final class Country extends AbstractCode{

    @Column(name = "ALPHA_2", table = "COUNTRY", nullable = false, unique = true)
    private final String alphaTwo;
    @Column(name = "ALPHA_3", table = "COUNTRY", nullable = false, unique = true)
    private final String alphaThree;


    public Country() {
        alphaTwo = null;
        alphaThree = null;
    }

    public String getAlphaTwo() {
        return alphaTwo;
    }

    public String getAlphaThree() {
        return alphaThree;
    }
}

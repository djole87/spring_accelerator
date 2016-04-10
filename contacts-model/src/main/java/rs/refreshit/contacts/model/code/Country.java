package rs.refreshit.contacts.model.code;

/**
 * Created by Administrator on 4/10/2016.
 */
final class Country extends AbstractCode{
    private final String alphaTwo;
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

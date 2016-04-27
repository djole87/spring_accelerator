package rs.refreshit.contacts.dao.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import rs.refreshit.contacts.dao.hibernate.HibernateCodeDao;
import rs.refreshit.contacts.model.code.City;
import rs.refreshit.contacts.model.code.Country;
import rs.refreshit.contacts.model.code.Sex;

import java.util.List;

/**
 * Created by Djordje on 4/25/2016.
 */
public class CodeDaoTest extends AbstractDaoTest{

    @Autowired
    private HibernateCodeDao hcd;

    @Test
    public void shouldFetchAllSexes(){
        List<Sex> sexList = hcd.fetchAll(Sex.class);
        Assert.assertEquals(2, sexList.size());
    }

    @Test
    public void shouldFetchAllCountries(){
        List<Sex> countryList = hcd.fetchAll(Country.class);
        Assert.assertEquals(5, countryList.size());
    }


    @Test
    public void shouldFetchAllCities(){
        List<City> cityList = hcd.fetchAll(City.class);
        Assert.assertEquals(15, cityList.size());
    }

    @Test
    public void shouldFetchCodeClassesById(){
        Sex sex = (Sex) hcd.fetchById(Sex.class, new Long(1));
        Assert.assertEquals("Male", sex.getName());

        Country country = (Country) hcd.fetchById(Country.class, new Long(1));
        Assert.assertEquals("Serbia", country.getName());

        City city = (City) hcd.fetchById(City.class, new Long(3));
        Assert.assertEquals("Uzice", city.getName());
    }

}

package rs.refreshit.contacts.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rs.refreshit.contacts.dao.config.HibernateConfig;
import rs.refreshit.contacts.dao.config.LiquibaseConfig;
import rs.refreshit.contacts.model.code.AbstractCode;
import rs.refreshit.contacts.model.code.City;
import rs.refreshit.contacts.model.code.Country;
import rs.refreshit.contacts.model.code.Sex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 4/10/2016.
 */
@Configuration
@ComponentScan(basePackages = {"rs.refreshit.contacts.service"})
@Import({LiquibaseConfig.class, HibernateConfig.class})
public class ContactsServiceConfig {

    @Bean
    List<Class<? extends AbstractCode>> codesList(){
        ArrayList<Class<? extends AbstractCode>> list = new ArrayList<>();
        list.add(Sex.class);
        list.add(Country.class);
        list.add(City.class);
        return list;
    }
}

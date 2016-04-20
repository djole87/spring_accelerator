package rs.refreshit.contacts.service.config;

import liquibase.Liquibase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 4/10/2016.
 */
@Configuration
@ComponentScan(basePackages = {"rs.refreshit.contacts.service.impl"})
@Import({LiquibaseConfig.class, HibernateConfig.class})
public class ContactsServiceConfig {
}

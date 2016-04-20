package rs.refreshit.contacts.service.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Djordje on 4/12/2016.
 */
@Configuration
public class LiquibaseConfig {

    @Autowired
    private HibernateConfig hibernateConfig;

    @Bean
    public SpringLiquibase liquibase(){
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(hibernateConfig.dataSource());
        liquibase.setChangeLog("liquibase/db-changelog-master.xml");
        return liquibase;
    }

}

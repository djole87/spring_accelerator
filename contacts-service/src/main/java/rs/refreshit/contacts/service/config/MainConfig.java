package rs.refreshit.contacts.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 4/10/2016.
 */
@Configuration
@Import({ContactsServiceConfig.class, HibernateConfig.class})
public class MainConfig {
}

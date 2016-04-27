package rs.refreshit.contacts.dao.test;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rs.refreshit.contacts.service.config.ContactsServiceConfig;

import javax.transaction.Transactional;

/**
 * Created by Djordje on 4/27/2016.
 */
@Transactional
@ContextConfiguration(classes = ContactsServiceConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractDaoTest {

}

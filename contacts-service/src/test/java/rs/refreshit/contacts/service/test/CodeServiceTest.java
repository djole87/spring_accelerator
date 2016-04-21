package rs.refreshit.contacts.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rs.refreshit.contacts.model.code.Sex;
import rs.refreshit.contacts.service.CodeService;
import rs.refreshit.contacts.service.config.ContactsServiceConfig;

import java.util.Collections;

/**
 * Created by Administrator on 4/11/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ContactsServiceConfig.class)
public class CodeServiceTest {

    @Autowired
    private CodeService codeService;

    @Test
    public void shouldFetchAllCodes(){
        Assert.assertEquals(Collections.emptyList(), codeService.fetchAll(Sex.class));
    }

//    @Test
//    public void test(){
//        //Field Filter
//        TestBean tb = new TestBean();
//        ReflectionUtils.doWithFields(tb.getClass(), new ReflectionUtils.FieldCallback() {
//            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
//                final MojaAnotacija annotation = AnnotationUtils.findAnnotation(field, MojaAnotacija.class);
//                if(annotation != null){
//                    System.out.println("Nadjoh");
//                }
//            }
//        });
//    }
//
//    private final class TestBean{
//        @MojaAnotacija
//        private String withAnnotation;
//        private String withoutAnnotation;
//
//    }
}

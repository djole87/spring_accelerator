package rs.refreshit.contacts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rs.refreshit.contacts.dao.hibernate.HibernateCodeDao;
import rs.refreshit.contacts.model.code.AbstractCode;
import rs.refreshit.contacts.service.CodeService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 4/10/2016.
 */
@Service("codeService")
public class CodeServiceImpl<T extends AbstractCode> implements CodeService<T> {

    @Resource(name = "codesList")
    private List<Class<? extends AbstractCode>> listOfCodeClasses;

    @Autowired
    private HibernateCodeDao hcd;


    public List<Class<? extends AbstractCode>> getListOfCodeClasses() {
        return listOfCodeClasses;
    }

    public void setListOfCodeClasses(List<Class<? extends AbstractCode>> listOfCodeClasses) {
        this.listOfCodeClasses = listOfCodeClasses;
    }

    public HibernateCodeDao getHcd() {
        return hcd;
    }

    public void setHcd(HibernateCodeDao hcd) {
        this.hcd = hcd;
    }



    @Override
    public Map<Class<T>, List<T>> getCodes() {
        Map<Class<T>, List<T>> codesMap = new HashMap<>();
        listOfCodeClasses.forEach(code -> codesMap.put((Class<T>) code, (List<T>)hcd.fetchAll(code)));
        return codesMap;
    }
















}

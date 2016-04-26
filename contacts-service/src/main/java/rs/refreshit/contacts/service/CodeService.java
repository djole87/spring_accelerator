package rs.refreshit.contacts.service;

import rs.refreshit.contacts.model.code.AbstractCode;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 4/10/2016.
 */
@Transactional
public interface CodeService<T extends AbstractCode> {
    Map<Class<T>, List<T>> getCodes();
}

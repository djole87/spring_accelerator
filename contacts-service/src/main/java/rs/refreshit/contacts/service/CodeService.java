package rs.refreshit.contacts.service;

import rs.refreshit.contacts.model.code.AbstractCode;

import java.util.List;

/**
 * Created by Administrator on 4/10/2016.
 */
public interface CodeService {
    <T extends AbstractCode> List<T> fetchAll(final Class<T> type);
}

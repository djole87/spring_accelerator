package rs.refreshit.contacts.dao;

import org.springframework.stereotype.Repository;
import rs.refreshit.contacts.model.code.AbstractCode;
import java.util.List;

/**
 * Created by Djordje on 4/25/2016.
 */
public interface CodeDao<T extends AbstractCode> {
    T fetchById(final Class<T> type, final Long id);
    List<T> fetchAll(final Class<T> type);
}

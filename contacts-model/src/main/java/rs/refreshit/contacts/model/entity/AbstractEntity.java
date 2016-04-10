package rs.refreshit.contacts.model.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 4/10/2016.
 */
public abstract class AbstractEntity implements Serializable {
    private final Long id;

    AbstractEntity(){
        id = null;
    }

    public Long getId() {
        return id;
    }
}

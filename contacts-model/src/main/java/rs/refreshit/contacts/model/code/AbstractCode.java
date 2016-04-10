package rs.refreshit.contacts.model.code;

import java.io.Serializable;

/**
 * Created by Administrator on 4/10/2016.
 */
public abstract class AbstractCode implements Serializable {

    private final Long id;
    private final String name;

    protected AbstractCode(){
        id = null;
        name = null;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

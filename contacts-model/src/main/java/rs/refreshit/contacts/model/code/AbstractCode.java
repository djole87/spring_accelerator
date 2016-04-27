package rs.refreshit.contacts.model.code;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 4/10/2016.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractCode implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private final Long id;

    @Column(name = "NAME", nullable = false)
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

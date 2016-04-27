package rs.refreshit.contacts.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 4/10/2016.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private final Long id;

    AbstractEntity(){
        id = null;
    }

    public Long getId() {
        return id;
    }
}

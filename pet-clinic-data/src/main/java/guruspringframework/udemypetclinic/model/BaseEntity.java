package guruspringframework.udemypetclinic.model;

import java.io.Serializable;

/**
 * + Created by jensW89
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

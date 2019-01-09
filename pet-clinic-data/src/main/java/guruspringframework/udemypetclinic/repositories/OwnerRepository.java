package guruspringframework.udemypetclinic.repositories;

import guruspringframework.udemypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

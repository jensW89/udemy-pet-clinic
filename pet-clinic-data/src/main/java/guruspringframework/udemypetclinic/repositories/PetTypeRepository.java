package guruspringframework.udemypetclinic.repositories;

import guruspringframework.udemypetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

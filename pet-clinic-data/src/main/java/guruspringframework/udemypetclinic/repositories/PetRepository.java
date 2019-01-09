package guruspringframework.udemypetclinic.repositories;

import guruspringframework.udemypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}

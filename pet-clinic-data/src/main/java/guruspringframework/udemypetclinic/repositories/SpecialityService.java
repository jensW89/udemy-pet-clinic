package guruspringframework.udemypetclinic.repositories;

import guruspringframework.udemypetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89
 */
public interface SpecialityService extends CrudRepository<Speciality, Long> {
}

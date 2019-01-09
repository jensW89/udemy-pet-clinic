package guruspringframework.udemypetclinic.repositories;

import guruspringframework.udemypetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}

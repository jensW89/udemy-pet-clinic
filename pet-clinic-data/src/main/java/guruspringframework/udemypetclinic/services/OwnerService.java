package guruspringframework.udemypetclinic.services;

import guruspringframework.udemypetclinic.model.Owner;

import java.util.Set;

/**!
 * created by jensW89
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

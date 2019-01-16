package guruspringframework.udemypetclinic.services;

import guruspringframework.udemypetclinic.model.Owner;

import java.util.List;

/**!
 * created by jensW89
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}

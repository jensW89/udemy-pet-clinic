package guruspringframework.udemypetclinic.services;

import guruspringframework.udemypetclinic.model.Owner;

/**!
 * created by jensW89
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

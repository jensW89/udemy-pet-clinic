package guruspringframework.udemypetclinic.services;


import guruspringframework.udemypetclinic.model.Vet;

import java.util.Set;

/**
 * created by jensW89
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

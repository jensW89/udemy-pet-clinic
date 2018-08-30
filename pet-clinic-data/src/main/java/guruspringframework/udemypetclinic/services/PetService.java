package guruspringframework.udemypetclinic.services;

import guruspringframework.udemypetclinic.model.Pet;

import java.util.Set;

/**
 * created by jensW89
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

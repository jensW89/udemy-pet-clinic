package guruspringframework.udemypetclinic.services.map;

import guruspringframework.udemypetclinic.model.Owner;
import guruspringframework.udemypetclinic.model.Pet;
import guruspringframework.udemypetclinic.services.OwnerService;
import guruspringframework.udemypetclinic.services.PetService;
import guruspringframework.udemypetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jensW89
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {

        if(object != null){
            if(object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else{
            return null;
        }

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
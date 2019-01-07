package guruspringframework.udemypetclinic.services.map;

import guruspringframework.udemypetclinic.model.Speciality;
import guruspringframework.udemypetclinic.model.Vet;
import guruspringframework.udemypetclinic.services.SpecialitiesService;
import guruspringframework.udemypetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jensW89
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    public VetServiceMap(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

    private final SpecialitiesService specialitiesService;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialitiesService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

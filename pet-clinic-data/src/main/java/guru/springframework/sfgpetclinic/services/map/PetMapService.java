package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Pet Object) {
    super.delete(Object);
    }

    @Override
    public Pet save(Pet Object) {
        return super.save(Object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

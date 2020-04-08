package services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import services.CrudService;

import java.util.Set;

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
        return super.save(Object.getId(),Object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

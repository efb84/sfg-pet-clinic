package services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import services.CrudService;
import services.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet Object) {
        super.delete(Object);
    }

    @Override
    public Vet save(Vet Object) {
        return super.save(Object.getId(), Object);
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }
}

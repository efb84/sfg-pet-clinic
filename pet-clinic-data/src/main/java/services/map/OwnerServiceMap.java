package services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner Object) {
        return super.save(Object.getId(), Object);
    }

    @Override
    public void delete(Owner Object) {
        super.delete(Object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}

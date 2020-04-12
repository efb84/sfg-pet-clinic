package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
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
        return super.save(Object);
    }

    @Override
    public void delete(Owner Object) {
        super.delete(Object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public Owner findByLastname(String lastName) {
        return null;
    }
}

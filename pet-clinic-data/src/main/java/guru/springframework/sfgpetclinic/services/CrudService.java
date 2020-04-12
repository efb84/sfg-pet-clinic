package guru.springframework.sfgpetclinic.services;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T Object);

    void delete(T Object);

    void deleteById(ID id);

}

package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntitiy;
import org.hibernate.mapping.Collection;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public abstract class AbstractMapService<T extends BaseEntitiy, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());

    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else{
            throw new RuntimeException("Object can not be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {

        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    T findByLastname(String lastName){

        return map.get(lastName) ;
    }


    public Long getNextId() {

        Long nextId =null;

        try {
            nextId =Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextId =1L;
        }

        return nextId;

    }

}

package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface OwnerService extends  CrudService<Owner,Long>{

    Owner findByLastname(String lastName);

}

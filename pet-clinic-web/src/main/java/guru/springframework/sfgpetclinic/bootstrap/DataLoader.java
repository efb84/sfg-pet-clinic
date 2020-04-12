package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Component;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;

    private final VetService vetService;


 /*   public DataLoader() { ownerService= new OwnerServiceMap();
        vetService=new VetMapService();
  }*/


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1= new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Fikret");
        owner1.setLastName("byk");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ayse");
        owner2.setLastName("byk");

        ownerService.save(owner2);

        Owner owner3= new Owner();
        owner3.setId(3L);
        //owner1.setFistName("");
        owner3.setLastName("bos");

        ownerService.save(owner3);

        System.out.println("Owners are loaded.....");


        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstName("ahmet");
        vet1.setLastName("alan");


        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstName("hasan");
        vet2.setLastName("alan");

        vetService.save(vet2);

        System.out.println("Vets are loaded....");
        System.out.println("version: " + SpringVersion.getVersion());
    }
}

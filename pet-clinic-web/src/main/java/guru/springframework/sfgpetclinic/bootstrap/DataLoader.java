package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;


    public DataLoader() {

        ownerService= new OwnerServiceMap();
        vetService=new VetMapService();


    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1= new Owner();
        owner1.setId(1L);
        owner1.setFistName("Fikret");
        owner1.setLastName("byk");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setId(2L);
        owner2.setFistName("Ayse");
        owner2.setLastName("byk");

        ownerService.save(owner2);

        System.out.println("Owners are loaded.....");


        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFistName("ahmet");
        vet1.setLastName("alan");


        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFistName("hasan");
        vet2.setLastName("alan");

        vetService.save(vet2);

        System.out.println("Vets are loaded....");
    }
}

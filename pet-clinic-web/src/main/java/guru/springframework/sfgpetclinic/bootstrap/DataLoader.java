package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Component;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;

    private final VetService vetService;

    private final PetTypeService petTypeService;


 /*   public DataLoader() { ownerService= new OwnerServiceMap();
        vetService=new VetMapService();
  }*/


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {


        PetType dog = new PetType();
        dog.setName("figoo");
        PetType saveDogType= petTypeService.save(dog);
       // System.out.println("asdasds:"+saveDogType.getName());

        PetType cat= new PetType();
        cat.setName("kedicik");
        PetType saveCatType= petTypeService.save(cat);

        Owner owner1= new Owner();
        owner1.setFirstName("Fikret");
        owner1.setLastName("byk");
        owner1.setAdress("Nalbantoğlu");
        owner1.setCity("bursa");
        owner1.setTelephone("123456788");


        Pet fikos=new Pet();
        fikos.setPetType(saveDogType);
        fikos.setOwner(owner1);
        fikos.setBirthDay(LocalDate.now());
        fikos.setName("Figooooo111");

        owner1.getPets().add(fikos);

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Ayse");
        owner2.setLastName("byk");
        owner2.setAdress("kalsacekntoğlu");
        owner2.setCity("ankara");
        owner2.setTelephone("2222000339");

        Pet aysesPet=new Pet();
        aysesPet.setPetType(saveCatType);
        aysesPet.setOwner(owner2);
        aysesPet.setBirthDay(LocalDate.now());
        aysesPet.setName("ayseciikkkkk!!");

        owner2.getPets().add(aysesPet);

        ownerService.save(owner2);

        Owner owner3= new Owner();
        //owner1.setFistName("");
        owner3.setLastName("bos");

        ownerService.save(owner3);

        System.out.println("Owners are loaded.....");


        Vet vet1= new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("ahmet");
        vet1.setLastName("alan");


        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("hasan");
        vet2.setLastName("alan");

        vetService.save(vet2);

        System.out.println("Vets are loaded.1...");
        System.out.println("version: " + SpringVersion.getVersion());
    }
}

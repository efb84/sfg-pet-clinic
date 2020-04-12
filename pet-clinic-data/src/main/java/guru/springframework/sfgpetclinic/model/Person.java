package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntitiy{

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFistName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

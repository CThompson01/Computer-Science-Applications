package examples.pltw.org;

public abstract class FamilyMember {
    private String firstName;
    private String lastName;

    public FamilyMember() {
        firstName = "Ada";
        lastName = "Lovelace";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

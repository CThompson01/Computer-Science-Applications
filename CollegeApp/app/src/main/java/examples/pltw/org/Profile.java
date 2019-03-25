package examples.pltw.org;

public class Profile {
    String firstName;
    String lastName;

    public Profile() {
        firstName = "Ada";
        lastName = "Wong";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

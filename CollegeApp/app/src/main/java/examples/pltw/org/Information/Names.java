package examples.pltw.org.Information;

import android.text.Editable;
import android.widget.EditText;

public abstract class Names {
    String firstName;
    String lastName;

    public Names() {
        firstName = "Ada";
        lastName = "Wong";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setFirstName(Editable firstName) {
        setFirstName(String.valueOf(firstName));
    }

    public void setFirstName(EditText firstName) {
        setFirstName(firstName.getText());
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLastName(Editable lastName) {
        setLastName(String.valueOf(lastName));
    }

    public void setLastName(EditText lastName) {
        setLastName(lastName.getText());
    }
}
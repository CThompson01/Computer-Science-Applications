package examples.pltw.org.Utilities;

import android.text.Editable;
import android.widget.EditText;

public class Utilities {

    public static boolean isNull(EditText input) {
        return isNull(input.getText());
    }

    public static boolean isNull(Editable input) {
        return String.valueOf(input).equals("") || String.valueOf(input).equals(" ");
    }
}

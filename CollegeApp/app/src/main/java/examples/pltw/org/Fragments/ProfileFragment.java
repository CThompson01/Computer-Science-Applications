package examples.pltw.org.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import examples.pltw.org.Information.Profile;
import examples.pltw.org.R;

import static examples.pltw.org.Utilities.Utilities.isNull;

public class ProfileFragment extends Fragment {

    TextView firstName;
    TextView lastName;

    EditText mFirstName;
    EditText mLastName;

    DatePicker birthdayPicker;
    Date birthdate;

    Button mSubmit;

    Profile profile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        profile = new Profile();

        // Initializes the first and last name text view
        firstName = rootView.findViewById(R.id.firstName);
        lastName = rootView.findViewById(R.id.lastName);

        // Initializes the first and last name editors
        mFirstName = rootView.findViewById(R.id.first_name_edit);
        mLastName = rootView.findViewById(R.id.last_name_edit);

        // Initializes the birthday picker
        birthdayPicker = rootView.findViewById(R.id.birthday_picker);

        // Initializes the submit button
        mSubmit = rootView.findViewById(R.id.submit_button);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Checks to make sure input boxes aren't empty
                // If input boxes are empty, it doesn't update data
                if (!isNull(mFirstName)) { // Sets the first name in the profile class and updates the text
                    profile.setFirstName(mFirstName);
                    firstName.setText(profile.getFirstName());
                } if (!isNull(mLastName)) { // Sets the last name in the profile class and updates the text
                    profile.setLastName(mLastName);
                    lastName.setText(profile.getLastName());
                }

                SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                int day = birthdayPicker.getDayOfMonth();
                int month = birthdayPicker.getMonth();
                int year = birthdayPicker.getYear();
                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month, day);
                String formattedDate = sdf.format(calendar.getTime());
                try {
                    birthdate = sdf.parse(formattedDate);
                    TextView birthday = rootView.findViewById(R.id.birthdate);
                    String birthdayString = "Birthday: " + birthdate.getMonth() + "/"
                            + birthdate.getDate() + "/" + (birthdate.getYear()+1900);
                    birthday.setText(birthdayString);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        // Sets the first and last name to the default
        firstName.setText(profile.getFirstName());
        lastName.setText(profile.getLastName());

        return rootView;
    }
}

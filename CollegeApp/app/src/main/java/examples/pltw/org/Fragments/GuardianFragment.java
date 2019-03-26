package examples.pltw.org.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import examples.pltw.org.Information.Guardian;
import examples.pltw.org.R;

import static examples.pltw.org.Utilities.Utilities.isNull;

public class GuardianFragment extends Fragment {

    TextView firstName;
    TextView lastName;

    EditText mFirstName;
    EditText mLastName;

    Button mSubmit;

    Guardian member;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);

        member = new Guardian();

        // Initializes the first and last name text view
        firstName = rootView.findViewById(R.id.firstName);
        lastName = rootView.findViewById(R.id.lastName);

        // Initializes the first and last name editors
        mFirstName = rootView.findViewById(R.id.first_name_edit);
        mLastName = rootView.findViewById(R.id.last_name_edit);

        // Initializes the submit button
        mSubmit = rootView.findViewById(R.id.submit_button);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Checks to make sure input boxes aren't empty
                // If input boxes are empty, it doesn't update data
                if (!isNull(mFirstName)) { // Sets the first name in the profile class and updates the text
                    member.setFirstName(mFirstName);
                    firstName.setText(member.getFirstName());
                } if (!isNull(mLastName)) { // Sets the last name in the profile class and updates the text
                    member.setLastName(mLastName);
                    lastName.setText(member.getLastName());
                }
            }
        });

        // Sets the first and last name to the default
        firstName.setText(member.getFirstName());
        lastName.setText(member.getLastName());

        return rootView;
    }
}

package examples.pltw.org;

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

public class GuardianFragment extends Fragment {

    TextView firstName;
    TextView lastName;

    EditText mFirstName;
    EditText mLastName;

    Button mSubmit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);

        Guardian member = new Guardian();

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
                firstName.setText(mFirstName.getText());
                lastName.setText(mLastName.getText());
            }
        });

        // Sets the first and last name to the default
        firstName.setText(member.getFirstName());
        lastName.setText(member.getLastName());

        return rootView;
    }
}

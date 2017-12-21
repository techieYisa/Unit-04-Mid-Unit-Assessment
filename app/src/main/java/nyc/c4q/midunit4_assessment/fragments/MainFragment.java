package nyc.c4q.midunit4_assessment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import nyc.c4q.midunit4_assessment.R;

/**
 * Created by c4q on 12/20/17.
 */

public class MainFragment extends Fragment {
    private View rootView;
    private Button fragmentButton;

    public MainFragment() {
        //required empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        fragmentButton = rootView.findViewById(R.id.fragment_button);
        fragmentButton.setOnClickListener(this);

        return rootView;
    }

}



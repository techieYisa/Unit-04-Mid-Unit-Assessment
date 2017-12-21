package nyc.c4q.midunit4_assessment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.midunit4_assessment.R;

/**
 * Created by c4q on 12/20/17.
 */

public class DisplayFragment extends Fragment {

    View rootView;

    public void DisplayFragment(){
        //necessary empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.display_fragment, container, false);
        return rootView;
    }
}

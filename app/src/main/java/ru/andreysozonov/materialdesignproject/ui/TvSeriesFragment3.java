package ru.andreysozonov.materialdesignproject.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.materialdesignproject.R;

public class TvSeriesFragment3 extends Fragment {


    public static TvSeriesFragment3 newInstance(Bundle bundle){
        TvSeriesFragment3 currentFragment = new TvSeriesFragment3();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public TvSeriesFragment3() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tvseries3, container, false);
        return rootView;
    }
}

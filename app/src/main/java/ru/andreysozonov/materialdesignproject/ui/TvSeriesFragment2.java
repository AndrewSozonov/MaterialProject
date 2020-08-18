package ru.andreysozonov.materialdesignproject.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.materialdesignproject.R;

public class TvSeriesFragment2 extends Fragment {


    public static TvSeriesFragment2 newInstance(Bundle bundle){
        TvSeriesFragment2 currentFragment = new TvSeriesFragment2();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public TvSeriesFragment2() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tvseries2, container, false);
        return rootView;
    }
}

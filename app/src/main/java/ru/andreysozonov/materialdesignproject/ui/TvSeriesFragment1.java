package ru.andreysozonov.materialdesignproject.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.materialdesignproject.R;

public class TvSeriesFragment1 extends Fragment {


    public static TvSeriesFragment1 newInstance(Bundle bundle){
        TvSeriesFragment1 currentFragment = new TvSeriesFragment1();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public TvSeriesFragment1() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tvseries1, container, false);
        return rootView;
    }
}

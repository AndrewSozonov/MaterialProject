package ru.andreysozonov.materialdesignproject.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import ru.andreysozonov.materialdesignproject.R;

public class TvseriesFragment extends Fragment {

    private TvseriesViewModel tvseriesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tvseriesViewModel =
                ViewModelProviders.of(this).get(TvseriesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tvseries, container, false);
        /*final TextView textView = root.findViewById(R.id.text_gallery);
        tvseriesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}
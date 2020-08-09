package ru.andreysozonov.materialdesignproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import ru.andreysozonov.materialdesignproject.R;

public class MoviesFragment extends Fragment {

    private MoviesViewModel moviesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        moviesViewModel =
                ViewModelProviders.of(this).get(MoviesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_movies, container, false);
        /*final TextView textView = root.findViewById(R.id.text_home);
        moviesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}
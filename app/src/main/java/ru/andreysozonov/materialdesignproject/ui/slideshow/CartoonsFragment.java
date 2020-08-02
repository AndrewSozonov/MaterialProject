package ru.andreysozonov.materialdesignproject.ui.slideshow;

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

public class CartoonsFragment extends Fragment {

    private CartoonsViewModel cartoonsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cartoonsViewModel =
                ViewModelProviders.of(this).get(CartoonsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cartoons, container, false);
        /*final TextView textView = root.findViewById(R.id.text_slideshow);
        cartoonsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}
package ru.andreysozonov.materialdesignproject.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CartoonsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CartoonsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cartoons fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
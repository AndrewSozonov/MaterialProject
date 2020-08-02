package ru.andreysozonov.materialdesignproject.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TvseriesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TvseriesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Tv Series fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
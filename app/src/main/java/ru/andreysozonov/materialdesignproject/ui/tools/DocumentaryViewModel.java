package ru.andreysozonov.materialdesignproject.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DocumentaryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DocumentaryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is documentary fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
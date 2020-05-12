package pl.gorczynski.bookweb.ui.informatyka;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformatykaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InformatykaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is informatyka fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
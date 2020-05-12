package pl.gorczynski.bookweb.ui.matematyka;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MatematykaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MatematykaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is matematyka fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
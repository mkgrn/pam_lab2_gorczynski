package pl.gorczynski.bookweb.ui.BookWeb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookWebViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BookWebViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is BookWeb fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
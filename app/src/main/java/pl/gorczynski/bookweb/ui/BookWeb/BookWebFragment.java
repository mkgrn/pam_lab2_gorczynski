package pl.gorczynski.bookweb.ui.BookWeb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class BookWebFragment extends Fragment {

   // private BookWebViewModel bookWebViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "BookWeb", Toast.LENGTH_SHORT).show();


        return null;
    }
}


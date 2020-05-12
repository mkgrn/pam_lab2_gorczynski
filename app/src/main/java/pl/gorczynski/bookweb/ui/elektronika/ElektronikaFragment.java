package pl.gorczynski.bookweb.ui.elektronika;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ElektronikaFragment extends Fragment {

    private ElektronikaViewModel elektronikaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "Elektronika", Toast.LENGTH_SHORT).show();


        return null;
    }
}

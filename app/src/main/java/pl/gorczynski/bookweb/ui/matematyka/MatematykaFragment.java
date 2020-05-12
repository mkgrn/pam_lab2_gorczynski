package pl.gorczynski.bookweb.ui.matematyka;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class MatematykaFragment extends Fragment {

    private MatematykaViewModel matematykaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "Matematyka", Toast.LENGTH_SHORT).show();

       /* matematykaViewModel =
                ViewModelProviders.of(this).get(MatematykaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_matematyka, container, false);
        final TextView textView = root.findViewById(R.id.text_matematyka);
        matematykaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        }); */
        return null;
    }
}

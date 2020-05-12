package pl.gorczynski.bookweb.ui.informatyka;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class InformatykaFragment extends Fragment {

    private InformatykaViewModel informatykaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "Informatyka", Toast.LENGTH_SHORT).show();

       /* informatykaViewModel =
                ViewModelProviders.of(this).get(InformatykaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_informatyka, container, false);
        final TextView textView = root.findViewById(R.id.text_informatyka);
        informatykaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        }); */
        return null;
    }
}

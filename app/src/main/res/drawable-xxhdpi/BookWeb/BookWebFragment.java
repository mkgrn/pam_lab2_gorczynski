package pl.jerzyna.bookweb.ui.BookWeb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import pl.jerzyna.bookweb.R;

public class BookWebFragment extends Fragment {

    private BookWebViewModel bookWebViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookWebViewModel =
                ViewModelProviders.of(this).get(BookWebViewModel.class);
        View root = inflater.inflate(R.layout.fragment_matematyka, container, false);
        final TextView textView = root.findViewById(R.id.text_matematyka);
        bookWebViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

package com.example.cinemashopandroid.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.cinemashopandroid.R;
import com.example.cinemashopandroid.databinding.FragmentFilmCardBinding;
import com.example.cinemashopandroid.databinding.FragmentHomeBinding;
import com.example.cinemashopandroid.ui.filmCard.FilmCard;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        FragmentContainerView f = binding.pane;

        getParentFragmentManager().beginTransaction()
                .add(new FilmCard(),"asd")
                .add(new FilmCard(),"sdasfda")
                .commit();




        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
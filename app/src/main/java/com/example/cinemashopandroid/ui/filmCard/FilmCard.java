package com.example.cinemashopandroid.ui.filmCard;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cinemashopandroid.MainActivity;
import com.example.cinemashopandroid.R;
import com.example.cinemashopandroid.databinding.FragmentHomeBinding;

public class FilmCard extends Fragment {
    private FragmentHomeBinding binding;

    private FilmCardViewModel mViewModel;

    public static FilmCard newInstance() {
        return new FilmCard();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_film_card, container, false);

    }

}
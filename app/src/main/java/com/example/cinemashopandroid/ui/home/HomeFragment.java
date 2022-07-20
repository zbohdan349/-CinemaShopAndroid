package com.example.cinemashopandroid.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemashopandroid.databinding.FragmentHomeBinding;
import com.example.cinemashopandroid.logic.FilmService;
import com.example.cinemashopandroid.logic.FilmsAdapter;
import com.example.cinemashopandroid.logic.RestClient;
import com.example.cinemashopandroid.logic.model.FilmDto;
import com.example.cinemashopandroid.logic.model.Language;
import com.example.cinemashopandroid.logic.model.Rating;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private static List<FilmDto> list =new ArrayList<>();
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //FragmentContainerView f = binding.pane;


        RecyclerView recyclerView = binding.listFilms;

        FilmService filmService = new FilmService();
        System.out.println("//////////");


        list.addAll(filmService.getFilms());
        recyclerView.setAdapter(new FilmsAdapter(this.getContext(),list));

        System.out.println(recyclerView.getAdapter().getItemCount());




        /*getParentFragmentManager().beginTransaction()
                .add(new FilmCard(),"asd")
                .add(new FilmCard(),"sdasfda")
                .commit();
*/



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
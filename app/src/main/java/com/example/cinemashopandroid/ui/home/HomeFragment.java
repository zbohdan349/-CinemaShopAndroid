package com.example.cinemashopandroid.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemashopandroid.MainActivity;
import com.example.cinemashopandroid.databinding.FragmentHomeBinding;
import com.example.cinemashopandroid.logic.FilmsAdapter;
import com.example.cinemashopandroid.logic.model.FilmDto;
import com.example.cinemashopandroid.logic.model.Language;
import com.example.cinemashopandroid.logic.model.Rating;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //FragmentContainerView f = binding.pane;


        RecyclerView recyclerView = binding.listFilms;

        FilmDto filmDto = new FilmDto(1,"asdasd",new Language(1,"asd"),2002,new BigDecimal(100),new BigDecimal(432), Rating.PG);
        FilmDto filmDto1 = new FilmDto(1,"asdasd",new Language(2,"asd"),2002,new BigDecimal(100),new BigDecimal(432), Rating.PG);
        List<FilmDto> filmDtoList = new ArrayList<>();
        filmDtoList.add(filmDto);
        filmDtoList.add(filmDto1);
        recyclerView.setAdapter(new FilmsAdapter(this.getContext(),filmDtoList));

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
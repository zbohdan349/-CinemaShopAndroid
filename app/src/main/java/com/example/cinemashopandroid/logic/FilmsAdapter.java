package com.example.cinemashopandroid.logic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemashopandroid.R;
import com.example.cinemashopandroid.logic.model.FilmDto;

import java.util.List;

public class FilmsAdapter  extends RecyclerView.Adapter<FilmsAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<FilmDto> films;

    public FilmsAdapter(Context context, List<FilmDto> films) {
        this.inflater = LayoutInflater.from(context);
        this.films = films;
    }

    @NonNull
    @Override
    public FilmsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_film_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsAdapter.ViewHolder holder, int position) {
        FilmDto f= films.get(position);
        holder.title.setText(f.getTitle());
        holder.rentRate.setText("1");
        holder.buyRate.setText("1");
        holder.year.setText(f.getYear().toString());
        holder.language.setText(f.getLanguage().getName());
        holder.rating.setText(f.getRating().toString());
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgView;
        final TextView language, year,title,rating,buyRate,rentRate;
        final LinearLayout categories;
        ViewHolder(View view){
            super(view);
            imgView = view.findViewById(R.id.imageView);
            language = view.findViewById(R.id.language);
            year=view.findViewById(R.id.year);
            title =view.findViewById(R.id.title);
            rating=view.findViewById(R.id.rating);
            buyRate=view.findViewById(R.id.buyRate);
            rentRate=view.findViewById(R.id.rentRate);
            categories = view.findViewById(R.id.categories);
        }
    }
}

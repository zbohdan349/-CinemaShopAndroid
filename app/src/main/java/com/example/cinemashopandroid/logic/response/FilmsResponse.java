package com.example.cinemashopandroid.logic.response;

import com.example.cinemashopandroid.logic.model.FilmDto;

import java.util.List;

public class FilmsResponse {
    private List<FilmDto> films;

    private int countOfElements;

    private int countOfPages;

    public FilmsResponse() {
    }

    public FilmsResponse(List<FilmDto> films, int countOfElements, int countOfPages) {
        this.films = films;
        this.countOfElements = countOfElements;
        this.countOfPages = countOfPages;
    }

    public List<FilmDto> getFilms() {
        return films;
    }

    public void setFilms(List<FilmDto> films) {
        this.films = films;
    }

    public int getCountOfElements() {
        return countOfElements;
    }

    public void setCountOfElements(int countOfElements) {
        this.countOfElements = countOfElements;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }
}

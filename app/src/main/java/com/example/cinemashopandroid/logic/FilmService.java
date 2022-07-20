package com.example.cinemashopandroid.logic;

import com.example.cinemashopandroid.logic.model.FilmDto;
import com.example.cinemashopandroid.logic.response.FilmsResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.BaseJsonHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class FilmService {

    private FilmDto filmDto;

    private List<FilmDto> films;

    private Gson gson;

    public FilmService() {
        gson=new Gson();
        filmDto = new FilmDto();
        films =new ArrayList<>();
    }

    /*public FilmDto getFilmDto() {
        RestClient.get("films?page=1", null, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, String rawJsonResponse, FilmDto response) {

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, String rawJsonData, FilmDto errorResponse) {
                System.out.println("Error: "+statusCode);
            }

            @Override
            protected FilmDto parseResponse(String rawJsonData, boolean isFailure) throws Throwable {
                return null;
            }
        });
        return filmDto;
    }*/

    public List<FilmDto> getFilms() {
        RestClient.get("films?page=1", null, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                films.add(new FilmDto());
                System.out.println(films);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
        return films;
    }
}

package com.example.cinemashopandroid.logic.model;

import java.math.BigDecimal;
import java.util.Set;

public class FilmDto {
    private Integer id;

    private String title;

    private Language language;

    private Integer year;

    private BigDecimal rentalRate;

    private BigDecimal buyRate;

    private Rating rating;

    private Set<Category> categories;

    private String imgUrl;

    public FilmDto() {
    }

    public FilmDto(Integer id, String title, Language language, Integer year, BigDecimal rentalRate, BigDecimal buyRate, Rating rating) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.year = year;
        this.rentalRate = rentalRate;
        this.buyRate = buyRate;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public BigDecimal getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(BigDecimal buyRate) {
        this.buyRate = buyRate;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

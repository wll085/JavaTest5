package com.hand.exam1.entity;

import java.util.Date;

public class Film {
    private Integer film_id;
    private String title;
    private Integer language_id;
    private Integer retal_duration;
    private Double retal_rate;
    private Double replacement_cost;
    private Date last_update;

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Integer getRetal_duration() {
        return retal_duration;
    }

    public void setRetal_duration(Integer retal_duration) {
        this.retal_duration = retal_duration;
    }

    public Double getRetal_rate() {
        return retal_rate;
    }

    public void setRetal_rate(Double retal_rate) {
        this.retal_rate = retal_rate;
    }

    public Double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}

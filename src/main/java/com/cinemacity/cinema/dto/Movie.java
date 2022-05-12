package com.cinemacity.cinema.dto;

public class Movie {
    private int codFilm;
    private String name;
    private String description;
    private String image;
    private String type;

    public int getCodFilm() {
        return codFilm;
    }

    public void setCodFilm(int codFilm) {
        this.codFilm = codFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

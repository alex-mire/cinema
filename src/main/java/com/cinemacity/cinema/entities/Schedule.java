package com.cinemacity.cinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schedule {
    @Id
    @Column(name="cod_film")
    private int codFilm;
    private String day;
    private String hour;
    private int room;
    private String type;

    public int getCodFilm() {
        return codFilm;
    }

    public void setCodFilm(int codFilm) {
        this.codFilm = codFilm;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

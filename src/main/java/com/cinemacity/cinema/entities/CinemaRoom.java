package com.cinemacity.cinema.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CinemaRoom {
    @Id
    private int id;
    private int NumberOfSeats;
    private Boolean Available;
    private int MovieID;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public Boolean getAvailable() {
        return Available;
    }

    public void setAvailable(Boolean available) {
        Available = available;
    }

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int movieID) {
        MovieID = movieID;
    }


}

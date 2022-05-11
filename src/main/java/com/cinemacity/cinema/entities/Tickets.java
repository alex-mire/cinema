package com.cinemacity.cinema.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tickets {
    @Id
    private int Id;
    private int MovieID;
    private int CinemaRoomID;
    private Double Price;
    private int Seat;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int movieID) {
        MovieID = movieID;
    }

    public int getCinemaRoomID() {
        return CinemaRoomID;
    }

    public void setCinemaRoomID(int cinemaRoomID) {
        CinemaRoomID = cinemaRoomID;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        Seat = seat;
    }
}

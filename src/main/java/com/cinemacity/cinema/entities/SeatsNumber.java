package com.cinemacity.cinema.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeatsNumber {
    @Id
    private int SeatNumber;
    private int CinemaRoom;
    private Boolean Available;

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    public int getCinemaRoom() {
        return CinemaRoom;
    }

    public void setCinemaRoom(int cinemaRoom) {
        CinemaRoom = cinemaRoom;
    }

    public Boolean getAvailable() {
        return Available;
    }

    public void setAvailable(Boolean available) {
        Available = available;
    }
}

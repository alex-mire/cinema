package com.cinemacity.cinema.exceptions;

public class InvalidArgException extends IllegalArgumentException{
    public InvalidArgException() {
        super("Invalid movie id");
    }
}

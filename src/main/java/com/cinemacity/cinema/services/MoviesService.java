package com.cinemacity.cinema.services;

import com.cinemacity.cinema.dto.Movie;
import com.cinemacity.cinema.entities.Movies;
import com.cinemacity.cinema.exceptions.InvalidArgException;
import com.cinemacity.cinema.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MoviesService {

    private final MoviesRepository moviesRepository;

    @Autowired
    public MoviesService(MoviesRepository moviesRepository){
        this.moviesRepository = moviesRepository;
    }

    public void addMovie(Movie m){
        Movies movie = new Movies();
        movie.setCodFilm(m.getCodFilm());
        movie.setDescription(m.getDescription());
        movie.setImage(m.getImage());
        movie.setName(m.getName());
        movie.setType(m.getType());
        moviesRepository.save(movie);
    }

    public List<Movies> getAllMovies(){
        return moviesRepository.findAll();
    }

    public Optional<Movies> getOneMovieById(int id) throws Exception {
        Optional<Movies> movie = moviesRepository.findById(id);
       if(movie.isEmpty()) {
           throw new InvalidArgException();
       }
        return movie;
    }

    public void deleteMovieById(int id){
        moviesRepository.deleteById(id);
    }

    public void deleteAllMovies(){
        moviesRepository.deleteAll();
    }

    public void changeMovieById(int id, Movie m){
        moviesRepository.deleteById(id);
        Movies movie = new Movies();
        movie.setCodFilm(m.getCodFilm());
        movie.setDescription(m.getDescription());
        movie.setImage(m.getImage());
        movie.setName(m.getName());
        movie.setType(m.getType());
        moviesRepository.save(movie);
    }

}

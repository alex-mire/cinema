package com.cinemacity.cinema.controllers;

import com.cinemacity.cinema.dto.Movie;
import com.cinemacity.cinema.entities.Movies;
import com.cinemacity.cinema.exceptions.InvalidArgException;
import com.cinemacity.cinema.repositories.MoviesRepository;
import com.cinemacity.cinema.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private final MoviesService moviesService;

    @Autowired
    public MoviesController(MoviesService moviesService){
        this.moviesService = moviesService;
    }

    @GetMapping("/all")
    public List<Movies> getAllMovies(){
        return moviesService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<?> getMovieById(@PathVariable int id) throws Exception {
        try{
            return moviesService.getOneMovieById(id);
        }
        catch (Exception e){
            return Optional.ofNullable(e.getMessage());
        }
    }

    @PostMapping("/add")
    public void addMovie(@RequestBody Movie m){
        moviesService.addMovie(m);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable int id){
        moviesService.deleteMovieById(id);
    }
    @DeleteMapping("/delete/all")
    public void deteleAllMovies(){
        moviesService.deleteAllMovies();
    }

    @PutMapping("/change/{id}")
    public void changeMovieById(@PathVariable int id, @RequestBody Movie m){
        moviesService.changeMovieById(id,m);
    }

}

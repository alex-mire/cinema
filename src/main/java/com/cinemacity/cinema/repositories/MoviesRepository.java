package com.cinemacity.cinema.repositories;

import com.cinemacity.cinema.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {
    /*@Modifying
    @Query("UPDATE 'cinema'.'movies' SET '")
    public void changeMovieById(Movies m, int id);*/
}

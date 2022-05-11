package com.cinemacity.cinema.repositories;

import com.cinemacity.cinema.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MoviesRepository implements JpaRepository<Movies, int> {

}

package com.cinemacity.cinema.repositories;

import com.cinemacity.cinema.entities.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Integer> {
}

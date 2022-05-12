package com.cinemacity.cinema.repositories;

import com.cinemacity.cinema.entities.RoomNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomNumberRepository extends JpaRepository<RoomNumber, Integer> {
}

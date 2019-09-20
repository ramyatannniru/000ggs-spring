package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reservation;
@Repository
public interface ReservationRepositories extends JpaRepository<Reservation, Long> {

}

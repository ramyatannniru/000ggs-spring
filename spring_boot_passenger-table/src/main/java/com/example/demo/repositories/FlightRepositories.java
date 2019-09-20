package com.example.demo.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Flight;

@Repository
public interface FlightRepositories extends CrudRepository<Flight, Long> {

}

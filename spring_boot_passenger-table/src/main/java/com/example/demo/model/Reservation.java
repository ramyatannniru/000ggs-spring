package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Reservation {
    public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Passenger passengers, Flight flights) {
		super();
		this.passengers = passengers;
		this.flights = flights;
	}

	public Reservation( String name, String address, Passenger passengers, Flight flights) {
		super();
		
		this.name = name;
		this.address = address;
		this.passengers = passengers;
		this.flights = flights;
	}

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    @OneToOne
    private Passenger passengers;
    @OneToOne
    private Flight flights;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	public Passenger getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger passengers) {
		this.passengers = passengers;
	}

	public Flight getFlights() {
		return flights;
	}

	public void setFlights(Flight flights) {
		this.flights = flights;
	}
}
package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Flight {
	public Flight() {
		super();
	}

    public Flight(String name, String source, String destination) {
		super();
		
		Name = name;
		this.source = source;
		this.destination = destination;
	}

	public Flight(String name, String source, String destination, Set<Passenger> passenger) {
		super();
		
		Name = name;
		this.source = source;
		this.destination = destination;
		this.passengers = passenger;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private String source;
    private String destination;

    @ManyToMany(mappedBy = "flights")
    private Set<Passenger> passengers = new HashSet<>();
   
  // private Set<Reservation> reservations = new HashSet<>();

  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return id != null ? id.equals(flight.id) : flight.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Set<Passenger> getPassenger() {
		return passengers;
	}

	public void setPassenger(Set<Passenger> passenger) {
		this.passengers = passenger;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", Name=" + Name + ", source=" + source + ", destination=" + destination
				+ ", passenger=" + passengers + "]";
	}
}
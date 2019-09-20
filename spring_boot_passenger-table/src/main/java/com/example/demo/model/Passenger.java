package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Passenger {
    public Passenger(Long id, String name, String gender, String age, Set<Flight> flights) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		
		this.flights = flights;
	}

	

	public Passenger( String name, String gender, String age) {
		super();
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String gender;
    private String age;
   
    @ManyToMany
    @JoinTable(name = "passenger_flight", joinColumns = @JoinColumn(name = "passenger_id"),
    inverseJoinColumns = @JoinColumn(name = "flight_id"))
    private Set<Flight> flights = new HashSet<>();

   
    

   

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        return id != null ? id.equals(passenger.id) : passenger.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ",  flights=" + flights + "]";
	}

	

   
}

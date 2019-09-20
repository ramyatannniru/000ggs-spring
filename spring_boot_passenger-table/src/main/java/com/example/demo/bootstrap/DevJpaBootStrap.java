package com.example.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.Flight;
import com.example.demo.model.Passenger;
import com.example.demo.model.Reservation;
import com.example.demo.repositories.FlightRepositories;
import com.example.demo.repositories.PassengerRepository;
import com.example.demo.repositories.ReservationRepositories;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {
@Autowired
	public DevJpaBootStrap(PassengerRepository passengerRepository, FlightRepositories flightRepositories,
			ReservationRepositories reservationRepositories) {
		super();
		this.passengerRepository = passengerRepository;
		this.flightRepositories = flightRepositories;
		this.reservationRepositories = reservationRepositories;
	}

	private PassengerRepository passengerRepository;
	private FlightRepositories flightRepositories;
	private ReservationRepositories reservationRepositories;

	

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Reservation  reservation = new Reservation( null, null);
		reservation.setName("international");
		reservation.setAddress("12th Street, LA");
		reservationRepositories.save(reservation);
		// Eric
		Flight kingfisher = new Flight("kingfisher", "india","canada");
		Passenger sri = new Passenger("ramay","female","22");
		
        kingfisher.getPassenger().add(sri);
        sri.getFlights().add(kingfisher);
		
		flightRepositories.save(kingfisher);
		passengerRepository.save(sri);
		
		Reservation  reservation1 = new Reservation(  sri,kingfisher);
		reservation1.setName("international");
		reservation1.setAddress("12th Street, LA");
		kingfisher.getPassenger().add(sri);
        sri.getFlights().add(kingfisher);
		reservationRepositories.save(reservation1);
		
		Flight rs=new Flight("Airlines","usa","india");
		Passenger ram=new Passenger("saikumar","male","22");
		rs.getPassenger().add(ram);
		ram.getFlights().add(rs);
		flightRepositories.save(rs);
		passengerRepository.save(ram);
		Reservation  reservation2 = new Reservation(  ram,rs);
		reservation2.setName("international");
		reservation2.setAddress("12th Street, LA");
		rs.getPassenger().add(ram);
		ram.getFlights().add(rs);
		reservationRepositories.save(reservation2);

	}

}
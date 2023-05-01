package com.bits.ss.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_bookings")
public class Bookings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long bookingId;
	@Column(name = "flight_id")
	private long flightId;
	@Column(name = "price")
	private float price;

	
	public Bookings() {
		super();
	}

	public Bookings(long flightId, float price, List<Passenger> passengers) {
		super();
		this.flightId = flightId;
		this.price = price;
		this.passengers = passengers;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "tbl_bookings_passengers", joinColumns = {
			@JoinColumn(name = "booking_id") }, inverseJoinColumns = { @JoinColumn(name = "passenger_id") })
	private List<Passenger> passengers;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

}

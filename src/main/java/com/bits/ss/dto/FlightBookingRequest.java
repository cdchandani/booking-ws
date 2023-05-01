package com.bits.ss.dto;

import java.util.Arrays;

import com.bits.ss.model.Passenger;

public class FlightBookingRequest {

	private int flightId;
	private Passenger[] passengers;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "FlightBookingRequest [flightId=" + flightId + ", passengers=" + Arrays.toString(passengers) + "]";
	}

}

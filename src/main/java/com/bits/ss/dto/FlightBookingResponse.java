package com.bits.ss.dto;

import com.bits.ss.model.Bookings;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FlightBookingResponse {

	private Long bookingId;
	private Bookings bookingInfo;
	private FlightInfo flightInfo;

	public FlightBookingResponse(long bookingId) {
		super();
		this.bookingId = bookingId;
	}

	public FlightBookingResponse() {
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public Bookings getBookingInfo() {
		return bookingInfo;
	}

	public void setBookingInfo(Bookings bookingInfo) {
		this.bookingInfo = bookingInfo;
	}

	public FlightInfo getFlightInfo() {
		return flightInfo;
	}

	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
	}

}

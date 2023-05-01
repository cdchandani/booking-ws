package com.bits.ss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.ss.dto.FlightBookingRequest;
import com.bits.ss.dto.FlightBookingResponse;
import com.bits.ss.service.BookingService;


@RestController
public class BookingController {

	@Autowired
	private BookingService service;

	@PostMapping("/bookings")
	public FlightBookingResponse bookFlight(@RequestBody FlightBookingRequest request) {
		return service.bookFlight(request);
	}

	@GetMapping("/bookings/{id}")
	public FlightBookingResponse getFlightBooking(@PathVariable("id") Long bookingId) {
		return service.getFlightBooking(bookingId);
	}
}

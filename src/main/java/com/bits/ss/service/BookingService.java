package com.bits.ss.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bits.ss.dto.FlightBookingRequest;
import com.bits.ss.dto.FlightBookingResponse;
import com.bits.ss.dto.FlightInfo;
import com.bits.ss.model.Bookings;
import com.bits.ss.repo.BookingRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository repo;
	
	@Value("${flightservice.url}")
	private String flightServiceUrl;
	
	@Autowired
	private NotificationService notificationService;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	private ModelMapper mapper = new ModelMapper();

	public FlightBookingResponse bookFlight( FlightBookingRequest request) {
		Bookings booking = mapper.map(request, Bookings.class);
		Bookings bookingResponse = repo.save(booking);
		if (bookingResponse != null) {
			notificationService.notifyUser(request);
		}
		return new FlightBookingResponse(bookingResponse.getBookingId());
	}

	public FlightBookingResponse getFlightBooking(Long bookingId) {
		
		Bookings bookingInfo = repo.findBookingsByBookingId(bookingId);
		FlightInfo flightInfo = getFlightInfo(bookingInfo);
		FlightBookingResponse result = new FlightBookingResponse();
		result.setBookingInfo(bookingInfo);
		result.setFlightInfo(flightInfo);
		return result;
	}

	private FlightInfo getFlightInfo(Bookings bookingInfo) {
		long flightId = bookingInfo.getFlightId();
		System.out.println("Calling Flight-ws for flightId:" + flightId);
		String url = String.format(flightServiceUrl, flightId);
		FlightInfo flightInfo = restTemplate.getForObject(url, FlightInfo.class);
		return flightInfo;
	}
}

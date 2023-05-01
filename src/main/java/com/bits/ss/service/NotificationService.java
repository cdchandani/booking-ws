package com.bits.ss.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bits.ss.dto.FlightBookingRequest;
import com.bits.ss.dto.NotificationRequest;

@Service
public class NotificationService {
	
	@Value("${notificationservice.url}")
	private String notificationServiceUrl;
	
	private RestTemplate restTemplate = new RestTemplate();

	@Async
	public void notifyUser(FlightBookingRequest request) {
		System.out.println("Calling notification-ws for confirmed booking.");
		NotificationRequest notificationRequest = new NotificationRequest();
		notificationRequest.setEmailBody(request.toString());
		notificationRequest.setEmailSubject("Ticket Confirmed");
		notificationRequest.setFromEmail("reservation@gmail.com");
		notificationRequest.setPhoneMsgBody("Ticket generated for you");
		notificationRequest.setReceiverNumber("1234567890");
		notificationRequest.setToEmail("chanchal@gmail.com");
		restTemplate.postForEntity(notificationServiceUrl, notificationRequest, Object.class);
	}

}

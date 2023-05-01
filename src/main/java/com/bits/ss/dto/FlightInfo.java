package com.bits.ss.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FlightInfo {

	private long flightId;
	private String company;
	private String flightNumber;
	private String source;
	private String destination;
	private boolean nonStop;
	private String[] intermediateStops;

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public boolean isNonStop() {
		return nonStop;
	}

	public void setNonStop(boolean nonStop) {
		this.nonStop = nonStop;
	}

	public String[] getIntermediateStops() {
		return intermediateStops;
	}

	public void setIntermediateStops(String[] intermediateStops) {
		this.intermediateStops = intermediateStops;
	}

}

package com.flyhigh.model;

import java.io.Serializable;
// Marker interface
public class Flight  implements Serializable{
	private String flightCode;
// string datatype
private final String airlineName = "Singapore Airlines";

	// enum type
	private int seatingCapacity;
private FlightClassEnum flightClass;
	public Flight(String flightCode, int seatingCapacity, FlightClassEnum flightClass) {
		super();
		this.flightCode = flightCode;
		this.seatingCapacity = seatingCapacity;
		this.flightClass = flightClass;
	}

	public String getFlightCode() {
			return flightCode;
		}

	@Override
	public String toString() {
		return "Flight Code : " + flightCode + "\t Airlines Name : " + airlineName + "\t Seating Capacity : "
				+ seatingCapacity + "\t Flight Class=" + flightClass;
	}

}

package com.flyhigh.model;

public enum FlightClassEnum {
//	group of named constants
	ECONOMY("Economy Class"), BUSINESS("Business Class"), FIRST("First Class");

	private String flightClassDescription;

	private FlightClassEnum(String flightClassDescription) {
		this.flightClassDescription = flightClassDescription;
	}

	public String getFlightClassDescription() {
		return flightClassDescription;
	}

}

//public enum FlightClass {
////	group of named constants
//	ECONOMY,
//	BUSINESS,
//	FIRST
//}

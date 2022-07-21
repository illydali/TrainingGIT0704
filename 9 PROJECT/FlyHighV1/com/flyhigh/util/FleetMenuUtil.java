package com.flyhigh.util;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import com.flyhigh.model.Flight;
import com.flyhigh.repository.FlightDataStub;

public enum FleetMenuUtil {
//	constants with values
	DISPLAY_FLIGHTS("1. Display the Flight Details"), ADD_FLIGHT("2. Add a flight to fleet"),
	UPDATE_FLIGHT("3. Update flight details"), REMOVE_FLIGHT("4. Remove flight from fleet"),
	SEARCH_FLIGHT("5. Search for a flight");

	// instance variable
	private String menuOption;

	// constructor initializes instance variable
	FleetMenuUtil(String pMenuOption) {
		menuOption = pMenuOption;
	}

	public String getMenuOption() {
		return menuOption;
	}

	public static void displayFleetMenu() {
		for (FleetMenuUtil fleetMenuOption : values()) {
			System.err.println(fleetMenuOption.getMenuOption());
		}
	}

	public static void acceptFleetMenuChoice() {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		try {
			choice = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException numberFormatException) {
			System.err.println("Enter a valid option (1,2,3,4,5)");
		}

		switch (choice) {
		case 1:
			Map<String, Flight> flightDataMap = FlightDataStub.getFlightDataMap();
			Collection<Flight> flightsCollection = flightDataMap.values();
			for (Flight flight : flightsCollection) {
				System.err.println(flight);
			}
			break;
		default:
			System.err.println("Enter a valid option (1,2,3,4,5)");
			break;
		}
	}
}
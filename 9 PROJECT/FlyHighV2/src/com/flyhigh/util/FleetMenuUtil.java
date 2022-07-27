package com.flyhigh.util;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import com.flyhigh.exception.FlightNotFoundException;
import com.flyhigh.model.Flight;
import com.flyhigh.model.FlightClassEnum;
import com.flyhigh.repository.FlightDataFile;
//import static com.flyhigh.repository.FlightDataHashMapStub.*;
import  com.flyhigh.repository.FlightDataHashMapStub;

public enum FleetMenuUtil {
//	constants with values
	DISPLAY_FLIGHTS("1. Display the Flight Details"), ADD_FLIGHT("2. Add a flight to fleet"),
	UPDATE_FLIGHT("3. Update flight details"), REMOVE_FLIGHT("4. Remove flight from fleet"),
	SEARCH_FLIGHT("5. Search for a flight"), EXIT_APPLICATION("0. Exit Application");

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
		System.err.println("\n *********************");
		for (FleetMenuUtil fleetMenuOption : values()) {
			System.err.println(fleetMenuOption.getMenuOption());
		}
		System.err.println("---------------------\n");
	}

	public static void acceptFleetMenuChoice() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int choice = 0;
			displayFleetMenu();
	        System.err.print("Enter choice : ");
			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException numberFormatException) {
//				System.err.println("Enter a valid option (1,2,3,4,5)  " + numberFormatException);
				choice = -1;
			}

			switch (choice) {

			case 1:
				Map<String, Flight> flightDataMap = FlightDataHashMapStub.getFlightDataMap();
//			form collection
//			System.out.println("FROM Collection");
				Collection<Flight> flightsCollection = flightDataMap.values();

				for (Flight flight : flightsCollection) {
					System.out.println(flight);
				}
//			form file
//			System.out.println("FROM File");
//			Flight flight = FlightDataFile.fetchFlightData();
//			System.err.println(flight);
				break;
			case 2:
				Flight flightSGP = new Flight("SG-720", 310, FlightClassEnum.FIRST);
				FlightDataHashMapStub.saveFlightData(flightSGP);
				System.out.println("Flight Added to Fleet " + flightSGP);
//				FlightDataFile.saveFlightData(flightSGP);
				break;
			case 3:
				Flight updatedFlight = new Flight("SG-720", 308, FlightClassEnum.ECONOMY);
				FlightDataHashMapStub.saveFlightData(updatedFlight);
				System.out.println("Flight Updated to Fleet " + updatedFlight);
//				FlightDataFile.saveFlightData(flightSGP);
				break;
			case 5:
				String searchFlightCode = "SG-720";
				boolean flightFound = FlightDataHashMapStub.getFlightDataMap().containsKey(searchFlightCode);
				if(flightFound) {
					System.err.println("Found flight " + searchFlightCode);
				}
				else {
					System.err.println("Flight not found");
				}
				break;
			case 4: 
				System.out.println("Enter Flight Code to Remove : ");
				String flightCode = scanner.nextLine();
				int sizeBefore = FlightDataHashMapStub.getFlightDataMap().size();
				FlightDataHashMapStub.removeFlightFromFleet(flightCode);
				int sizeAfter = FlightDataHashMapStub.getFlightDataMap().size();
				if(sizeBefore > sizeAfter)
				System.out.println("Flight Removed from Fleet " + flightCode);
				else {
//					System.out.println("Flight Not Found " + flightCode);
					try {
					FlightNotFoundException flightNotFoundException = new FlightNotFoundException("Flight Not Found " + flightCode);
					throw flightNotFoundException;
					}
					catch (FlightNotFoundException fightNotFoundException) {
						System.err.println(fightNotFoundException.getMessage());
						throw fightNotFoundException;
					}
				}
				break;
			case 0:
				System.out.println("Thank you....");
				System.exit(0);
				break;
			default:
				System.err.println("Enter a valid option (1,2,3,4,5)");
				break;
			}
		}
	}
}
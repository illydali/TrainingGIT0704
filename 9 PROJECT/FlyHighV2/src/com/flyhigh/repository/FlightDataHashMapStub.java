package com.flyhigh.repository;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.flyhigh.model.Flight;
import com.flyhigh.model.FlightClassEnum;

public class FlightDataHashMapStub {
	final static Map<String, Flight> flightDataMap = new HashMap<String, Flight>();

	public static void loadSampleFlightData() {
		Flight flightSGP = new Flight("SQ-525", 210, FlightClassEnum.ECONOMY);
		Flight flightCAN = new Flight("CAN-525", 210, FlightClassEnum.BUSINESS);
		flightDataMap.put(flightSGP.getFlightCode(), flightSGP);
		flightDataMap.put(flightCAN.getFlightCode(), flightCAN);
	}

	public static Map<String, Flight> getFlightDataMap() {
//		loadSampleFlightData();
		return flightDataMap;
	}

	public static void saveFlightData(Flight flightData) {
		flightDataMap.put(flightData.getFlightCode(), flightData);
	}

	public static void removeFlightFromFleet(String flightCode) {
		flightDataMap.remove(flightCode);
	}
}

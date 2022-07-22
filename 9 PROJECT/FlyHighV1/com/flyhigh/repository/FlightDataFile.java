package com.flyhigh.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flyhigh.model.Flight;

public class FlightDataFile {
	public static void saveFlightData(Flight flightData) {
		// flights.dat / binary format
		try {
			// stream to write to file
			FileOutputStream fileOutputStream = new FileOutputStream("flights.dat");
			// object stream
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			// write the object
			objectOutputStream.writeObject(flightData);
			// close the stream
			objectOutputStream.close();
			System.err.println("Successfully written Flight Data to File.");
//			checked exception / compiler forces dev to handle exception
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Please check file availability " + fileNotFoundException);
		} catch (IOException ioException) {
			System.err.println("Error writing to File" + ioException);
		}

	}

	public static Flight fetchFlightData() {
		try {
			// flights.dat / binary format
			// stream to read to file
			FileInputStream fileInputStream = new FileInputStream("flights.dat");
			// object stream
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream );
			// write the object
			Object flightObject;
			flightObject = objectInputStream.readObject();
			Flight flight = (Flight) flightObject;
			// close the stream
			objectInputStream.close();
			System.err.println("Successfully read Flight Data from File.");
			return flight;
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Error reading from file " + classNotFoundException);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

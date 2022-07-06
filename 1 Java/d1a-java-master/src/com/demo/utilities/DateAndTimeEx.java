package com.demo.utilities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTimeEx {
	public static void main(String[] args) {
		// dateAndTime();
//scanLegacyDate();
		scanDate();
	}

	private static void scanDate() {

		try (Scanner scanner = new Scanner(System.in)) {
			String stringFromDate = scanner.nextLine();
			// 07/06/2022
//			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			LocalDate fromDate = LocalDate.parse(stringFromDate,dateTimeFormatter);
//			System.err.println(fromDate);

			// 2022-Jul-06
			DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
			LocalDate fromDate1 = LocalDate.parse(stringFromDate, dateTimeFormatter1);
			System.err.println(fromDate1);
		} catch (Exception e) {
			System.err.println("Error scanning ...." + e);
		}
	}

	private static void scanLegacyDate() {

		try (Scanner scanner = new Scanner(System.in)) {
			String stringFromDate = scanner.nextLine();
			// 6/7/2022
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fromDate = simpleDateFormat.parse(stringFromDate);
			System.err.println(fromDate);
		} catch (Exception e) {
			System.err.println("Error scanning ....");
		}
	}

	private static void dateAndTime() {
		// date (yyyy/mm/dd)
		LocalDate today = LocalDate.now();
		System.err.println(today);
		// Time
		LocalTime time = LocalTime.now();
		System.err.println(time);

		// Date and time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.err.println(localDateTime);

		// Format date and time
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDateAndTime = dateTimeFormatter.format(localDateTime);
		System.err.println(formattedDateAndTime);

		// shorthand
		System.err.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now()));
	}
}

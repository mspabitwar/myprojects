package com.collection12.complex.datatype;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDatatypeTest {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { 
			{ "Fred", "Sue", "Pete" },
			{ "Sue", "Bob", "Fred", "Richard" },
			{ "Pete", "Mery", "Bob" }
	};

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<>();

		for (int i = 0; i < vehicles.length; i++) {

			String vehicle = vehicles[i];

			Set<String> vehicleDrivers = new LinkedHashSet<>();
			String[] driversArr = drivers[i];
			for (String driver : driversArr) {
				vehicleDrivers.add(driver);
			}
			personnel.put(vehicle, vehicleDrivers);
		}

		// Example usage
		Set<String> vehicleDrivers = personnel.get("helicopter");
		for (String driver : vehicleDrivers) {
			System.out.println(driver);
		}
		System.out.println("----------------");

		// Iterate through whole thing
		for (String vehicle : personnel.keySet()) {
			System.out.print(vehicle + " : ");
			Set<String> drivers = personnel.get(vehicle);
			for (String driver : drivers) {
				System.out.print(driver + " ");
			}
			System.out.println();
		}
	}
}
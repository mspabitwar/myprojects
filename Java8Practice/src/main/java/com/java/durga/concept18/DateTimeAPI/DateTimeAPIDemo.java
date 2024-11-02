package com.java.durga.concept18.DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPIDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.println(day + "/" + month + "/" + year);
		System.out.printf("%d-%d-%d\n", day, month, year);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nano = time.getNano();
		System.out.println(hour + "/" + minute + "/" + second + "/" + nano);
		System.out.printf("%d-%d-%d-%d\n", hour, minute, second, nano);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		day = dateTime.getDayOfMonth();
		month = dateTime.getMonthValue();
		year = dateTime.getYear();
		hour = dateTime.getHour();
		minute = dateTime.getMinute();
		second = dateTime.getSecond();
		nano = dateTime.getNano();
		System.out.printf("%d-%d-%dT%d-%d-%d-%d\n", day, month, year, hour, minute, second, nano);
		
		LocalDateTime May28dateTime = LocalDateTime.of(1995, Month.MAY, 28, 12, 45);
		System.out.println(May28dateTime);
		System.out.println("Date 6 month after 28th May: " + May28dateTime.plusMonths(6));
		System.out.println("Date 6 month before 28th May: " + May28dateTime.minusMonths(6));
		
		LocalDate birthDate = LocalDate.of(2000, Month.JUNE, 07);
		LocalDate todaysDate = LocalDate.now();
		Period age = Period.between(birthDate, todaysDate);
		System.out.printf("Age is %d years %d months & %d days\n", age.getYears(), age.getMonths(), age.getDays());
		
		Year yyyy = Year.of(2000);
		System.out.println("2000 is " + (yyyy.isLeap()? "leap year" : "not leap year"));
		yyyy = Year.of(2001);
		System.out.println("2001 is " + (yyyy.isLeap()? "leap year" : "not leap year"));
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("Current zone is " + zone);
		
		ZoneId laZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime defaultZoneDateTime = ZonedDateTime.now();
		ZonedDateTime laZoneDateTime = ZonedDateTime.now(laZone);
		
		System.out.println("Default zone date time is " + defaultZoneDateTime);
		System.out.println("LA zone date time is " + laZoneDateTime);
	}
}
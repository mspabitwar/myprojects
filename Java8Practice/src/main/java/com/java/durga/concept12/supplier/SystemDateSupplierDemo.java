package com.java.durga.concept12.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SystemDateSupplierDemo {

	public static void main(String[] args) {

		Supplier<Date> dateSupplier = () -> new Date();

		System.out.println(dateSupplier.get());
		System.out.println(dateSupplier.get());
		System.out.println(dateSupplier.get());

	}
}
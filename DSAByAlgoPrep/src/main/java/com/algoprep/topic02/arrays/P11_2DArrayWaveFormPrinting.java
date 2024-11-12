package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P11_2DArrayWaveFormPrinting {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number of rows for 2D array");
			int rows = scanner.nextInt();
			System.out.println("Enter number of columns for 2D array");
			int columns = scanner.nextInt();

			int[][] numbers = new int[rows][columns];

			System.out.println("Enter elements of 2D array");
			for (int row = 0; row < rows; row++) {
				for (int column = 0; column < columns; column++) {
					numbers[row][column] = scanner.nextInt();
				}
			}

			System.out.println("Printing 2D array rowwise");
			for (int row = 0; row < rows; row++) {
				if(row % 2 == 0) {
					for (int column = 0; column < columns; column++) {
						System.out.print(numbers[row][column] + " ");
					}
				} else {
					for (int column = columns - 1; column >= 0 ; column--) {
						System.out.print(numbers[row][column] + " ");
					}
				}
				System.out.println();
			}

		}
	}
}
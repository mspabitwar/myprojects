package com.datastructure.arrays.rotation;

class RotateArrayUsingReversalAlgo {
	
	/* Driver program to test above functions */
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;

		leftRotate(arr, d); // Rotate array by d
		printArray(arr);
	}
	
	/* Function to left rotate arr[] of size n by d */
	static void leftRotate(int arr[], int d) {

		int n = arr.length;
		
		if (d % n == 0){
			System.out.println("No need to shift since number of shifting required is multiple of array size");
			return;
		}
		
		//in case the rotating factor is greater than array length
		if( d > n) {
			d = d % n;
			System.out.println("Here d is greater than n so using rotation with new d = " + d);
		}
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);
	}

	/* Function to reverse arr[] from index start to end */
	static void reverseArray(int arr[], int start, int end) {
		
		while (start < end) {	
			
			arr[start] = arr[start] + arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
			
			start++;
			end--;
		}
	}

	/* utility function to print an array */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
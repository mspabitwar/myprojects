package com.datastructure.arrays.rotation;

public class RotateArrayUsingTempArray {

	public static void main(String[] args) {
		
		RotateArrayUsingTempArray rotate = new RotateArrayUsingTempArray(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        rotate.leftRotate(arr, 8, 7); 
        rotate.printArray(arr, 7);
	}

	/*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) 
    { 
    	if(d == n || d%n == 0) {
    		System.out.println("No need to shift");
    	} else if(d > n) {
    		d = d%n;
    		System.out.println("Here d is greater than n so using recursion with new d = " + d);
    		leftRotate(arr, d, n);
    	} else {
    		//Actaul logic
    		System.out.println("Actual Logic with d = " + d);
    		int i;
    		int temp[] = new int[d];
    		for(i = 0; i < d; i++) {
    			temp[i] = arr[i];
    		}
    		
    		for(i = 0; i < (n - d); i++){
    			arr[i] = arr[i +d];
    		}
    		
    		for(int j = 0; i < n; i++,j++){
    			arr[i] = temp[j];
    		}
    	} 
    } 
  
    /* utility function to print an array */
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
}

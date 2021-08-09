package com.techment.assignment;

public class ProductsMax {
	public static void main(String[] args) {
		int[] arr = new int[] {56,75,80,40,78};
		int max = arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The largest product Quantity is : " +max);
	}
}

package com.techment.assignment;

import java.util.Scanner;

public class ProductsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int products[];
		System.out.print("Enter the number of products you want to enter in the store :-");
		int number = sc.nextInt();
		products = new int[number];
		for(int i = 0 ; i< products.length; i++) {
			System.out.print("Enter the "  +(i+1)+ " first products value : ");	
			products[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<products.length ; i++)
		{
			sum += products[i];
		}
		System.out.println("The total value of products will be :-" +sum);
	}
}

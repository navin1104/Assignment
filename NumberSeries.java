package com.techment.assignment;

import java.util.Scanner;

public class NumberSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			int s=i*i*i;
			System.out.print(s+ " ");
		}
			
		
	}
}	
package com.techment.assignment;

import java.util.Scanner;

public class DivisibleBy8and3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is divisible by 8 and 3 both : ");
		int n = sc.nextInt();
		if(n%8==0 && n%3==0)
			System.out.println(n+ " Divisible by 8 and 3 both");
		else if(n%8==0)
			System.out.println(n+ " is Divisible by 8 but not 3");
		else if(n%3==0)
			System.out.println(n+ " is Divisible by 3 but not 8");
		else
			System.out.println(n+ " is not Divisible by 8 & 3 both");
				
	}
}

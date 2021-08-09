package com.techment.assignment;

import java.util.Scanner;

public class BestHorse {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the horse number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a==b)
			System.out.println("Entered weights of a and b are not distinct values");
		else if(b==c)
			System.out.println("Entered weights of a and b are not distinct values");
		else if(a==c)
			System.out.println("Entered weights of a and b are not distinct values");
		else if(a>b && a>c)
			System.out.println("a has maximum weight");
		else if(b>a && b>c)
			System.out.println("b has maximum weight");
		else
			System.out.println("c has maximum weight");
	}
}

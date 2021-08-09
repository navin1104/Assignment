package com.techment.assignment;

import java.util.Scanner;

public class GlassHouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number : ");
		int num = sc.nextInt();
		int digit,sum=0;
		while(num>0)
		{
			digit = num%10;
			num = num/10;
			sum = sum+digit;
			
		}
		System.out.println("Exit door number of the glasshouse is : " +sum);
	}

}

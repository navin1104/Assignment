package com.techment.assignment;

import java.util.Scanner;

public class Primenumbers {
	public static void main(String[] args) {
		int i, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num  ");
		int num = sc.nextInt();
	   
		if(num==0|| num==1) {
	    System.out.print(num+"not prime no");
		}
		else
		{
			for (i=2;i<=num/2;i++) {
				if(num%i==0) {
					   System.out.print(num+": not a prime no");
					
					   flag = 1;
					   break;
				}
			}
			if (flag==0){  System.out.print(num+" is prime no");}
		}
	 
	}


		
}



package com.techment.assignment;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of the month :-");
		int day = sc.nextInt();
		if(day>=1 && day<=31) {
			for(int i =1 ; i<=31 ; i++) {
				if(day%2==0) {
					System.out.println("Cars with even registration numbers are permitted today");
					break;
				}
				else
				{
					System.out.println("Cars with odd registration numbers are permitted today");
				}
			}
			
		}
		else {
			System.out.println("Wrong Input");
		}
	}

}

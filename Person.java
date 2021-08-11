package com.techment.test.day8;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int n = sc.nextInt();
		int age[] = new int[n];
		for(int i = 0 ; i<age.length ; i++)
		{
			System.out.print("Ente the " +(i+1)+ " person age : " );
			age[i] = sc.nextInt();
			System.out.println();
		}
		for(int i = 0 ; i<age.length ; i++) 
		{
			if(age[i]<18)
				System.out.println((age[i])+ " age is in children category");
			else if(age[i]>=18 || age[i]<=54)
				System.out.println((age[i])+ " age is in adult category");
			else if(age[i]>=55)
				System.out.println((age[i])+ " age is in senior citizen category");
		}

	}

}

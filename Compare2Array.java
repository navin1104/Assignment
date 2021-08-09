package com.techment.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Compare2Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Size of Array : ");
		int n1 = sc.nextInt();
		int a1[] = new int[n1];
		
		for(int i = 0 ; i<a1.length; i++)
		{
			System.out.print("Enter the " +(i+1)+ " element : ");
			a1[i] = sc.nextInt();
		}
		System.out.print("Enter the second Size of Array : ");
		int n2 = sc.nextInt();
		int a2[] = new int[n2];	
		for(int i = 0 ; i<a2.length; i++)
		{
			System.out.print("Enter the " +(i+1)+ " element : ");
			a2[i] = sc.nextInt();
		}
		if (Arrays.equals(a1, a2))   
			System.out.println("Arrays are equal.");   
			else  
			System.out.println("Arrays are not equal."); 
	}

}

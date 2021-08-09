package com.techment.assignment;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number = ");
		int n = sc.nextInt();
		int cal=0;
		for(int i=1;i<=10;i++){
			cal = n*i;
			System.out.println(n + "x" + i + " = "  + cal);
		}
	}	
}

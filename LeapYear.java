package com.techment.assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
 	    Scanner sc=new Scanner(System.in);
 	    System.out.print("enter  any   year : ");
        year=sc.nextInt();	     
        if((year%400==0)||(year%4==0 && year%100!=0))
        {
    	   System.out.println( year+ " is a Leap Year");	 
        }
        else
        	System.out.println("Not a leap year");

	}

}

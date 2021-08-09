package com.techment.assignment;

import java.util.Scanner;

public class BirthdayMonth {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the birthday's month as number : ");
		int num = sc.nextInt();
		switch(num) {
		case 1:  System.out.println("Your birthday's month corresponding to the number will be January"); break;
        case 2:  System.out.println("Your birthday's month corresponding to the number will be February"); break;
        case 3:  System.out.println("Your birthday's month corresponding to the number will be March"); break;
        case 4:  System.out.println("Your birthday's month corresponding to the number will be April"); break;
        case 5:  System.out.println("Your birthday's month corresponding to the number will be May"); break;
        case 6:  System.out.println("Your birthday's month corresponding to the number will be June"); break;
        case 7:  System.out.println("Your birthday's month corresponding to the number will be July"); break;
        case 8:  System.out.println("Your birthday's month corresponding to the number will be August"); break;
        case 9:  System.out.println("Your birthday's month corresponding to the number will be September"); break;
        case 10: System.out.println("Your birthday's month corresponding to the number will be October"); break;
        case 11: System.out.println("Your birthday's month corresponding to the number will be November"); break;
        case 12: System.out.println("Your birthday's month corresponding to the number will be December"); break;
        default: System.out.println("Your birthday's month corresponding to the number will be Not a month!"); break;
		}
		

	}

}

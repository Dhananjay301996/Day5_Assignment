package day5_Assignment;

import java.util.*;

public class leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;		 
       
		System.out.println("Enter an Year :: ");
       
		Scanner sc = new Scanner(System.in);
       
		year = sc.nextInt();

        if (year % 4 == 0)
            System.out.println("This year is a leap year");
        else
            System.out.println("This year is not a leap year");
		
		


		        

	}

}

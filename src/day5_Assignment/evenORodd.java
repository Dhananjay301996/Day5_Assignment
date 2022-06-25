package day5_Assignment;

import java.util.*;

public class evenORodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a number : " );
		
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0)
            System.out.println("number is even");
        
        else
            System.out.println("number is odd");

	}

}

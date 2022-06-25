package day5_Assignment;

import java.util.*;

public class quatientANDremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter dividend : " );
		
        Scanner sc = new Scanner(System.in);
        
        int dividend = sc.nextInt();
        
        System.out.print("Enter divisor : ");
        
        int divisor = sc.nextInt();

        System.out.println("Quotient is : " + dividend/divisor );
        System.out.println("Remainder is : " + dividend%divisor );
		
		
		  

	}

}

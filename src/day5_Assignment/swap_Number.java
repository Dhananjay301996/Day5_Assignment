package day5_Assignment;

import java.util.*;

public class swap_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter first number : " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.println("Now a :"+a );
        System.out.println("Now b :"+b );

	}

}

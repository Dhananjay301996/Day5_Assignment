package day5_Assignment;

import java.util.*;

public class vowelAndconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Enter the Character :-");
	        char ch;
	        Scanner character = new Scanner(System.in);
	        
	        ch = character.next().charAt(0);

	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            System.out.println(ch + " is vowel");
	        } else
	            System.out.println(ch + " is consonant");

	}

}

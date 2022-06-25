package day5_Assignment;
import java.util.Random;

public class flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Random flip = new Random();

	        int tail = 1;
	        int head = 0;
	        int i= 0;
	        
	        while (i < 10) {
	        	
	            int check = flip.nextInt(2);

	            if (check == 1)
	                tail++;
	            else
	                head++;
	            i++;
	        }
	        
	        System.out.println("Head = " + head);
	        System.out.println("Tail = " + tail);

	        float tailPercentage = ((float) tail / 10 * 100);
	        float headPercentage = ((float) head / 10 * 100);

	        System.out.println("percentage of head is = " + headPercentage);
	        System.out.println("percentage of tail is = " + tailPercentage);

	}

}

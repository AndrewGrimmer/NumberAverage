package numberSaver;

import java.util.Arrays;
import java.util.Scanner; 

public class NumberSaver {

	
	public static void main(String[] args) {
		
		String response;
		int high;
		int low;
		int userInput, sum = 0;
		float average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many Tests are you Inputing?: ");
		userInput = input.nextInt();
		int array[] = new int[userInput];
		Arrays.sort(array);
		
		System.out.println("Enter the Test Scores Here (As a Percentage)!: ");
		
		for(int i=0;i<userInput;i++) {
			array[i]=input.nextInt();
			sum = sum + array[i];
		}
		
		average = (float)sum / userInput;
		high = array[array.length-1];
		low = array[0];
	
		System.out.print("What do you want to know about the scores (high/low/average)? ");
		response = input.next();
		
			if (response.equals("average")) {
				
				System.out.print("Your aveveage test score is: " + average + "%!");
			
			} else if (response.equals("high")){
				
				System.out.print("Your high score is: " + high + "%!");
			
			
			} else if (response.equals("low")) {
			
				System.out.print("Your low score is  " + low + "% :(");
			}
			
			else {
			
				System.out.print("Invalid Input!");
			}
		
		
	}

}
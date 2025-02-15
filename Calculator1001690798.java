import java.util.Scanner;
import java.lang.System;
import java.util.Arrays;

public class Calculator1001690798{
	static String[] VALID_OPERATIONS = {"+", "-","*","/"};
	public static void main(String[] args){
		String selection;
		float num1, num2;
		Scanner input = new Scanner(System.in);
		//Get the users calculation choice and the two numbers they will use on the calculation
		while (true){
			System.out.println("Please pick the operation you would like to perform(+ - * /) or q to quit");
			//if the user inputs a bad valid like a string simply tell them to pick a new set of numbers and go back to the start of the selection process
			try{
				selection = input.nextLine();
				if(selection.contains("q")){
					System.exit(0);
				}
				else if(Arrays.asList(VALID_OPERATIONS).contains(selection) == false){
					System.out.println("Please pick a valid operation");	
					continue;
				}
				System.out.println("Please pick two numbers you would like to perform this on");
				num1 = input.nextFloat();
				num2 = input.nextFloat();
				input.nextLine();
			}
			catch(Exception e){
				System.out.println("\nPlease enter only numbers\n");
				input.nextLine();
				continue;
			}
			switch(selection){
				case "+":
					addition(num1, num2);
					break;
				case "-":
					subtraction(num1, num2);
					break;
				case "*":
					multiplication(num1, num2);
					break;
				case "/":
					division(num1, num2);
					break;
			}
		}
	}
	//Encapsulated functions for performing the selected calculation
	private static void addition(float a, float b){
		System.out.printf("%.1f \n", a + b);
	}

	private static void subtraction(float a, float b){
		System.out.printf("%.1f \n", a - b);
	}

	private static void multiplication(float a, float b){
		System.out.printf("%.1f \n", a * b);
	}

	private static void division(float a, float b){
		if(b == 0){
			System.out.println("Please don't divide by zero\n");
			return;
		}	
			System.out.printf("%.1f \n", a / b);
	}
}

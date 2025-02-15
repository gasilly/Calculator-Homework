import java.util.Scanner;
import java.lang.System;

public class Calculator1001690798{
	public static void main(String[] args){
		int selection = 0;
		float num1, num2;
		Scanner input = new Scanner(System.in);
		//Get the users calculation choice and the two numbers they will use on the calculation
		while (selection != 5){
			System.out.println("Please pick the operation you would like to perform on the calculator fromm the selection below");
			System.out.println("1: addition");
			System.out.println("2: subtraction");
			System.out.println("3: multiplication");
			System.out.println("4: division");
			System.out.println("5: exit calculator");
			//if the user inputs a bad valid like a string simply tell them to pick a new set of numbers and go back to the start of the selection process
			try{
				selection = input.nextInt();
				if(selection == 5){
					System.exit(0);
				}
				System.out.println("Please pick two numbers you would like to perform this on");
				num1 = input.nextFloat();
				num2 = input.nextFloat();
			}
			catch(Exception e){
				System.out.println("\nPlease enter only numbers\n");
				input.nextLine();
				continue;
			}
			switch(selection){
				case 1:
					addition(num1, num2);
					break;
				case 2:
					subtraction(num1, num2);
					break;
				case 3:
					multiplication(num1, num2);
					break;
				case 4:
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

#include <stdio.h>
#include <stdbool.h>

void addition(float a,float b);
void subtraction(float a,float b);
void multiplication(float a,float b);
void division(float a,float b);

//functions to perform arthmitic
void addition(float a, float b){
	printf("%.2f\n", a + b);
}

void subtraction(float a, float b){
	printf("%.2f\n", a - b);
}

void multiplication(float a, float b){
	printf("%.2f\n", a * b);
}

void division(float a,float b){
	if(b != 0){
		printf("%.2f\n", a / b);
	}
	else{
		printf("Please dont divide by zero!");
	}
}

int main(){
	int checkValid;
	char selection;
	float num1, num2;
	while (true) {
		printf("Please pick the operation you would like to perform(+ - * /) or q to quit\n");
		//Check how many arguments have been received by the console. Should be one
                checkValid = scanf("%c", &selection);
                if(checkValid != 1){
                        while ((getchar()) != '\n');
                        printf("Please pick a valid operator!\n");
                        continue;
                }
		if(selection == 'q'){
			break;
		}
		//Get two numbers from the console and perform the arthmitic selected
		printf("Please enter two numbers to perform an operation on\n");
		checkValid = scanf("%f %f", &num1, &num2);
		if(checkValid != 2){
			while ((getchar()) != '\n');
			printf("Please pick valid numbers\n");
			continue;
		}
		switch (selection){
			case '+':
				addition(num1, num2);
				break;
			case '-':
				subtraction(num1, num2);
				break;
			case '*':
				multiplication(num1, num2);
				break;
			case '/':
				division(num1, num2);
				break;
		}
		while((getchar()) != '\n');
	}
	return 0;
}

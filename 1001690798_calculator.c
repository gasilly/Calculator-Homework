#include <stdio.h>

void addition(float a,float b);
void subtraction(float a,float b);
void multiplication(float a,float b);
void division(float a,float b);

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
	int selection;
	float num1, num2;
	while (selection != 5) {
		printf("Please enter two numbers to perform an operation on\n");
		checkValid = scanf("%f %f", &num1, &num2);
		if(checkValid != 2){
			while ((getchar()) != '\n');
			printf("Invalid Operation!\n");
			continue;
		}
		printf("Please pick the operation youd like to perform on the calculator from the selection below\n");
		printf("1: addition \n");
		printf("2: subtraction \n");
		printf("3: multiplication \n");
		printf("4: division \n");
		printf("5: exit calculator\n");
		checkValid = scanf("%d", &selection);
		if(checkValid != 1){
			while ((getchar()) != '\n');
			printf("Invalid Operation!\n");
			continue;
		}
		if(selection == 5){
			break;
		}
		printf("you selected: %d\n", selection);
		switch (selection){
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
			default:
				printf("Invalid Operation!\n");
				break;
		}
	}
	return 0;
}

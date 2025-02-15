import sys

VALID_OPERATIONS = ["+","-","*","/"]
def main():
    while True:
        #Get the users choice of calculation
        print("Please pick the operation you would like to perform(+ - * /) or q to quit");
        try:
            selection = str(input())
            if(selection == "q"):
                sys.exit()
            #Check that the user has selected a valid operation from the list
            elif(any(selection in operation for operation in VALID_OPERATIONS) == False):
                print("\nPlease pick a valid operation\n")
                continue
            #Get the values of the numbers the user would like to perform the calculation on
            print("Please enter two numbers you would like to perform this operation on")
            num1 = float(input())
            num2 = float(input())
        #Raise an exception if the user trys to enter a value that isnt a number like a string
        except Exception as e:
            print("Please enter only numbers\n")
            continue
        if (selection == "+"):
            addition(num1, num2)
        elif (selection == "-"):
            subtraction(num1, num2)
        elif (selection == "*"):
            multiplication(num1, num2)
        elif (selection == "/"):
            division(num1, num2)

#Functions to perform the users desired calculation
def addition(num1, num2):
    print("%.1f\n" %(num1 + num2))

def subtraction(num1, num2):
    print("%.1f\n" %(num1 - num2))

def multiplication(num1, num2):
    print("%.1f\n" %(num1 * num2))

def division(num1, num2):
    #Check that the user isnt trying to divide by zero
    if(num2 == 0):
        print("Please dont divide by zero\n")
        return
    print("%.1f\n" %(num1 / num2))

if __name__ == '__main__':
    main()

/*
Description: Check if numbe entered is a prime or not in C.
Author: Jonathan Riordan

*/
#include <stdio.h>

int main()
{
	int number;
	int check = 0;
	printf("Enter in a number to check if it is prime \n");
	scanf("%d",&number);
	
	if(number < 2) {
		check = 0;
	}
	
	for(int i = 2; i < number; i ++) {
		if(number % i == 0) {
			check = 0;
			break;
		} else if(number % i == 1) {
			check = 1;
			break;
		}
	}
	
	if(check == 1) {
		printf("Number %d is prime number",number);
	}
	
	if(check == 0) {
		printf("Number %d is not a prime number", number);
	}

}// end main


/*
Description: Program to calculate the gcd of two numbers entered in by the user
Author: Jonathan Riordan
Date: 11/ 2/2016
*/
#include <stdio.h>

int main()
{
	int a;
	int b;
	int c;
	
	printf("Calculate the GCD of two numbers.\n");
	printf("Enter in first number.\n");
	scanf("%d",&a);
	
	printf("Enter in second number.\n");
	scanf("%d",&b);
	
	for (int i = 1; i <= a || i <= b; i ++) {
		if(a % i == 0 && b % i == 0) {
			c = i;
		}
	}
	
	printf("The GCD of %d and %d is: %d", a, b, c);
	

}// end main
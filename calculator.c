#include <stdio.h>
#include <math.h>
// Navn: Hijab Nasir    Email: Hijab21@yahoo.com     gruppe: 002   studieretning: software
//Har fået hjælp fra Oskar Kibsgaard Schobel angårende pointers.


double run_calculator();
void scan_data(char *op, double *oppe);
double do_next_op(char op, double result,double oppe);
double add(double result, double oppe);
double add(double result, double oppe);
double sub(double result, double oppe);
double mult(double result, double oppe);
double div(double result, double oppe);


int main()
{
	run_calculator();
	return 0;
}


double run_calculator() 
{
		double result = 0.0; 
		char op; 
		double oppe; 

		// akkumulator, holder styr på alle udregner, glemmer alle talværdier ind. F.eks 5+5 = 10, så dem glemmer 10. double result. 
		// opperand, double oppe
		// operator, er + - % osv char op

	printf("Result so far is: %lf", result);
	printf("\n");

	do
	{
		printf("Enter Operator and optional operand [+ - * / ^ # % !] OR q for exit\n");

		scan_data(&op, &oppe);
		// kalder på funktionen, og opperand og operator, ligesom scanf.

		result = do_next_op(op, oppe, result); 
		printf("resultatet er: %lf\n", result);
	
	} while (op != 'q' || op != 'Q'); //for at stoppe loekken, indsat "q"
}

void scan_data(char *op, double *oppe)   // void, fordi den returner ingen ting. 
{	
		scanf(" %c", op);
	
		if (*op != '!' &&*op != '#' &&*op != '%' && (*op != 'q' ||*op != 'Q')) {
			scanf("%lf",oppe);
		
	}
		
}

double do_next_op(char op, double result,double oppe)
{
	
		switch (op)
	{
		case '+':
			result = add(result, oppe);	
			break;

		case '-':
			result = sub(result, oppe);
			break;

		case '*':
			result = mult(result, oppe);
			break;

		case '/':
			if(oppe!=0.0)
			{
			result = div(result, oppe);
			}
			break;

		case '^':
			result = pow(result, oppe);
		    break;

		case '#':
			if (result > 0.0)
			{ 
				result = sqrt(result);
			}
				break;

		case'%':
			result = -result;
			break;

		case'!':
			if (result != 0) 
			{
				result = div(1, result);
			}
				break;


		default:
			break;
	}

		return result; 
			
}

//udregner i form af funktionen. 
//Function to add two numbers
double add(double result, double oppe)
{
	return result + oppe;
}

//Function to subtract two numbers
double sub(double result, double oppe)
{
	return result - oppe;
}

//Function to multiply two numbers
double mult(double result, double oppe)
{
	return result * oppe;
}

//Function to divide two numbers
double div(double result, double oppe)
{
	return result / oppe;
}

	
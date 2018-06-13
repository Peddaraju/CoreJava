package com.lara;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first operand : ");
		int operand1 = sc.nextInt();
		System.out.print("enter the second number : ");
		int operand2 = sc.nextInt(), result = 0;
		System.out.print("enter the operator(+,-,*,/) : ");
		String  operator1 = sc.next();
		char operator = operator1.charAt(0);
	    switch (operator) 
	    {
	    	case '+': result = operand1 + operand2;
	    		break;
	        case '-': result = operand1 - operand2;
	        	break;
	        case '*': result = operand1 * operand2; 
	        	break;
	        case '/': result = operand1 / operand2;
	        	break;
	        default: assert false : "Unknown operator: " + operator;  
	    }
	    System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
	}		
}


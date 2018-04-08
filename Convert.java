/*

 Name: Convert

 Description: Program that converts from Fahrenheit to Celsius and vice versa

 Created by: Alice Winteler

 Created on: 31/03/2018

**/

import java.util.Scanner;

public class Convert{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		int celsius = 0;
		int fahrenheit = 0;
		int choice;

		Convert c = new Convert();
		boolean loop = true;//using boolean operators as condition for while loop

		while(loop){

		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("3. Exit");

		System.out.print("Choice: ");
			choice = input.nextInt();

		if(choice==3)
			loop = false;

		switch(choice){
		case 1:
		System.out.print("Enter temperature: ");
			fahrenheit = input.nextInt();
		System.out.println(fahrenheit+" Fahrenheit is " + c.celsius(celsius, fahrenheit ) + " Celsius");
		System.out.println();
		break;
		case 2:
		System.out.print("Enter temperature: ");
			celsius = input.nextInt();
		System.out.println(celsius+" Celsius is " + c.fahrenheit(celsius, fahrenheit ) + " Fahrenheit");
		System.out.println();
		break;
		case 3:
		break;
		default:
		System.out.println("Input not valid.");
		}//end of switch
	}//end of while

Index.main(null);

}//end of main method

	public int  celsius(int celsius, int fahrenheit){//opening celsius method to convert fahrenheit to celsius
		celsius = (int) (5.0/9.0 *(fahrenheit - 32)); //calculating celcius and castiung double to int
		return celsius;
	} //end of celsius method

	public int fahrenheit(int celsius, int fahrenheit){//opening celsius method to convert celsius to fahrenheit
		fahrenheit = (int) (9.0/5.0*celsius+32); //calculating celcius and castiung double to int
		return fahrenheit;
	}//end of fahrenheit method

}//end of class
/*

Name: Break_Ex3

Description: Program which pompts the user to enter any amount of numbers from 1 to 10, if number entered matches 8 the program ends.

Created by: Alice Winteler

Created on: 20/2/2018

*/

import java.util.Scanner;

public class Break_Ex3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int counter = 0;

		System.out.println("See if you can guess the correct number.");
		System.out.println("Guess a number from 1 to 10.");
		System.out.println("You have  10 attempts.");
		System.out.println("Enter numbers (1 to 10 only): ");

		while(input.hasNext()){
			counter++;
			if(input.nextInt()==8||counter == 10){
				System.out.println("Game Over.");
				break;
			}

		}

	}

}

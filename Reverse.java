/*
Name: Reverse

Description: takes interger value and returns it in reverse

Created by: Alice Winteler

Created on: 20/03/18
*/

import java.util.Scanner;

	public class Reverse{//static allows the call of a method
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);


		System.out.println("Enter an integer <-1 to exit>: ");
		int	number = input.nextInt();


		while(number != -1){
			System.out.println(number+" reversed is "+reverseDigits(number));
			System.out.println("Enter an integer <-1 to exit>: ");
				number = input.nextInt();
			}

		}//end main

		public static int reverseDigits(int number){
			int reverseNumber = 0;
			int placeValue;

			while(number > 0){
				placeValue = number % 10;
				number /= 10;
				reverseNumber = reverseNumber * 10 + placeValue;
				}
				return reverseNumber;

		}
	}






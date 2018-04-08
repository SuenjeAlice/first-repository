/**

Name: Continue

Description: program that prompts user to select a number from 1 ro 10, inclusive; the number determines which iteration the loop should not complete

Created By: Alice Winteler

Created On: 27/02/2018

*/

import java.util.Scanner;

public class Continue
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number;
		int counter=0;

		System.out.print("Enter a number from 1 to 10: ");
			number = input.nextInt();

		System.out.println();

		while(counter<10)
		{
			counter++;
			if(counter == number){
				continue;
			}
			System.out.println(counter);
		}

		System.out.println();

		Extra.main(null);

	}

}
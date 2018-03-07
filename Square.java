/**

Name: Square

Description: program that includes method that displays a solid square

Created By: Alice Winteler

Created On: 7/3/2018

*/

import java.util.Scanner;

public class Square{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter square size: ");
			int size = input.nextInt();

		squareOfAsteriks(size);

	}

	public static void squareOfAsteriks( int size){
		for(int row = 1; row <= size; row++){
			for(int col = 1; col <=size; col++)
				System.out.print("*");

			System.out.println();
		}
	}

}
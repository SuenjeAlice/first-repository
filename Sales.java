/**

Name: Sales

Description: program that reads a series of pairs of numbers

Created By: Alice Winteler

Created On: 27/02/2018

*/

import java.util.Scanner;

public class Sales
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double total = 0;
		int productId;

		System.out.print("Enter product number (1 - 5 or 0 to stop): ");
			productId = input.nextInt();

		while(productId != 0)
		{
			if(productId >= 1 && productId <= 5){
				System.out.print("Enter quantity sold: ");
					int quantity = input.nextInt();
				switch(productId){
					case 1:
						total += quantity * 2.98;
						break;
					case 2:
						total += quantity * 4.50;
						break;
					case 3:
						total += quantity * 9.98;
						break;
					case 4:
						total += quantity * 4.49;
						break;
					case 5:
						total += quantity * 6.87;
						break;
				}
			}
			else{
				System.out.println("Not a valid product number.");
			}
			System.out.print("Enter product number (1 - 5 or 0 to stop): ");
				productId = input.nextInt();
		}
		System.out.println();
		System.out.println("Total retail value of all products sold is: " + Math.round(total));
	}

}
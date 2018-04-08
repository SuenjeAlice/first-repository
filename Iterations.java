/*

Name: Iterations

Description: program which demonstrates what the given code will do

Created by: Alice Winteler

Created on: 21/02/2018

*/

public class Iterations
{

	public static void main(String[] args)
	{
		int i = 1;
		int j = 2;
		int k = 3;
		int m = 2;

		for(i = 1; i <= 5; i++){
			for(j = 1; j <= 3; j++){
				for(k = 1; k <= 4; k++)
					System.out.print('*');

				System.out.println();
			}

			System.out.println();
		}

		Extra.main(null);
	}

}
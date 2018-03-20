/*

Name: EnhancedFor

Description: Prints values assigned to each element of the array

Created by: Alice Winteler

Created on: 20/03/2018

*/

public class EnhancedFor
{

	public static void main(String[] args){
		int[] x = {7, 6, 11, 15, 19};
		int total = 0;

		for(int i: x){
			total+= i;
		}

		System.out.println("Sum of array values is: "+total);
		Index.main(null);
	}

}
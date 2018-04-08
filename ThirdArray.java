/*

Name: ThirdArray

Description: Prints values assigned to each element of the array

Created by: Alice Winteler

Created on: 20/03/2018

*/

public class ThirdArray
{

	public static void main(String[] args){
		int[] x = new int[5];

		System.out.println("Index\tValue");

		for(int i = 0; i < x.length; i++){
			x[i] = i + 1;
		}

		for(int i = 0; i < x.length; i++){
			System.out.println(i+"\t"+x[i]);
		}

		System.out.println();

		Extra.main(null);
	}

}
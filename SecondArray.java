/*

Name: SecondArray

Description: Prints values assigned to each element of the array

Created by: Alice Winteler

Created on: 20/03/2018

*/

public class SecondArray
{

	public static void main(String[] args){
		int[] x = {128, 132, 8, 156, 18};
		System.out.println("Index\tValue");

		for(int i = 0; i < x.length; i++){
			System.out.println(i+"\t"+x[i]);
		}

		System.out.println();

		Index.main(null);
	}

}
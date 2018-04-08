/**

Name: ContinueTest

Description: a given program rewriten

Created By: Alice Winteler

Created On: 27/02/2018

*/

public class ContinueTest
{

	public static void main(String[] args)
	{
		for(int count = 1; count <= 10; count++){
			if(count == 5){

			}
			else{
				System.out.println(count);
			}
		}

		System.out.println("Used a strucured equivalent of continue to skip printing 5");

		Extra.main(null);
	}

}
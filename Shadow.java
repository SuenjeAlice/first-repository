/**

Name: Shadow

Description: a program that shows how shadowing works

Created By: Alice Winteler

Created on: 13/03/2018

*/

public class Shadow{
	int x = 1;

	public static void main(String[] args){
		Shadow s = new Shadow();
		System.out.println("Local x = " + s.localVar());
		System.out.println("Gobal x from method is: " + s.globalVar());
		System.out.println("Global x from attribute: " + s.x);
		Index.main(null);
	}

	int globalVar(){
		return this.x;
	}

	int localVar(){
		int x = 2;
		return x;
	}

}
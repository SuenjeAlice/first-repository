// for project - menu choice will invoke another class, extra excersises
import java.util.Scanner;

public class Extra{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

	System.out.println("Menu for extra exercises:");
	System.out.println();
    System.out.println("Select an option (1-13):");
    System.out.println();
    System.out.println("1. Continue");
    System.out.println("2. Continue Test");
    System.out.println("3. Third Array");
    System.out.println("4. Fourth Array");
    System.out.println("5. Grades");
    System.out.println("6. Iterations");
    System.out.println("7. Logical Output");
    System.out.println("8. Menu");
    System.out.println("9. Power");
    System.out.println("10. Return Methods");
    System.out.println("11. Sales");
    System.out.println("12. Two Dimensional Array");
    System.out.println("13. Exit");

  	System.out.println();

	System.out.print("Choice: ");
	int choice = input.nextInt();
    System.out.println();

    switch(choice){

		case 1:
		System.out.println("Continue");
		Continue.main(null);
		break;

		case 2:
		System.out.println("Continue Test");
		ContinueTest.main(null);
		break;

		case 3:
		System.out.println("Third Array");
		ThirdArray.main(null);
		break;

		case 4:
		System.out.println("Fourth Array");
		FourthArray.main(null);
		break;

		case 5:
		System.out.println("Grades");
		Grades.main(null);
		break;

		case 6:
		System.out.println("Iterations");
		Iterations.main(null);
		break;

		case 7:
		System.out.println("Logical Output");
		LogicalOutput.main(null);
		break;

		case 8:
		System.out.println("Menu");
		Menu.main(null);
		break;

		case 9:
		System.out.println("Power");
		Power.main(null);
		break;

		case 10:
		System.out.println("Return Methods");
		ReturnMethods.main(null);
		break;

		case 11:
		System.out.println("Sales");
		Sales.main(null);
		break;

		case 12:
		System.out.println("Two Dimensional Array");
		TwoD_Array.main(null);
		break;

		case 13:
        System.out.println("Exiting....");
        break;

		default:
        System.out.println("Invalid choice");
        break;

	}

	System.out.println();

  }
}
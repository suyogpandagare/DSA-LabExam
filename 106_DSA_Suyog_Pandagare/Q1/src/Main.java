import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Stack  stud= new Stack(5);

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println(" Enter the choice");

			System.out.println("1. Push a Student: ");
			System.out.println("2. Pop a Student: ");
			System.out.println("3. Print the Stack: ");
			System.out.println("4. Print all Male Students: ");
			System.out.println("5. Print all Female Students: ");
			System.out.println("6. Empty Stack Recursively: ");
			System.out.println("7. Print the Stack in Reverse Order: ");
			System.out.println("8. exit ");

			choice =sc.nextInt();

			switch(choice) 
			{

			case 1 :{
				System.out.println(" Enter the Roll No. of student ");
				int roll_no = sc.nextInt();
				System.out.println(" Enter the name of student ");
				String name = sc.next();
				System.out.println(" Enter the gender of student ");
				char gender = sc.next().charAt(0);
				stud.push(new Student (roll_no,name,gender));
				break;

			}

			case 2 :{
				stud.pop();
				break;
			}

			case 3 :{
				stud.print();;
				break;
			}


			case 4 :{
				stud.printMaleStudents();
				break;
			}

			case 5 :{
				stud.printFemaleStudents();
				break;
			}

			case 6 :{
				stud.EmptyStackRec();
				break;
			}

			case 7 :{
				stud.printReverse();;
				break;
			}


			case 8 :{
				break;
			}

			default:{
				System.out.println("Invalid Student Entry..");
				break;
			}


			}

		}while(choice!=8);		

	}		

}


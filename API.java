import java.util.Scanner;
public class API {
	public static void main(String[] args) {
		String name1, name2;
		int math1, math2, eng1, eng2, sci1, sci2, API1, API2, sum1, sum2, result;
		boolean compar;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of student 1: ");
		name1 = input.nextLine();

		System.out.println("Enter marks of maths: ");
		math1 = Integer.parseInt(input.nextLine());

		System.out.println("Enter marks of english: ");
		eng1 = Integer.parseInt(input.nextLine());

		System.out.println("Enter marks of science: ");
		sci1 = Integer.parseInt(input.nextLine());

		System.out.println("Enter name of student 2: ");
		name2 = input.nextLine();

		System.out.println("Enter marks of maths: ");
		math2 = Integer.parseInt(input.nextLine());

		System.out.println("Enter marks of english: ");
		eng2 = Integer.parseInt(input.nextLine());

		System.out.println("Enter marks of science: ");
		sci2 = Integer.parseInt(input.nextLine());

		System.out.println("Student Name: " + name1);
		System.out.println("Maths: " + math1);
		System.out.println("English: " + eng1);
		System.out.println("Science: " + sci1);

		System.out.println("\nStudent Name: " + name2);
		System.out.println("Maths: " + math2);
		System.out.println("English: " + eng2);
		System.out.println("Science: " + sci2);

		sum1 = math1 + eng1 + sci1;
		API1 = sum1 * 100 / 300;
		sum2 = math2 + eng2 + sci2;
		API2 = sum2 * 100 / 300;
		System.out.printf("\nTotal marks scored by %s: %d\n", name1, sum1);
		System.out.printf("Precentage: %d%%\n", API1);
		System.out.printf("Total marks scored by %s: %d\n", name2, sum2);
		System.out.printf("Precentage: %d%%\n\n", API2);

		System.out.printf("Is %s's percentage greater than %s? " + (API1 > API2 ? "Yes\n" : "No\n"), name1, name2);
		System.out.printf("Is %s's percentage lesser than %s? " + (API1 < API2 ? "Yes\n" : "No\n"), name1, name2);
		System.out.printf("Is %s's percentage equal to %s? " + (API1 == API2 ? "Yes\n" : "No\n"), name1, name2);

		if (API1 < 60) {
			result = 0;
			System.out.printf("Scholarship Amount for %s is: $%d\n", name1, result);
		}
		else if (API1 >=60 && API1 < 75) {
			result = 1000;
			System.out.printf("Scholarship Amount for %s is: $%d\n", name1, result);
		}
		else {
			result = 2000;
			System.out.printf("Scholarship Amount for %s is: $%d\n", name1, result);
		}

		if (API2 < 60) {
			result = 0;
			System.out.printf("Scholarship Amount for %s is: $%d\n", name2, result);
		}
		else if (API2 >=60 && API2 < 75) {
			result = 1000;
			System.out.printf("Scholarship Amount for %s is: $%d\n", name2, result);
		}
		else {
			result = 2000;
			System.out.printf("Scholarship Amount for %s is: $%d\n", name2, result);
		}
	}
}
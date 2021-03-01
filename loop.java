public class loop {
	public static void main(String[] args) {
		int x, i, sqrt;
		for (i = 1; i < 6; i++) {
			sqrt = i * i;
			System.out.printf("%d squared = %d\n", i, sqrt);
		}
		System.out.println("\n\n");

		//////////////////////////////////////

		for (int line = 1; line <= 5; line++) {
			for (i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}
			for (i = 1; i <= (11 - 2 * line); i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int line = 5; line >= 1; line--) {
			for (i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}
			for (i = 1; i <= (11 - 2 * line); i++) {
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println("+--------+");
		System.out.println("|\\....../|");
		System.out.println("| \\..../ |");
		System.out.println("|  \\../  |");
		System.out.println("|   \\/   |");
		System.out.println("|   /\\   |");
		System.out.println("|  /..\\  |");
		System.out.println("| /....\\ |");
		System.out.println("|/......\\|");
		System.out.println("+--------+");
	}
}
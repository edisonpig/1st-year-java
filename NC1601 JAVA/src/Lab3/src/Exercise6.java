
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\n1.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i);
			}
		}

		System.out.println("\n\n2.");
		for (int i = 2; i <= 6; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i);
			}
		}

		System.out.println("\n\n3.");
		for (int i = 1; i <= 5; i += 2) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i);
			}
		}

		System.out.println("\n\n4.");
		for (int i = 1; i <= 7; i += 2) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i);
				j += 1;

			}
		}

		System.out.println("\n\n5.");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i);
			}
		}

		System.out.println("\n\n6.");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i - 1; j--) {
				System.out.print(i);
			}
		}

		System.out.println("\n\n7.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i + 1; j++) {
				if (i % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
		}

		System.out.println("\n\n8.");
		for (int i = 2; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {
				if ((i == 2) || (i == 5)) {
					System.out.print("-");
				} else if ((i == 3) || (i == 6)) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
		}
	}

}

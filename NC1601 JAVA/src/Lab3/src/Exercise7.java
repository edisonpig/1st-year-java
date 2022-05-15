
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nquestion 1:\n");
		// question 1

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {

				if ((i == 10) && (j == 10)) {
					System.out.print(i);
					System.out.print(j + ".");
				} else {
					System.out.print(i);
					System.out.print(j + ",");
				}
			}
		}
		System.out.println("\nquestion 2:\n");
		// question 2
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				if (i > j) {
				}
				if ((i == 9) && (j == 10)) {
					System.out.print(i);
					System.out.print(j + ".");
				} else if (i >= j) {
				} else {
					System.out.print(i);
					System.out.print(j + ",");
				}
			}
		}

		System.out.println("\nquestion 3:\n");
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j <= 8; j++) {
				if ((i == 4) && (j == 8)) {
					System.out.print(i);
					System.out.print(j + ".");
				} else {
					System.out.print(i);
					System.out.print(j + ",");
				}
			}
		}
	}

}

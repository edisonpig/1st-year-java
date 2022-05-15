
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] myarray = new int[3][10];
		for (int x = 0; x < 3; x++) {
			int a = 25;
			if (x == 2) {
				a = 5000;
			}
			for (int y = 0; y < 10; y++) {
				myarray[x][y] = a;
				if (x != 2) {
					a += 25;
				}
			}
		}
		PrintArray(myarray);
	}

	private static void PrintArray(int[][] array) {
		for (int i = 0; i < array.length; ++i) {
			for (int j = 0; j < array[i].length; ++j) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}

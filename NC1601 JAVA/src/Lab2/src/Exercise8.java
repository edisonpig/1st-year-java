import java.util.Scanner;
public class Exercise8 {
	private static Scanner inp;
	public static void main(String[] args) {
		int a;
		inp = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Please type a number.");
		a=inp.nextInt();
		if (a%2==1){
			System.out.println("It is an odd number.");
		}
		else{
			System.out.println("It is an even number.");
		}
	}

}

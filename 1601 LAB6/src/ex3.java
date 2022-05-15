import java.util.InputMismatchException;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner year = new Scanner(System.in);
		System.out.println("Enter the year!");
		try{
		 int yr = year.nextInt();
		 if (yr<1582){
			 System.out.println("Please enter a correct year");
		 }else{
		boolean result = leap(yr);
		String s = "";
		s = (result)?"leap year!":"not leap year!";
		System.out.println(yr+" is "+s);
		 }
	}
		catch(InputMismatchException e){
			System.out.println("Please enter a correct year");
		}
	}
	public static boolean leap(int x){
		if (((x % 4 == 0) && !(x % 100 == 0))||(x % 400 == 0)){
			return true;
		}
		else{
			return false;
		}
	}
}

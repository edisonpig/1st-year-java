import java.util.InputMismatchException;
import java.util.Scanner;
public class ex4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner year = new Scanner(System.in);
		System.out.println("Enter the year: ");
		try{
			 int yr = year.nextInt();
			 if (yr<1582){
				 System.out.println("Please enter a year after 1582");
		 }else{
		System.out.println("Enter the month: ");
		int month = year.nextInt();
		
		boolean leap = ex3.leap(yr);
		switch (month){
		default:
			System.out.println("The month you typed is incorrect!");
			break;
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		{
			day=31;
			System.out.println("The days in "+month+"/"+yr+" is: "+day);
			break;
		}
		case 2:
		{
			day=(leap)?29:28;
			System.out.println("The days in "+month+"/"+yr+" is: "+day);
			break;
		}
		case 4:case 6:case 9:case 11:
		{
			day=30;
			System.out.println("The days in "+month+"/"+yr+" is: "+day);
			break;
		}
		}
		
		 }

	}
	catch(InputMismatchException e){
		System.out.println("Please enter a correct date");
	}
}
}

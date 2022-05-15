import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nThe following is Exercise 5:");
		 Scanner inp = new Scanner(System.in);
		 for (int i=0;i<10;i++){
		 int a = inp.nextInt();
		 int b = inp.nextInt();
		 int ta =a;
		 int tb = b;
		 int c=1;
		 while (c!=0){
			 c=a%b;
			 System.out.print(".");
			 if (c!=0){
				 a=b;
				 b=c;
			 }

		 }
		 System.out.println("\nThe HCF of "+ ta +" & "+tb+" is "+b);
		 }
	}

}

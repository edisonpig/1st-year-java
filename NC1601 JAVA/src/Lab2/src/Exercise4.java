import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
	
	private static Scanner inp;  //java told me to add it and idk what it means
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		inp = new Scanner (System.in); //scanner input from user
		boolean whole = true;
		int i; 
		int x=0;
		// starting exercise
		for (i=0;i<3;i++){  //loop 3 times // for = loop is conditional loop    for (int i=0;i<3  ; i++)
																	//0-->1-->2-->3
			 //x=0;
			 whole = true;
			 
			 try{
				 
			
			System.out.print("enter integer : ");
			x = inp.nextInt();	// save integer entered
			 
			
			while (whole){						
		//long x = inp.nextLong(); // for large numbers	
			if (x<0){//wrong
				System.out.println("Please enter a whole number!");
				
				x= inp.nextInt();
			}
			else{
				whole =false;

			}
			}
		
		
			
		// int x =2349 //normal situation
		
			
																	//wrong end
			
		if ((x%2==0)&&(x%3==0)){
		System.out.println("1. "+x+" is divisible by 2 and 3\n");
		}
		else{
			System.out.println("1. "+x+" is not divisible by 2 and 3\n");
		}
		
		
		
		if ((x%7==0)||(x%9==0)){ 
			System.out.println("2. "+x+" is divisible by 7 or 9\n");
			} 
			else{
				System.out.println("2. "+x+" is not divisible by 7 or 9\n");
			}
		
		
		
		if ((x%2==0) && (x%3==0)){
			if (!(x%5==0)){
			System.out.println("3. "+x+" is divisible by 2 and 3 and not divisible by 5\n");
			}
			else{
			System.out.println("3. "+x+" is divisible by 2 and 3 but it is also divisible by 5\n");
			}
		}
		else{
			if (!(x%5==0)){
			System.out.println("3. "+x+" is not divisible by 2 and 3 and not divisible by 5\n");
			}
			else{
			System.out.println("3. "+x+" is not divisible by 2 and 3 but it is divisible by 5\n");
			}
		}
		}
		catch(InputMismatchException e) {
		System.out.println("-Please enter a whole number!");
		inp.nextLine();
		i--;
	}
		
		}
			
		
		System.out.println("End of the program.");
		
	
	}
}


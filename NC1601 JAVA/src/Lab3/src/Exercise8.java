import java.util.Scanner;
import java.lang.*;
public class Exercise8 {
private static Scanner inp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean cap,small,dit,sym,done;
boolean ok = false;
char a;
String b="",fin="Done";
		inp = new Scanner(System.in);
while(ok==false){
	System.out.println("type");
		b = inp.next();
		done= b.equals(fin);
		if (done==true){
			System.out.println("Thank you.");
			ok = true;
			break;
		}
		else
		{
		a=b.charAt(0);
		dit = Character.isDigit(a);
		small = Character.isLowerCase(a);
		cap = Character.isUpperCase(a);
		if (dit==true){
			System.out.println(a +" is a digit!");
		}
		else if (small ==true){
			System.out.println(a+" is a small letter!");
			
		}
		else if (cap == true){
			System.out.println(a+" is a capital letter!");
		}
		else{
			System.out.println(a+" is a special symbol!");
		}
	
		}

}
			
			
			
			
			
			
			
			
			
		
		
	}

}

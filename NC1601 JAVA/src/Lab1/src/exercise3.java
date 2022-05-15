
import java.lang.Math;
public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a,g,x; 
		double b,c,y;
		boolean d;
		String e,f,h,z;
		a=100;
		b=2.3;
		c=-52.2;
		d=true;
		e= "I am";
		f= " a student";
		g=0;
		h="!";
		final double pi=3.142;
		final String name=" Edison ";
		
		
		y=a+b;
		System.out.println("1. y= " + y);
		
		/*y=a+d;// d is boolean where a is integer.
		System.out.println("2."y);*/
		System.out.println("2. It cannot give a correct answer.");
		
		z=e + f;
		System.out.println("3. z= " + z);
		
		y=b*c;
		System.out.println("4. y= " + y);
		
		/*pi=22/7;*/ // The constant pi is not changable.
		System.out.println("5. It cannot give a correct answer. ");
		
		/*z=name%g;*/ //strings cannot be divided. 
		System.out.println("6. It cannot give a correct answer.");
		
		/*z=c/g;*/ // c has decimal place while z is a string. 
		//The answer of the calculation cannot be saved in z. 
		System.out.println("7. It cannot give a correct answer.");
		
		x= 10;
		x= x*x*x; //Math.pow can only be used on double
		System.out.println("8. " + x);
		
		z= name + "is " + f + h;
		System.out.println("9. " + z);
		
		/*y= (name+10)/(name+h)*/ // y is double which cannot accept strings.
		//Moreover, strings cannot be divided.
		System.out.println("10. It cannot give a correct answer.");
		
		/*x=(a+b)/(d+c);*/ // d is boolean and x cannot save answers with decimal places.
		System.out.println("11. It cannot give a correct answer.");
		
		y=100.3;
		y=(y/(a+b))-c;
		System.out.println("12. " +y);
		
		/* x= Math.sqrt(Math.pow(y,2) + Math.pow(z,2))/ // The left hand side should be only one syntax that is able to save the data.
		System.out.println("13. It cannot give a correct answer.");
		
		/*name="is" +f-h;*/ // strings cannot be calculated.
		System.out.println("14. It cannot give a correct answer.");
		
		y=((pi+1)/(pi+2))/(pi+3);
		System.out.println("15. " + y);
		
		y=-2;
		y=(Math.pow(y,2))/b;
		System.out.println("16. " + Math.cbrt(y));
		
		/*y=b/g; 
		z= y +name;*/ // The math calculation is incorrect for dividing a variable to 0.
		System.out.println("17. It cannot give a correct answer.");
		
		/*z=name;
		z=b/g +z;*/  // The math calculation is incorrect for dividing a variable to 0.
		System.out.println("18. It cannot give a correct answer." );
		
		y=-2.3;
		y= a*Math.pow(y, 2) +b*y + c;
		System.out.println("19. " + y);
		
		/*
		 y=y-Math.pow((a-b),Math.pow((b-c),(c-d));
		 System.out.println(y);*/ // boolean d cannot be calculated.
		System.out.println("20. It cannot give a correct answer.");
		
		
		
		
		
		
		
		
		
	}

}

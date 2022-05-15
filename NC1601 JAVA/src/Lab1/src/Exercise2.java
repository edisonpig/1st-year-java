
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*long x;
		
		x = 100.1;
		System.out.println(x);
		x = x + 10.2; //Line A
		System.out.println(x);
		x = x + 20.3; //Line B
		System.out.println(x);
The result was "Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from double to long
	Type mismatch: cannot convert from double to long
	Type mismatch: cannot convert from double to long

	at Exercise2.main(Exercise2.java:9)"
*/
		double y;
		
		y = 100.1;
		System.out.println(y);
		y = y + 10.2; //Line A
		System.out.println(y);
		y = y + 20.3; //Line B
		System.out.println(y);
		
	/* The result has no problems and is able to show the results of y as follows 
	 100.1
	 110.3
	 130.6
	 This is because the Syntax of long does not apply on decimal places and will show errors.
	  But the Syntax double is able to show and calculate decimal place.
	  */
	}

}

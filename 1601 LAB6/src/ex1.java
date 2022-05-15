
public class ex1 {
	public static void main(String args[])
	{
		int i;
		boolean result;
		String s = "";
		
		for(i=1;i<=25;i++)
		{
			result = EvenOdd(i);
			s = (result)?"Even":"Odd";
			System.out.println(i + " is " + s);
		}
	}
	public static boolean EvenOdd(int x)
	{
		//add your code here to check if x is odd or even. Note that the return type is Boolean. So it should return true if it is even and false if it false.
		int ch = x%2;		
		if (ch==1){
			return false;
		}else{
			return true;
		}
	
	
	
	}

}

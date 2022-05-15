import java.math.BigInteger;

public class ex7 {
	public static void main(String args[])
	{
	System.out.println(factorial(30));
	// negative : 32&33
	// 0 : 34+
	//This is because overflow will occur due to the result larger than the upper limit of int & long.
}
	public static BigInteger factorial(int x){
		BigInteger result=BigInteger.ONE;
		BigInteger xi = BigInteger.valueOf(x);
	if(x>1){
		result =xi.multiply(factorial(x-1));
	}
	return result;
}
}

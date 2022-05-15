import java.math.BigInteger;
public class ex5 {
	public static void main(String args[])
	{
	System.out.println(factorial(23));
}
	public static BigInteger factorial(int x){
		BigInteger result=BigInteger.ONE;
	for (int i=x;i>0;i--){
		result=result.multiply(BigInteger.valueOf(i));
	}
	return result;
}
}

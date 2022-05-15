import java.lang.*;
public class ex6 {
	public static void main(String args[])
	{
	System.out.println(charcount("abracadabra", 'a'));
}

public static int charcount(String ipx, char c)
	{
	int count=0;
//add your code here to count the frequency of c in ipx
	for (int i=ipx.length()-1;i>=0;i--){
		Character k = ipx.charAt(i);
		boolean hv = k.equals(c);
		
		if(hv==true)
			count+=1;
	}
	return count;
	}

}

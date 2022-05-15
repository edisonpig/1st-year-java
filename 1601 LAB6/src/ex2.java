
public class ex2 {
	public static void main(String args[])
	{
		System.out.println(reverse("desserts"));
}

public static String reverse(String ipx)
	{
//add your code here to reverse the string
	String c = "";
	if (ipx.length()==0){
		return "You need to type something!";
	}else{
	for(int i=ipx.length()-1;i>=0;i--){
		char k = ipx.charAt(i);
		c+=k;
		
	}
	return c;
	}
	}

}

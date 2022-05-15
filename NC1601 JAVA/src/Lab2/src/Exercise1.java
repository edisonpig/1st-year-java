
public class Exercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000,b = -22;
		
		   if (a < b)
		   {
		      System.out.println("a is less than b");
		   }
		   else
		   {
		      System.out.println("a is NOT less than b");
		   }
		  a = 1000; 
		  b = 1500;
			
		   if (a < b)
		   {
		      System.out.println("a is less than b");
		   }
		   else
		   {
		      System.out.println("a is NOT less than b");
		   }
		   
		   System.out.println("test if a is greater than b ");
		   if (a > b)
		   {
		      System.out.println("a is greater than b");
		   }
		   else
		   {
		      System.out.println("a is less than b");
		   }
		   
		   //alternative method
		   int k=0, x=50, y =100;
		   k=(x<y)?1:2;
		   switch (k)
		   {
			   case 1:
		   	{
			   System.out.println("x is less than y.");
			   break;
		   }
			   case 2:{
			   System.out.println("x is NOT less than y.");
			   break;
			   }
		   }
	}
	}


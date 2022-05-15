
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("eg.");
		for(int i=0;i<10;i++)
		{
		System.out.print("*");
		}

		
		
		System.out.println("\n\n1.");
		for(int i=0;i<10;i++)
		{
		System.out.print("+");
		}
		
		
		System.out.println("\n\n2.");
		for(int i=0;i<9;i++)
		{
		System.out.print("-");
		}
		
		
		
		System.out.println("\n\n3.");
		for(int i=0;i<5;i++)
		{
		System.out.print("+");
		System.out.print("-");
		}
		
		
		
		System.out.println("\n\n4.");
		for(int i=0;i<3;i++)
		{
		System.out.print("*");
		System.out.print("+");
		System.out.print("-");
		}
		
		
		
		System.out.println("\n\n5.");
		for(int i=0;i<3;i++)
		{
		System.out.print("*");
		System.out.print("+");
		System.out.print("-");
		if ((i%2==0)&&(i!=0)){
		System.out.print("*");
		}
		}
		
		
		
		System.out.println("\n\n6.");
		for(int i=0;i<3;i++)
		{
		System.out.print("**++");
		}
		
		
		
		System.out.println("\n\n7.");
		
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++){
		System.out.print("*");
			}
			for (int j=0;j<3;j++){
		System.out.print("+");
			}for (int j=0;j<3;j++){
		System.out.print("-");
		}
		}
		
		
		String j="***";
		String k="+++";
		String l="---";
		System.out.println("\n\n8.");
		
		System.out.print(j+k+l+l+k+j);
		
	}

}

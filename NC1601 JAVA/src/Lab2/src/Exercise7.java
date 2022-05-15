
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 100, y=204,c= -204;
		
		double z= -23.1;
		boolean d,a=true, b=false;
//1		
		d=(x<y)?a:b;
			System.out.println("1." + d);
	
//2		
		d= ((x>z) && (a==b))?a:b;
		System.out.println("2." + d);
		
//3			
		d= (2*c>y)?a:b;
			System.out.println("3." + d);
		
		
/* 4
		d= (x=b)?a:b;
			System.out.println("4." + a);

		
		//Cannot compare boolean to integers.
		*/
		System.out.println("4. It cannot give a correct answer. ");
		
//5
		d=((c==y)||(c!=y))?a:b;
			System.out.println("5." + d);
/*6
		d=(!(z==y) && (c==a)?a:b;
			System.out.println("6." + d);
		//Cannot compare boolean to integers.
		*/
		System.out.println("6. It cannot give a correct answer. ");
/*7
		d=((y>=y) && !((a+3)==2)?a:b;
			System.out.println("6." + d);
		//Cannot calculate boolean nor compare boolean to integers.
		*/
		System.out.println("7. It cannot give a correct answer. ");

	}

}

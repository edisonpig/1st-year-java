
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 100, y=204,c= -204;
		double z= -23.1;
		boolean a=true, b=false;
//1		
		if (x<y){
			System.out.println("1." + a);
		}
		else{
			System.out.println("1." + b);
		}
//2		
		if ((x>z) && (a==b)){
			System.out.println("2." + a);
		}
		else{
			System.out.println("2." + b);
		}
//3			
		if (2*c>y){
			System.out.println("3." + a);
		}
		else{
			System.out.println("3." + b);
		}
/* 4
		if (x=b){
			System.out.println("4." + a);
		}
		else{
			System.out.println("4." + b);
		}
		
		//Cannot compare boolean to integers.
		*/
		System.out.println("4. It cannot give a correct answer. ");
		
//5
		if ((c==y)||(c!=y)){
			System.out.println("5." + a);
		}
		else{
			System.out.println("5." + b);
		}
/*6
		if (!(z==y) && (c==a)){
			System.out.println("6." + a);
		}
		else{
			System.out.println("6." + b);
		}
		//Cannot compare boolean to integers.
		*/
		System.out.println("6. It cannot give a correct answer. ");
/*7
		if ((y>=y) && !((a+3)==2)){
			System.out.println("6." + a);
		}
		else{
			System.out.println("6." + b);
		}
		//Cannot calculate boolean nor compare boolean to integers.
		*/
		System.out.println("7. It cannot give a correct answer. ");

	}

}

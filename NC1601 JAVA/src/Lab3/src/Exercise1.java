
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=100;i++){
			if ((i%2==0)&&(i%3==0)){
				System.out.println(i+" is divisible by 2 and 3.");
			}
			else{
				System.out.println(i+" is not divisible by 2 and 3.");
			}
			if ((i%7==0)||(i%9==0)){
				System.out.println(i+" is divisible by 7 or 9.");
			}
			else{
				System.out.println(i+" is not divisible by 7 or 9.");
			}
			if ((i%2==0)&&(i%3==0) &&(i%5!=0)){
				System.out.println(i+" matches for the statement of 'divisible by 2 and 3 but not 5.'\n\n");
			}
			else{
				System.out.println(i+" does not match for the statement of 'divisible by 2 and 3 but not 5.'\n\n");
			}
		}
		
	}

}

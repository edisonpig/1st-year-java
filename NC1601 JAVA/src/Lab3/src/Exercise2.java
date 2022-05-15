
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		System.out.println("eg:");
		for(i=0;i<10;i++)
			if(i!=9){
				System.out.print(i+",");
		// this prints from 0 - 10.
			}
			else{
				System.out.print(i);
				}
		
		
		
		System.out.println("\n\n1.");
		for(i=4;i<=11;i++)
			if(i!=11){
				System.out.print(i+",");
				// this prints from 0 - 10.
				}else{
					System.out.print(i);
				}
		
		
		
		System.out.println("\n\n2.");
		for(i=10;i<=19;i+=3)
			if(i!=19){
				System.out.print(i+",");
				// this prints from 0 - 10.
				}else{
					System.out.print(i);
				}
		
		
		
		
		System.out.println("\n\n3.");
		for(i=1;i<=16;i+=3)
			if(i!=16){
				System.out.print(i+",");
				// this prints from 0 - 10.
				}else{
					System.out.print(i);
				}
		
		
		
		
		System.out.println("\n\n4.");
		for(i=2;i<=12;i+=2)
			if(i!=12){
				System.out.print(i+",");
				// this prints from 0 - 10.
				}else{
					System.out.print(i);
				}
		
		
		
		
		System.out.println("\n\n5.");
		int j=1;
		for(i=1;i<=100;i+=j)
			if(i!=100){
				System.out.print(i+",");
				j+=2;
				// this prints from 0 - 10.
				}else{
					System.out.print(i);
					
		}
		
		
		
		System.out.println("\n\n6.");
		for(i=-10;i<=10;i+=2)
			if(i!=10){
				System.out.print(i+",");
				// this prints from 0 - 10.
				}else{
					System.out.print(i);
				}
		
		
		
		System.out.println("\n\n7.");
		for(i=-20;i<=20;i+=5)
		{	if (i!=0){
				if(i!=20){
					System.out.print(i+",");
				// this prints from 0 - 10.
			
			}else{
					System.out.print(i);
				}
		}
		else{}
	}
	}
}

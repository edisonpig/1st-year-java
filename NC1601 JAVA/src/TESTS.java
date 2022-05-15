//1. import java.util.Random;
import java.io.*;
public class TESTS {

	public static void main(String[] args)throws IOException{
/*	 1. Random x = new Random();
		int y = x.nextInt();
		System.out.println(y);
		
		double z = x.nextDouble();
		System.out.println(z);
		*/
		
/*	 2. long before = System.currentTimeMillis();
		for(int i=1;i<=20000;i++)
		System.out.println("i.");
		
		long after = System.currentTimeMillis();
		
		System.out.println(after-before);
		// to measure the performance 
		*/
		
	/*	FileWriter writehandle0 = new FileWriter("C:\\Users/Pig Chu ^(00)^/Desktop/file.html");
		BufferedWriter bw0 = new BufferedWriter(writehandle0);
		
		bw0.write("inside a file \r\n");
		//bw0.append(selectedProduct.getHTMLBody().replaceAll("\\r\\n|\\r|\\n", " "));
		String a = "this is the first line.";
		String b = "this is the second line."; 
		String c = a + "<br>" + b;
		bw0.write(c);
		bw0.write("Lela loves");
		System.out.println("done \n");
		
		bw0.close();
		writehandle0.close();
		//results: "\r\n" dont work
		//			system.lineSeperator dont work
		//			"<br>" works 
		
		try{
		FileWriter writehandle = new FileWriter("C:\\Users/Pig Chu ^(00)^/Desktop/file.txt");
		BufferedWriter bw = new BufferedWriter(writehandle);
		
		bw.write("inside a file");
		bw.newLine();
		bw.write("Lela loves");
		System.out.println("done");
		
		bw.close();
		writehandle.close();
		}
		catch(IOException ioe){
			System.out.println("error occured.");
		}
		
		
		
		FileReader readhandle = new FileReader("C:\\Users/Pig Chu ^(00)^/Desktop/file.txt");
		BufferedReader br = new BufferedReader(readhandle);
		String thiss="";
		String line = null;
		while((line = br.readLine())	!= null)
		{
			thiss = line;
			System.out.println(thiss);
			System.out.println(line);
		}
		System.out.println(thiss);
		System.out.println(line);
		br.close();
		readhandle.close();
		temp(122); //or syso(temp(122)) for non-void functions.
		
		// C= (5(F-32))/9
		*/
		long x = 17234432;
		int length = (int)(Math.log10(x)+1);
		System.out.println(length);
	}
	public static void temp(double Fa){
		double cel;
		cel = (5*(Fa-32))/9;
		System.out.println("The cel is "+ cel +"when fah is "+Fa+".");
		
	}
	public void changesize(){
		int y =8;
		int z=7;
		
	}
}

import java.util.ArrayList;
public class binarytest {

	public static String getdecimal(String b) {
		int decimalnumber = 0;
		String error = "The binary number you entered is incorrect, please check again.";
		
		String bi[] = b.split("");
		ArrayList<Integer> bin = new ArrayList<Integer>();
		for (int i = 0; i < bi.length; i++) {
			bin.add(Integer.parseInt(bi[i]));

		}
		/*System.out.println(bin);
		System.out.println("start");*/
		int power = bin.size();
		for(int i = 0;i<bin.size();i++){
				Integer one = bin.get(i);
				if(one >1){
					return error;
				}else{
				power--;
				decimalnumber += one* Math.pow(2, power);
				
				/*
				System.out.println(power);
				System.out.println(i);
				System.out.println(decimalnumber);
				System.out.println("\n");*/
		}
		}
		if (bin.size()>8){
			return error;
		}else{
		String ans = ("The decimal number of "+b+" is "+decimalnumber);
		return ans;
		}
	}
	/*public static int gethexa(int binarynumber) {
		int hexanumber = 0;
		int power = 0;
		while (true) {
			if (binarynumber == 0) {
				break;
			} else {
				int temp = binarynumber % 10;
				hexanumber += temp * Math.pow(16, power);
				binarynumber = binarynumber / 10;
				power++;
			}
		}
		return hexanumber;
	}
	*/
	public static void main(String args[]) {
System.out.println(getdecimal("10111001") );
System.out.println(getdecimal("11111111"));
System.out.println(getdecimal("11111112"));


		}
	}

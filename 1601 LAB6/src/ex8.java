
public class ex8 {
	public static void main(String args[]) {
		System.out.println(palindrome("anna"));
		System.out.println(palindrome("a toyota"));

	}

	public static String palindrome(String a) {
		String result = "";
		String c = "";
		String n = "";
		// new with no space
		for (int i = 0; i <= a.length() - 1; i++) {
			char q = a.charAt(i);
			if (q == ' ') {
			} else {
				n += q;
			}
		}
		// reverse and no space and save
		for (int i = a.length() - 1; i >= 0; i--) {
			char k = a.charAt(i);
			if (k == ' ') {
			} else {
				c += k;
			}
		}

		if (c.equals(n)) {
			result = "Yes! " + a + " is a palindrome!";
		} else {
			result = "No! " + a + "";
		}

		return result;
	}
}

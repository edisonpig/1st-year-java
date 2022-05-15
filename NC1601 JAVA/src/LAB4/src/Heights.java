import java.util.ArrayList;

public class Heights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] heights = { 186, 154, 175, 196.4, 164.3, 174.3, 186.4, 192, 180.6, 164 };
		System.out.println("\nThis is the start of exercise 1.");
		System.out.println("a. the length of the array is " + heights.length);
		double avg = 0;
		System.out.println("b.");
		for (int i = 0; i < heights.length; i++) {
			avg += heights[i];
			System.out.println("The " + (i + 1) + " value in the array is " + heights[i]);
		}
		System.out.println("c. The average height is " + avg / 12);

		double max = heights[0], min = heights[0];
		for (int i = 1; i < heights.length; i++) {
			double x = heights[i];
			if (x < min) {
				min = x;
			}
		}
		System.out.println("d. " + min);

		for (int i = 1; i < heights.length; i++) {
			double x = heights[i];
			if (x > max) {
				max = x;
			}
		}
		System.out.println("e. " + max);

		System.out.println("\nThis is the start of exercise 2.");
		
		ArrayList<Double> heightsList = new ArrayList<Double>();
		for (int i = 0; i < heights.length; i++) {
			heightsList.add(heights[i]);
		}
		heightsList.add(170.0);
		// or heightsList.add(new Double(170)); but not heightsList.add(170);
		heightsList.remove(2);
		heightsList.add(168.9);
		heightsList.add(193.3);
		heightsList.add(169.4);
		heightsList.add(184.5);
		heightsList.add(155.6);
		double temp = 0;
		for (int i = 0; i < heightsList.size(); i++) {
			for (int j = heightsList.size() - 1; i < j; j--) {
				if (heightsList.get(i) > heightsList.get(j)) {
					temp = heightsList.get(i);
					heightsList.set(i, heightsList.get(j));
					heightsList.set(j, temp);

				}
			}

		}
		System.out.println("The whole view of the heightsList is :");
		for(int i=0;i<heightsList.size();i++){
			System.out.println(heightsList.get(i));
		}
		System.out.println("The minimum value is "+heightsList.get(0));
		System.out.println("The maximum value is "+heightsList.get(heightsList.size()-1));
	}

}

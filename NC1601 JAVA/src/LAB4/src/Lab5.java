import java.util.ArrayList;

public class Lab5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exercise 5
		member member1 = new member("Lela", 41);
		member member2 = new member("Leonardo", 21);
		member member3 = new member("Michelangelo", 43);
		member member4 = new member("Rafaelo", 37);

		ArrayList<member> memberList = new ArrayList<member>();
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		
		member member2_3 = new member ("Donatelo",58);
		memberList.add(2,member2_3);
		System.out.println("\n\n");
		printMemberData(memberList);
		// The reason this is in the main method is because the function 
		//can only be executed when the "flow" of program (which starts from the main function mentions it
	
	
	
		//exercise 7
		ArrayList<member> mylistA = new ArrayList<member>();
		ArrayList<member> mylistB = new ArrayList<member>();
		ArrayList<member> mylistC = new ArrayList<member>();
		ArrayList<member> mylistD = new ArrayList<member>();
		mylistA.add(member2);
		mylistA.add(member3);
		mylistA.add(member4);
		
		
		
		System.out.println("This is exercise 7\n");
		printMemberData(mylistA);
		System.out.println();
		mylistB = mylistA;
		printMemberData(mylistB);
		System.out.println();
		mylistA.remove(1);
		printMemberData(mylistB);
		//line 46 continues updating when 
		//there are changes in A
		
		mylistC.add(member2);
		mylistC.add(member3);
		mylistC.add(member4);
		System.out.println("This is exercise 7 about C&D.\n\n");
		printMemberData(mylistC);
		System.out.println();
		mylistD = (ArrayList<member>)mylistC.clone();
		mylistC.remove(1);
		printMemberData(mylistC);
		System.out.println();
		printMemberData(mylistD);
		System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	}

	private static void printMemberData(ArrayList<member> mylist) {
		for (int i = 0; i < mylist.size(); i++) {
			member person = mylist.get(i);
			person.printInfo();
		}
	}
}

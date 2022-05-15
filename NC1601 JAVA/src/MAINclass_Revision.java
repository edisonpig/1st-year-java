
public class MAINclass_Revision extends firstlab{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person_Revision person1 = new person_Revision("Justin Bieber",7);
	 // class  object  = new constructor (parameters);
		
		String PersonName = person1.GetName();
		//declare variable = assignment statement (use an object(person1) to call a method ;
		
		int age = person1.GetAge();
		System.out.println("Person Name: "+PersonName);
		System.out.println("Age: "+age);
		
		
		
		System.out.println();
		person1.SetName("john");
		PersonName = person1.GetName();
		System.out.println("Person Name: "+PersonName);
		
		
		
		Student_Revision student1 = new Student_Revision("Iron man",50,"CS");
		//name(XStudentName from student class)= iron man
		//String StudentName = student1.GetName();
		//System.out.println("\nStudent1 Name: "+StudentName);
		
		
		//student1.print();
		
		System.out.println(student1);	 //result Student_Revision@15db9742
		System.out.println("\n\n");	
		student1.newprint();
		
	}

}

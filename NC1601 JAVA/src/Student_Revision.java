
public class Student_Revision extends person_Revision{

	private String course;
	
	//constructor
	
	public Student_Revision(String StudentName, int StudentAge, String theCourse){
		super(StudentName,StudentAge);
		//supercall = directly execute the person constructor and continue
		course = theCourse;
	print(StudentName,StudentAge,theCourse);
	}
	
	public void print(String StudentName, int StudentAge, String theCourse){
	String name = StudentName;
	int age = StudentAge;
	String course = theCourse;
	System.out.println(StudentName+" "+StudentAge+" "+theCourse);
	}
	
	public void newprint(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(course);
		//As the inheritance is borrowing spaces from supercall main class, the names 
		//are still using "name" and "age" but not "StudentName" and "StudentAge" identified in Class(Student)
		
		//When this is called, it calls back to student1(memory), which is created via Class(student) from Person. 
	}
}

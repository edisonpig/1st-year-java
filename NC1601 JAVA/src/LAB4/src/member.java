public class member { // class declaration
	private String name; // field declaration
	private int age;

	public member(String n, int a) { // constructor
		name = n;
		age = a;
	}

	public String getName() { // name getter
		return name;
	}

	public void setName(String newname) { // name setter
		name = newname;
	}

	public int getAge() { // age getter
		return age;
	}

	public void setAge(int newage) { // age setter
		age = newage;
	}

	public void printInfo() { // output
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("*******************");
	}
}
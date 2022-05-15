
public class student1 {

	int id;
	String name;
	int age;
	
	public student1 (int i,String n){
		id =i;
		name = n;
		
	}
	public student1(int i , String n, int a){
		id = i;
		name = n;
		age = a;
	}
	public void display(){
		System.out.println(id +" "+name+" "+age);
	}
}


public class person_Revision {

	protected int age;
	protected String name;
	
	public person_Revision(String n,int a)
	{
		
		name =n;
		age=a;
	}
	
	public void SetName(String name_p){
	/*	for (int i =0;i<10;i++){
		name[i] = name_p;
		}
		*/
		name = name_p;
	}
	
	public void SetAge(int age_p){
		/*for (int i =0;i<10;i++){
		age[i] = age_p;
		}*/
		age = age_p;
	}
	
	public String GetName(){
		return name;
	}
	
	public int GetAge(){
		return age;
	}
}

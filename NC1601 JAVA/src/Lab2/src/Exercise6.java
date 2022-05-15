import java.util.Scanner;
public class Exercise6 {
	//private static Scanner inp;
	public static void main(String[] args) {
		// TODO Auto-generated method stu b
		System.out.println("This is the first part of the exercise.");
		System.out.println("Please type in small letters.");
		int leg_num =0;
		String animal = "";
		Scanner inp = new Scanner (System.in);
		
		animal = inp.nextLine();
		
		switch (animal){
		
		case "llama":case "goat":case "ocelet":	case "dog":case "cat":
			leg_num =4;
			break;
		case "cobra":case "cod":case "minke whale":
			leg_num =0;
			break;
		case "baboon":case "human":case "klingon":
			leg_num =2;
			break;
		case "centipede":
			leg_num =100;
			break;
		case "tarantula":case "black scorpion":case "octopus":
			leg_num =8;
			break;
		default:
			leg_num =-1;
			System.out.println("Not recoreded in database.");
			break;			
		}
		System.out.println("a(n)" + animal + " have " + leg_num + " legs");

		
		System.out.println("\nThis is the second part of the exercise.");
		System.out.println("Please type in small letters.");
		
		animal = "";
		leg_num=inp.nextInt();
		
		switch (leg_num){
		case 0:
			animal =" cobra, cod and Minke Whale ";
			break;
		case 2:
			animal =" baboon ,klingon and human ";
			break;
		case 4:
			animal =" llama,goat,ocelet,dog and cat ";
			break;
		case 8:
			animal =" tarantula,black scorpion and octopus ";
			break;
		case 100:
			animal =" centipede ";
			break;
		default:
			leg_num = -1;
			animal = "animal";
			System.out.println("Not recoreded in database.");
			break;
		}
		System.out.println("a(n)" + animal + " have " + leg_num + " legs");
	}

}

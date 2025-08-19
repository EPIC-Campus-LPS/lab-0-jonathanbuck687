package packageName;

import java.util.Scanner;

public class lab0 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Verb: ");
		String verb = scan.nextLine();
		System.out.println("Adjective: ");
		String adj = scan.nextLine();
		System.out.println("Noun: ");
		String noun = scan.nextLine();
		System.out.println("They wanted to " + verb + " a " + adj + " " + noun + " for the science fair.");;
	}

}

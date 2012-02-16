package ProjectEuler;
import java.util.Scanner;

public class ProblemTemplate {
	
	/**
	 * @param args
	 * Paste problem text here and format.
	 */
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Place descriptive text here.");
		System.out.println("Please enter a value for x:");
		int num = input.nextInt();
		long start = System.currentTimeMillis();
		
		
		
		
		
		
		
		
		long end = System.currentTimeMillis();
		int time = (int)(end - start);
		System.out.println("****The Program took "+time+"ms to execute.****");
		System.out.println("End of Program.");
	} // end method main

} // end class ProblemTemplate
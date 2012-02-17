package OtherMath;

import java.util.Scanner;

public class AnyNumberAddition {

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will add the digits of any positive number.");
		System.out.print("Please enter a number:");
		String num = input.next();
		long start = System.currentTimeMillis();
		
		char[] number = num.toCharArray();
		int numLength = number.length;
		
		int sum = 0;
		
		for (int i=0; i<=numLength-1; i++){
			sum += Character.getNumericValue(number[i]);
		}
		
		System.out.println("Sum of digits = "+sum);
		
		long end = System.currentTimeMillis();
		int time = (int)(end - start);
		System.out.println("****The Program took "+time+"ms to execute.****");
		System.out.println("End of Program.");
	} // end method main

} // end class ProblemTemplate
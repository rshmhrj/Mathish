package greatCalculator;

import java.util.Scanner;

public class MainCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		String n1 = ""; //First number
		String n2 = ""; //Second number
		int num1 = 0;
		int num2 = 0;
		String op = "";		
		Scanner in = new Scanner(System.in);	
		
		do{
			System.out.println("Welcome to the Great Calculator!\n");
			System.out.println("Please enter the first number...");
			
			boolean flag = true;
			
			while(flag){
				n1 = in.nextLine();
				try{
					num1 = Integer.parseInt(n1);
					flag = false;
				}
				catch(NumberFormatException e){
					flag = true;
					System.out.println("Please enter a NUMBER");
				}
			}
	
			System.out.println("Please enter the second number...");
			
			flag = true;
			
			while(flag){
				n2 = in.nextLine();
				try{
					num2 = Integer.parseInt(n2);
					flag = false;
				}
				catch(NumberFormatException e){
					flag = true;
					System.out.println("Please enter a NUMBER");
				}
			}
			
			
			System.out.println("Please choose an operation to perform,\nchoose either +, -, *, or /");
			
			flag = true;
			
			while(flag){
				op = in.nextLine();		
				if(op.equals("+")){
					total = num1 + num2;
					flag = false;
				}
				else if(op.equals("-")){
					total = num1 - num2;
					flag = false;
				}
				
				else if(op.equals("*")){
					total = num1 * num2;
					flag = false;
				}
				
				else if(op.equals("/")){
					total = num1 / num2;
					flag = false;
				}
				else {
					flag = true;
					System.out.println("Please enter a valid OPERATION\n +,-,*, or/");
				}
				
			}
				System.out.print(num1+op+num2+"="+total);
				
		}while(total > 0);
	} 
}

package ProjectEuler;
import java.util.Scanner;
import math.Maths;

public class Problem9
{
	/**
	 * @param args
	 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
		a2 + b2 = c2
		For example, 32 + 42 = 9 + 16 = 25 = 52.
		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		Find the product abc.
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the Pythagorean triplet (a,b,c) where a+b+c=x.");
		System.out.print("Please enter a value for x:");
		long x = input.nextLong();
		input.close();
		
		long start = System.currentTimeMillis();
//		Maths.printPythagoreanTriples(Maths.generate_n_PythagoreanTriples(10));
		body(x);
	
//		System.out.println(Maths.isSqrtInteger(x));
//		System.out.println(Maths.isPerfectSquare_ModifiedQuake3(x));

		long end = System.currentTimeMillis();
		int time = (int)(end - start);
		System.out.println("****The Program took "+time+"ms to execute.****");
		System.out.println("End of Program.");
	}
	
	public static void body(long x)
	{
		boolean match = false;
		//load list of triples
		int[][] triples = new int[(int) x/10][3];
		
		int found = 0;
		int c = 0;
		for (int a = 1; a < 10*x; a++)
		{
			if (found == x)
			{
				break;
			}
			for (int b = 1; b < 10*x; b++)
			{
				c = (int) Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
					if(Maths.isSqrtInteger((Math.pow(a, 2) + Math.pow(b, 2))))
					{	
						if(!Maths.isPythagoreanMultiple(triples,a,b,c) && a+b+c == (int)x)
						{
							triples[found][0] = a;
							triples[found][1] = b;
							triples[found][2] = c;
							found++;
							break;
						}
					}
			}
		}
		
		for (int[] triple : triples) 
		{
			if (triple[0] + triple[1] + triple[2] == (int) x)
			{
				Maths.printTriple(triple);
				match = true;
			}
		}
		
		if (match == false)
		{
			System.out.println("No triplets found that equal "+x);
		}
	}
	
}
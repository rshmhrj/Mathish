package math;

public class Maths {

	public static int randomBetween(int x, int y){
		int diff = y - x + 1;
		if (diff < 0){
			diff *= -1;
		}
		int z = (int)Math.ceil((Math.random()*diff));
		return z;
	}
	
	public static int[] twoRandoms(int x, int y){
		int a = randomBetween(x,y);
		int b = randomBetween(x,y);
		while (a == b){
			b = randomBetween(x,y);
		}
		int[] result = {a,b};
		return result;
	}
}

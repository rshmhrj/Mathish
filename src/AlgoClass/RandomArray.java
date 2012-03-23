package AlgoClass;

@SuppressWarnings("javadoc")
public class RandomArray {
	static int[] RandomArray;

	
	public RandomArray(int n) {
		// TODO Auto-generated method stub.
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = (int)Math.random();
		}
		setRandomArray(temp);
	}

	public static int[] getRandomArray() {
		return RandomArray;
	}

	public static void setRandomArray(int[] randomArray) {
		RandomArray = randomArray;
	}
	
	public static String toString(int[] A){
		return A.toString();
	}
}

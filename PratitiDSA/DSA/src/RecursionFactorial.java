
public class RecursionFactorial {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int fact = factorial(5);
		long timetaken = (System.nanoTime()-startTime)/ 1000000;
		System.out.println("Time Taken : " + timetaken);	
		System.out.println("Fact : "+ fact);
	}
	
	private static int factorial(int num) {
		if(num == 0 || num ==1) {
			return 1;
		}
		else {
			return num * factorial(num -1);
		}
	}
}

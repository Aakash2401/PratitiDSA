
public class Sum {
	
	public static void main(String[] args) {

		long n = 1000000000;
		long sum = 0;
		
		Cal cal = new Cal();
		long sum1 = cal.addIt(n);
		long sum2 = cal.addItAgain(n);
				
		
	}

}

class Cal {
	
	
	long addIt(long n) {
		long startTime = System.nanoTime();
		long sum = 0;	
		for(int i=0; i<=n; i++){
			sum += i;
		}
		long timetaken = (System.nanoTime()-startTime)/ 1000000;
		System.out.println("Time Taken O(n) : " + timetaken);
		return sum;
	}
	
	
	long addItAgain(long n) {
		long startTime = System.nanoTime();

		long sum = n*(n+1)/2;
		
		long timetaken = (System.nanoTime()-startTime)/ 1000000;
		System.out.println("Time Taken O(1): " + timetaken);
		
		return sum;
	}
	
}

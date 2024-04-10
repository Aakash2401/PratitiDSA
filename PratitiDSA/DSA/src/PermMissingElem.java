
public class PermMissingElem {
	
	public static void main(String[] args) {
		
		int A[]= {5,4,3,2,9,8,7,6};
		//int A[]= {5,3,2,1};
		long start = System.nanoTime();
		int val1 = 	solution(A);
		long duration = (System.nanoTime() - start);
        System.out.println("Solution1 : "+duration  + "ns");

		start = System.nanoTime();
		int val2 = solution2(A);
		duration = (System.nanoTime() - start);
		System.out.println("Solution2 : "+duration + "ns");
	}
	
	public static int solution(int[] A) {
        int n = A.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : A) {
            arraySum += num;
        }

        return (int) (totalSum - arraySum);
    }
	
	static int solution2(int A []) {
		int temp=0;
	    int counter=1;
	    for(int i : A) {
	            temp ^= i;
	            temp ^= counter;
	            counter++;
	    }
	    temp^= counter;
	    return temp;
	}
}
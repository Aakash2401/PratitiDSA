import java.util.Arrays;

public class Disc {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 5, 2, 1, 4, 0};
	        int result = solution(arr);
	        System.out.println("Number of intersecting pairs: " + result);
	    }
	
	    private static int solution(int[] arr) {
	    	int size = arr.length;
	        int[] startPoints = new int[size];
	        int[] endPoints = new int[size];
	        for (int i = 0; i < size; i++) {
	            startPoints[i] = i - arr[i];
	            endPoints[i] = i + arr[i];
	        }
	        
	        Arrays.sort(startPoints);
	        Arrays.sort(endPoints);

	        int intersections = 0;
	        int activeDiscs = 0;
	        int j = 0;

	        for (int i = 0; i < size; i++) {

	            while (j < size && startPoints[j] <= endPoints[i]) {
	                activeDiscs++;
	                j++;
	            }
	        }
	        
	        activeDiscs--;


            intersections += activeDiscs;

           

            return intersections;

	       
	    }
}
	


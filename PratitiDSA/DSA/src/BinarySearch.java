
public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[] = new int[1000000];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = i;
		}
		
		int index = binarySearch(arr, 77777);
		System.out.println("index : " + index);
		
	}
	
	
	private static int binarySearch(int[] arr, int target) {
		long startTime = System.nanoTime();
		int low = 0;
		int high = arr.length - 1;
		
		while(low<=high) {
			int mid = low + (high - low) / 2;
			int value = arr[mid];
			if(value < target) {
				low = mid + 1;
			}
			else if(value > target) {
				high = mid - 1;
			}
			else {
				long timetaken = (System.nanoTime()-startTime)/ 1000000;
				System.out.println("Time Taken O(logn): " + timetaken);				
				return mid;
			}
		}
		return -1;
	}
	
	

}

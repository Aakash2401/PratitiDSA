
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = new int[10000];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = i;
		}
		bubbleSort(arr);
	}	
	
	private static void bubbleSort(int arr[]) {
		long startTime = System.nanoTime();
		for(int i=0; i < arr.length-1; i++) {
			for(int j=1; j<arr.length -1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		long timetaken = (System.nanoTime()-startTime)/ 1000000;
		System.out.println("Time Taken O(n^2): " + timetaken);	
	}
}

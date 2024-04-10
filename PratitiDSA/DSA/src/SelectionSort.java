
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        System.out.println("Original Array:");
        printArray(array);

        long startTime = System.nanoTime();
        selectionSort(array);
        long timetaken = (System.nanoTime()-startTime)/ 1000000;
		System.out.println("Time Taken: " + timetaken);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
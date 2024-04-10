import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	
	public static void main(String[] args) {
		int binaryGap = solution(529);
		System.out.println(binaryGap);
	}
	
	public static int solution(int N) {
		String binary = Integer.toBinaryString(N);
        System.out.println("Binary :"+ binary);
        int longestGap = 0;
        int currentGap = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (currentGap > longestGap) {
                    longestGap = currentGap;
                }
                currentGap = 0;
            } else {
                currentGap++;
            }
        }
        return longestGap;
    }
}



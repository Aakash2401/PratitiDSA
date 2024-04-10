
public class Frog {
	public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        int result = solution(X, Y, D);
        System.out.println("Minimal number of jumps: " + result);
	}
	
	public static int solution(int X, int Y, int D) {
        int distanceToCover = Y-X;
        int jumpsNeeded = distanceToCover/D;
        if (distanceToCover % D != 0) {
            jumpsNeeded++;
        }
        return jumpsNeeded;
    }
}

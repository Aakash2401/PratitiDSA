package com.test;

public class FibFrog {

    public static void main(String[] args) {
        FibFrog fibFrog = new FibFrog();
        int[] arr = {0,0,0,1,1,0,1,0,0,0,0};
        int jumpCount = fibFrog.solution(arr);
        System.out.println("Jump : " + jumpCount);
    }

    private int solution(int[] arr) {

        int[] f = new int[20];
        f[0] = 1; f[1] = 2;

        for (int i = 2; i < f.length; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        int[] mins = new int[arr.length+1];

        for(int i=0; i<mins.length; i++) {
            if (i < arr.length && arr[i] == 0) {
                mins[i] = -1;
                continue;
            }

            int min = Integer.MAX_VALUE;

            for (int j = f.length-1; j >= 0; --j) {
                int k = i - f[j];
                if (k < -1)
                    continue;
                if (k == -1) {
                    min = 1;
                    break;
                }
                if (mins[k] < 0) {
                    continue;
                }

                int newMin = mins[k] + 1;

                if (newMin < min) {
                    min = newMin;
                }
            }
            if (min != Integer.MAX_VALUE) {
                mins[i] = min;
            }
            else mins[i] = -1;
        }
        return mins[arr.length];
    }


}

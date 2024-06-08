import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int max0 = 0;
        int max1 = 0;

        for (int[] size : sizes) {
            Arrays.sort(size);
            for (int j = 0; j < size.length; j++) {
                if (max0 < size[0]) {
                    max0 = size[0];
                } else if (max1 < size[1]) {
                    max1 = size[1];
                }
            }
        }
   
        return max0*max1;
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
           int[] answer = new int[commands.length];

        for (int l = 0; l < commands.length; l++) {
            int i = commands[l][0];
            int j = commands[l][1];
            int k = commands[l][2];

            int [] arr = new int[j-i+1];

            for (int n = i-1; n < j; n++) {
                int index = -(j-n- arr.length);
                arr[index] = array[n];
            }
            Arrays.sort(arr);
            answer[l] = arr[k-1];
        }
        return answer;
    }
}
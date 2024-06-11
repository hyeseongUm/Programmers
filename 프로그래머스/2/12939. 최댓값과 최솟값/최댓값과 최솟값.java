import java.util.Arrays;

class Solution {
    public String solution(String s) {
         int [] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        
        return min+" "+max;
    }
}
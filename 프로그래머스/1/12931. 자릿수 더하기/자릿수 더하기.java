import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String numToStr = String.valueOf(n);

        for (int i = 0; i < numToStr.length(); i++) {
            String a = numToStr.charAt(i)+"";
            answer += Integer.parseInt(a);
         }
        return answer;
    }
}
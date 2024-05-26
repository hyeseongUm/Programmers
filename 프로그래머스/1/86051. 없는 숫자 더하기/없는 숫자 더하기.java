import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
       
        for (int i = 0; i < 10; i++) {
            answer += i;
        }
  
        answer -= Arrays.stream(numbers).sum();
        return answer;
    }
}
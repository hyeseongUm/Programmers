class Solution {
    public String solution(int[] food) {
        String answer = "";
        
         for (int i = 1; i < food.length; i++) {
            if (food[i]/2 > 0){
                for (int j = 0; j < food[i]/2; j++) {
                    answer += i;
                }
            }
        }
        answer += 0;
        char [] c = answer.toCharArray();
        for (int i = c.length-2; i >= 0 ; i--) {
            answer += c[i];
        }

        return answer;
    }
}
class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if (num == 1){
           return answer;
        }

        while (true){
            num = num%2 == 0 ? num/2 : num*3+1;
            answer++;
            if (answer >= 500){
                answer = -1;
                break;
            } else if (num == 1) {
                break;
            }
        }
        
        return answer;
    }
}
class Solution {
    public long solution(long n) {
        long answer = 0;
        int x = 0;
        
       while(x<n){
            x++;
            if((long) x * x == n){
                answer = (long) (x + 1) * (x + 1);
                break;
            }else {
                answer = -1;
            }
        }
        
        return answer;
    }
}
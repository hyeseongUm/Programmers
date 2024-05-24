class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        int i = 0;
        long num = n;

       while (num>0){
           i++;
           num = num/10;
        }
       answer = new int[i];

        for (int j = 0; j < i; j++) {
            answer[j] = (int)(n%10);
            n = n/10;
        }

        
        return answer;
    }
}
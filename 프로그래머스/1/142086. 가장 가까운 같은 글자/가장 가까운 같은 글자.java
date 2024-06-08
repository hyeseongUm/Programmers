class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            int cnt = 0;
            int length = 0;
            for (int j = 0; j < i; j++) {
               if (s.charAt(i) == s.charAt(j)){
                   cnt++;
                   length = i-j;
               }
            }
            if (cnt==0){
                answer[i]=-1;
            }else {
                answer[i]=length;
            }

        }
        return answer;
    }
}
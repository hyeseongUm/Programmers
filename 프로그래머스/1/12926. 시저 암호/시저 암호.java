class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char [] cc = s.toCharArray();

        for (char i : cc){
            if (i>=97 && i<=122 && i+n > 122 || i>=65 && i<=90 && i+n > 90){
                i = (char) (i-26);
            } else if (i == 32 && i+n > 32) {
               i = (char) (i-n);
            }
            answer.append((char) (i+n));
        }
        
        return answer.toString();
    }
}
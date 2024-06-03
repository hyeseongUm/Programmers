class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long t2 = Long.parseLong(t.substring(i,i+p.length()));
            
            if(t2 <= Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}
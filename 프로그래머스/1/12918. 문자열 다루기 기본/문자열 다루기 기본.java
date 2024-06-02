class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        long i =s.chars().filter(value -> value<48||value>57).count();
        answer = (s.length()==4 || s.length()==6)&& i==0;
        
        return answer;
    }
}
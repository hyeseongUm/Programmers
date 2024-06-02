class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        int n2 = n;
        int m2 = m;
        while (true){
            int division = n2%m2;
            if (division == 0){
                answer[0] = m2;
                answer[1] = n * m / answer[0];
                break;
            }
            n2 = m2;
            m2 = division;
        }
        
        return answer;
    }
}
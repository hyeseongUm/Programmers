class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            int a = price*(i);
            answer += a;
        }

        answer = money-answer>0? 0: Math.abs(money-answer);


        return answer;
    }
}
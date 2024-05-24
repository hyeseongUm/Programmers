import java.util.ArrayList;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        while (n>0){
            arr.add((int)(n%10));
            n = n/10;
        }

        arr.sort((v1,v2)->v2-v1);

        for (Integer i : arr) {
            str.append(i);
        }

        answer = Long.parseLong(str.toString());
        
        
        return answer;
    }
}
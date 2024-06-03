import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int limit =0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i : d) {
            arr.add(i);
            arr.sort(Comparator.comparingInt(v -> v));
        }

        for (int i = 0; i < arr.size(); i++) {
            limit += arr.get(i);
            if(limit <= budget){
                answer++;
            }
        }
        
        return answer;
    }
}
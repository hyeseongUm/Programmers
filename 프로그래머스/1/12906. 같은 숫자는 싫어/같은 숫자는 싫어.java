import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int before = 1000001;
        
        for (int i = 0; i < arr.length; i++) {
            if (before != arr[i]){
                answer.add(arr[i]);
                before = arr[i];
            }
        }
        int [] arr2 = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            arr2[i] = answer.get(i);
        }
        
        return arr2;
    }
}
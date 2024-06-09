import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(!arr.contains(numbers[i]+numbers[j])){
                    arr.add(numbers[i]+numbers[j]);
                }
            }
            arr.sort(Comparator.naturalOrder());
        }

       
        return arr;
    }
}
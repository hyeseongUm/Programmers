import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int buf = 200001;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            if (buf != num) {
                if (!arr.contains(num) && arr.size() != nums.length/2){
                    arr.add(num);
                    buf = num;
                }
            }
        }

        return arr.size();
    }
}
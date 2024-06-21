import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
     String[] answer = new String[strings.length];
      ArrayList<String> arr = new ArrayList<>(Arrays.asList(strings));

       arr.sort((a,b) -> {
            int res = a.charAt(n) - b.charAt(n);
            if(res == 0){
                res = a.compareTo(b);
            }
            return res;
        });

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
      StringBuilder answer = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        list.sort((v1,v2)->v2-v1);
        for(Character character:list){
            answer.append(character);
        }

        return answer.toString();
    }
}
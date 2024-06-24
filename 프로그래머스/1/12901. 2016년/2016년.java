import java.util.*;

class Solution {
    public String solution(int a, int b) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2016,a-1,b);
        
        return calendar.getTime().toString().substring(0,3).toUpperCase();
    }
}
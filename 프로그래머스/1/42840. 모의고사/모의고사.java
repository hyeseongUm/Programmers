import java.util.*;

class Solution {
    public Integer[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] one = new int[]{1,2,3,4,5};
        int [] two = new int[]{2,1,2,3,2,4,2,5};
        int [] three = new int[]{3,3,1,1,2,2,4,4,5,5};
        int [] arr = new int[3];

        for (int i = 0; i < answers.length; i++) {
            one = Arrays.copyOf(one,answers.length);
            two = Arrays.copyOf(two,answers.length);
            three = Arrays.copyOf(three,answers.length);

            if(one[i] == 0){
                one[i] = one[i%5];
            }if(two[i] == 0){
                two[i] = two[i%8];
            }if(three[i] == 0){
                three[i] = three[i%10];
            }

            if(answers[i] == one[i]){
                arr[0]++;
            }if (answers[i] == two[i]) {
                arr[1]++;
            }if (answers[i] == three[i]){
                arr[2]++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            int max = Arrays.stream(arr).max().getAsInt();
            if (max == arr[i]){
                list.add(i+1);
                list.sort((a,b) -> a-b);
            }
        }
         System.out.println(Arrays.toString(list.toArray(new Integer[0])));
        return list.toArray(new Integer[0]);
    }
}
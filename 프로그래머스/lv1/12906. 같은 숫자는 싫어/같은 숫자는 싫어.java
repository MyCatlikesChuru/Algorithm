import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int buff = -1;
        List<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if(buff == arr[i]){
                continue;
            }else {
                buff = arr[i];
                arrayList.add(buff);
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
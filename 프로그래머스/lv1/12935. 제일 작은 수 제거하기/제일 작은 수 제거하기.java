import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int imin = arr[0];
        int num = 0;
        for(int i :arr){
            imin = Math.min(i,imin); //arr안의 min값찾기.
            num++;
        }
        int imin_final = imin;
        int[] result_1 = Arrays.stream(arr).filter(it->it > imin_final ).toArray();
        int[] result_2 = {-1};
        return num>1 ? result_1 : result_2;
    }
}
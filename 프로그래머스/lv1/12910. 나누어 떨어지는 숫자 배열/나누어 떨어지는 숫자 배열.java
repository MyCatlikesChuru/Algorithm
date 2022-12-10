import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int n = 0;
        boolean flag = false;
        int[] arr1 = new int[arr.length];
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                arr1[n] = arr[i];
                n++;
                flag = false;
            }
            if(n==0 && i==arr.length-1){
                flag = true;
                n=1;
            }
        }
        int[] result = new int[n];
        if(!flag){
            for (int j=0;j<n;j++){
                result[j] = arr1[j];
            }
        }else{
            result[0] = -1;
        }
        return result;       
    }
}
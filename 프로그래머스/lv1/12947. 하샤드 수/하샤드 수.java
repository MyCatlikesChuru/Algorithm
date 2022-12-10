class Solution {
    public boolean solution(int x) {
        int sum = 0;
        //System.out.println("x값입니다: "+x);
        String xtos = String.valueOf(x); // x -> string 변환
        String[] stoa = xtos.split("");  // string -> arrays로 변환
        //System.out.println("x의 배열값: "+Arrays.toString(stoa));
        for(int i=0;i<stoa.length;i++){
            String buff = stoa[i]; //배열값 String로 변경해서 buff로 이동
            sum += Integer.parseInt(buff); // buff로온 String값으 integer로 변경
        }
        //System.out.println("받은갚의 자릿수합입니다: "+sum);
        double corret_ck = (double)x/sum;
        //System.out.println("(X값÷자릿수합) 결과 입니다: "+corret_ck);
        if(corret_ck==Math.floor(corret_ck)){
            return true;
        }
        return false;
    }
}
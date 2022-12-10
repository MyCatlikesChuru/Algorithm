class Solution {
    public String solution(String[] seoul) {
        int pos = 0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                pos=i;
                System.out.println("들어왓다");
            }
        }
        String here = String.valueOf(pos);
       
        return String.format("김서방은 %s에 있다", here);
    }
}
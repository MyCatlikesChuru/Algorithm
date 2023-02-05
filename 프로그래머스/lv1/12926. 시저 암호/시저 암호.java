class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char word = s.charAt(i);
            if(word == ' '){
                answer += " ";
            } else {
                boolean upper = (word<=122 && word>=97) ? true : false;
                char move = (char)(word+n);
                if(upper && move>122) move -= 26;
                if(!upper && move>90) move -= 26;
                    
                answer += Character.toString(move);                    
            }
        }
        
        return answer;
    }
}
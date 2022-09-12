import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine()); // 호텔에 입잘할 사람수
        for(int i=0;i<person;i++){
            String[] strs = br.readLine().split(" ");
            int H = Integer.parseInt(strs[0]); // 호텔의 높이
            int W = Integer.parseInt(strs[1]); // 호텔의 호수
            int roomPosition = Integer.parseInt(strs[2]); // 원하는 방의 위치
            String Hroom; //충수
            String Wroom; //호수
            //앞의 층수 구하기
            Hroom = roomPosition%H==0 ? String.valueOf(H) : String.valueOf(roomPosition % H);
            //뒤의 호수 구하기
            Wroom = roomPosition%H!=0 ? String.valueOf((roomPosition/H)+1) : String.valueOf((roomPosition/H));

            //최종 출력하기
            if(Integer.parseInt(Wroom)<10){
                System.out.println(Hroom+"0"+Wroom);
            } else {
                System.out.println(Hroom+Wroom);
            }
        }
    }
}
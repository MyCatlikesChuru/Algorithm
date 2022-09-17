import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());


        // []층 / [] 호
        int[][] apt = new int[15][15];
        for(int i=0;i<15;i++){
            apt[i][1] = 1; // 0층~14층 1호 1로 초기화
            apt[0][i] = i; // 0층 1호~14호 1~14로 초기화
        }
        for(int i = 1; i < 15; i ++) {	// 1층 ~ 14층까지
            for(int j = 2; j < 15; j++) {	// 2호 ~ 14호까지
                apt[i][j] = apt[i][j-1] + apt[i-1][j]; // 아래층수의 현재 호수 + 현재 층수 전호수
                //System.out.println(String.format("%d층 %d호 = %d",i,j,apt[i][j]));
            }
        }
        int cnt=0;
        while(true){
            int floor = Integer.parseInt(br.readLine());
            int roomNumber = Integer.parseInt(br.readLine());
            //bw.write(apt[floor][roomNumber]);
            bw.write(apt[floor][roomNumber]+"\n");
            cnt++;
            if(cnt>=T) break;
        }
        bw.flush();
        bw.close();
    }
}
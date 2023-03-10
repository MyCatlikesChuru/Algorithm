class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        // 명함의 모양이 직사각형이기 때문에, 가로 세로의 개념이 없다.
        // 눕힐 경우 세로였던것이 가로가 됨
        for (int i = 0; i < sizes.length; i++)
        {
            int a = sizes[i][0];
            int b = sizes[i][1];

            sizes[i][0] = Math.max(a,b); // 가로,세로중 큰값을 0번 인덱스에 저장
            sizes[i][1] = Math.min(a,b); // 가로,세로중 작은값을 0번 인덱스에 저장

            // 큰값과 작은값을 구해서 저장 (순회하면서 큰값으로 갱신)
            width = Math.max(width, sizes[i][0]);
            height = Math.max(height, sizes[i][1]);
        }
        return width * height;
    }
}
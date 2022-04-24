import java.util.Arrays;
import java.util.Scanner;
import java.util.random;

public class Main {

    private static final int ROW = 5;
    private static final int COL = 5;

    public static void main(String[] args) {
        // 학번,이름 출력
        System.out.println("202211290 김형언");


        // [numbers 배열을 오름차순으로 정렬한 뒤에 출력해주세요]
        int[] numbers = {1, 12, -1, 22, 17, 15, 123123, 22, -121, 199, 0, -11, -150};
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // [빙고게임]
        // 1. int형 2차원 배열 map을 (ROW*COL) 크기로 생성해주세요

        int[][] map = new int[ROW][COL];

        // 건드리지 않아도 됩니다(map 세팅)
        setMap(map);

        // 2. 스캐너 sc를 생성해주세요
        Scanner sc = new Scanner(System.in);
        while (isBingo(map)) {
            System.out.print("숫자를 입력해주세요[ex: 5] : ");
            int bin = sc.nextInt();
            System.out.println("");
            for (int i = 0; i<ROW; i++) {
                for (int j = 0; j < COL; j++) {
                    if (bin == map[i][j]) {
                        map[i][j] = 0;
                    }
                }
            }

            System.out.println();
        }
        // 6. 게임이 종료되면 map 배열을 출력해주세요
        System.out.println("게임 승리! 축하합니다.");
        for(int i=0;i<ROW;i++) {
            for(int j=0;j<COL;j++){
                System.out.print(map[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }

    private static void setMap(int[][] map) {
        for (int i = 1; i <= ROW * COL; i++) {
            boolean flag = true;
            while (flag) {
                int mi = ((int) (Math.random() * 10)) % ROW;
                int mj = ((int) (Math.random() * 10)) % COL;
                if (map[mi][mj] == 0) {
                    map[mi][mj] = i;
                    flag = false;
                }
            }
        }
    }

    public static boolean isBingo(int[][] map) {
        int sum = 0;
        int bingo = 0;

        for(int i = 0; i<ROW;i++){
            for(int j=0;j<COL;j++) {
                sum+=map[i][j];
            }
            if(sum==0){
                bingo+=1;
            }
            sum = 0;
        }

        for (int i = 0;i<COL;i++){
            for(int j = 0;j<ROW;j++){
                sum+=map[j][i];
            }
            if (sum == 0) {
                bingo+=1;
            }
            sum=0;
        }

        int p=0;
        int q=0;
        int sum2 = 0;
        while(p<ROW && q<COL){
            sum+=map[p][q];
            sum2 += map[ROW-1-p][COL-1-q];
            p++;
            q++;
        }
        if(sum==0){
            bingo+=1;
        }
        if(sum==0) {
            bingo += 1;
        }
        if(bingo>=3){
            return false;
        }
        else {
            return true;
        }

    }
}

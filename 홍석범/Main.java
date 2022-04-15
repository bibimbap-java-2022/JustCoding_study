package bibimbap.test.domain.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int ROW = 5;
    private static final int COL = 5;

    public static void main(String[] args) {
        System.out.println("홍석범, 201911293");

        int[] numbers = {1, 12, -1, 22, 17, 15, 123123, 22, -121, 199, 0, -11, -150};
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(numbers));
        System.out.println();

        int[][] map = new int[ROW][COL];
        setMap(map);

        while (true) {
            System.out.print("숫자를 입력해주세요[ex: 5] : ");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            int bingo = 0;

            for(int i=0; i<ROW; i++) {
                for (int j = 0; j < COL; j++) {
                    if (map[i][j] == num) {
                        map[i][j] = 0;
                    }
                }
                if(map[0][i]==0 && map[1][i]==0 && map[2][i]==0 && map[3][i]==0 && map[4][i]==0){
                    bingo++;
                }
                else if(map[i][0]==0 && map[i][1]==0 && map[i][2]==0 && map[i][3]==0 && map[i][4]==0){
                    bingo++;
                }
            }
            if(map[0][0]==0 && map[1][1]==0 && map[2][2]==0 && map[3][3]==0 && map[4][4]==0){
                bingo++;
            }
            if(map[0][4]==0 && map[1][3]==0 && map[2][2]==0 && map[3][1]==0 && map[4][0]==0){
                bingo++;
            }

            if(bingo >= 3){
                break;
            }
            for(int i=0; i<ROW; i++){
                for(int j=0; j<COL; j++){
                    System.out.print(map[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static void setMap(int[][] map) {
        for (int i = 1; i <= ROW*COL; i++) {
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
}

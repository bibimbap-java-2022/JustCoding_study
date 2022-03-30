package study.java.lab;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("홍석범");
        System.out.println(201911293);
        System.out.println("실수 A를 입력하세요");
        float A= sc.nextFloat();
        System.out.println("실수 B를 입력하세요");
        float B = sc.nextFloat();
        System.out.println("실수 C를 입력하세요");
        float C = sc.nextFloat();
        System.out.printf("(A+B)*(A-B)의 결과는 %f입니다.\n", (A+B)*(A-B));

        float result1 = (A+B) % C;
        float result2 = ((A%C) + (B%C)) % C;
        float result3 = (A*B) % C;
        float result4 = ((A%C) * (B%C)) % C;
        if(result1 == result2){
            System.out.println("(A+B)%C와 ((A%C) + (B%C))%C의 값은"+result1+"로 서로 같습니다");
        }else{
            System.out.println("(A+B)%C의 값은"+result1+", ((A%C) + (B%C))%C의 값은 "+result2+"로 서로 다릅니다");
        }
        if(result3 == result4){
            System.out.println("(A*B)%C와 ((A%C) × (B%C))%C의 값은"+result3+"로 서로 같습니다");
        }else{
            System.out.println("(A*B)%C의 값은"+result3+", ((A%C) × (B%C))%C의 값은 "+result4+"로 서로 다릅니다");
        }
    }
}

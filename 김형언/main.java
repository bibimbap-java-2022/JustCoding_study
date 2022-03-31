package javastudy.lab1;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("김형언");
        System.out.println(202211290);
        System.out.println("A 입력");
        float A= sc.nextFloat();
        System.out.println("B 입력");
        float B = sc.nextFloat();
        System.out.println("C 입력");
        float C = sc.nextFloat();
        
        float R11 = (A+B)*(A-B);
        System.out.println("(A+B)*(A-B)="+R11+"이다.");

        float r1 = (A + B) % C;
        float r2 = ((A % C) + (B % C)) % C;
        float r3 = (A * B) % C;
        float r4 = ((A % C) * (B % C)) % C;
        if(r1 == r2){
            System.out.println("(A+B)%C ="+r1+", ((A%C) + (B%C))%C ="+r1+"로 서로 같다");
        }else{
            System.out.println("(A+B)%C ="+r1+", ((A%C) + (B%C))%C ="+r2+"로 서로 다르다");
        }
        
      
        if(r3 == r4){
            System.out.println("(A*B)%C ="+r3+", ((A%C) × (B%C))%C ="+r3+"로 서로 같다");
        }else{
            System.out.println("(A*B)%C ="+r3+", ((A%C) × (B%C))%C ="+r4+"로 서로 다르다");
        }
    }
}

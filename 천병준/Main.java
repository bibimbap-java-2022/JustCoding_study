import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static int formula(int a, int b){
        int x = a+b;
        int y = a-b;

        return x*y;
    }

    public static void main(String[] args) {
        System.out.println("천병준");
        System.out.println("201911285");
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.println("A@B = " + formula(a, b));
        System.out.println("=================================");

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        int c = input.nextInt();

        System.out.println("1. (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?");
        int ans1 = (a+b)%c;
        int ans2 = ((a%c)+(b%c))%c;

        System.out.println("(A+B)%C = " + ans1);
        System.out.println("((A%C) + (B%C))%C = " + ans2);
        if(ans1 == ans2)
            System.out.println("같다");
        else
            System.out.println("다르다");

        System.out.println("2. (AxB)%C는 ((A%C) x (B%C))%C 와 같을까?");
        int ans3 = (a*b)%c;
        int ans4 = ((a%c)*(b%c))%c;

        System.out.println("(AxB)%C = " + ans3);
        System.out.println("((A%C) x (B%C))%C = " + ans4);
        if(ans3 == ans4)
            System.out.println("같다");
        else
            System.out.println("다르다");
    }
}

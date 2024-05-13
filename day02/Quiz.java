package day02;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇년생인가요?");
        int age = sc.nextInt();
        int a = 2024 - age;
        System.out.println(a + "살이시군요!");

        System.out.println("밑변 입력");
        int n = sc.nextInt();
        System.out.println("높이 입력");
        int h = sc.nextInt();
        int b = n*h/2;
        System.out.println("정삼각형의 넓이는 " + b);

        System.out.println("한변 입력");
        int n2 = sc.nextInt();
        System.out.println("정사각형의 넓이는" + n2*n2);

        System.out.println("원화를 입력하세요 :");
        int g = sc.nextInt();
        double e = g/8.77;
        System.out.println(e + "엔");
    }
}

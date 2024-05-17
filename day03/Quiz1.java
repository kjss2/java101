package day03;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("영어 점수를 입력하시오");
//        int n = sc.nextInt();
//        String a = n >= 60 ? "합격" : "불합격";
//        System.out.println(a + "입니다");
//
//        System.out.println("정수를 입력하시오");
//        int i = sc.nextInt();
//        String b = i > 0  ? "양수" : "음수";
//        System.out.println(b);
        System.out.println("정수를 입력하세여");
        int a = sc.nextInt();
        System.out.println("정수를 입력하세요");
        int b = sc.nextInt();
        int n = a > b ? a : b;
        System.out.println("더 큰 수는 " + n);

        System.out.println("정수를 입력하세요");
        int i = sc.nextInt();
        int q = i > 0 ? i : -i ;
        System.out.println("입력받은 정수의 절댓값은 " +  q);

        System.out.println("정수를 입력하세요");
        int p = sc.nextInt();
        String t = p % 2 == 0 ? "짝수" : "홀수";
        System.out.println("입력받은 수는 " + t);



    }
}

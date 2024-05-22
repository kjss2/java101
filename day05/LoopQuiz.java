package day05;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수 입력");
        int n = sc.nextInt();
        for(int i = 2 ; i <= n ; i +=2) {
            System.out.println(i);
        }
// --------------------------------------------------
        int g = 0;
        System.out.println("수 입력");
        int n2 = sc.nextInt();
        for(int i2 = 0 ; i2 <= n2 ; i2++) {
            g += i2;

        }
        System.out.println(g);
//---------------------------------------------------
        System.out.println("단어 입력");
        String a = sc.next();
        System.out.println("숫자 입력");
        int n3 = sc.nextInt();

        for(int i3 = 1; i3 <= n3 ; i3++) {
            System.out.println(a + i3);
        }
//-------------------------------------------------------
        System.out.println("구구단 숫자 입력");
        int n4 = sc.nextInt();
        for(int i4 = 1; i4 <= 9 ; i4++) {
            System.out.println(n4 +"*" + i4 + "=" + n4*i4);
        }


    }//메인
}//클레스

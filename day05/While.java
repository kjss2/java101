package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

//        int a = 0;
//        while(a<5){
//            System.out.println("수업 언제끝남?");
//            //1.a++;
        //b++
        // 2.if(b==7){
        //  break
        // }
    //}
        Scanner sc = new Scanner(System.in);
        System.out.println("사칙연산 프로그램 시작");
        int a = 0;
        while (a < 1) {
            System.out.println("정수1 입력 :");
            int num1 = sc.nextInt();
            System.out.println("정수1 입력 :");
            int num2 = sc.nextInt();
            int num4 = num1;
       for(int i = 1;i < num2; i++){
                num4 *= num1;
            }

            System.out.println("사칙연산 선택 \n 0:프로그램 종료 \n1:더하기 \n2:빼기 \n3:곱하기 \n4:제곱 \n5:나누기 \n6:나머지");
            int n = sc.nextInt();

            switch (n) {
                case 0:
                   a = 2;
                   break;
                case 1:
                    System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                    break;
                case 3:
                    System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                    break;
                case 4:
                    System.out.println(num1 + "**" + num2 + "=" + num4);
                    break;
                case 5:
                    System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
                    break;
                case 6:
                    System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
                    break;
                default:
                    System.out.println("잘못입력하셨습니다");
                    break;

            }
        }



    }
}

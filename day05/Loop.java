package day05;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //for문

//        for(int i = 0; i < 5 ; i++){
//            System.out.println("i값 " + i);
//            System.out.println("오늘은 수요일");
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("값 입력");
        int n = sc.nextInt();
        for (int l = 0; l <= n; l++) {
            System.out.println(l);
        }
        System.out.println("값 입력");
        int a = sc.nextInt();
        System.out.println("값 입력");
        int b = sc.nextInt();


        for (int c = a; c <= b; c++) {
                System.out.println(c);
            }


        }
    }
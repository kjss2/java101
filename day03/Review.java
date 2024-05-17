package day03;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 나이는?");
        int age  = sc.nextInt();
        System.out.println(2025 - age +"년생이군요");


        System.out.println("반지름 입력");
        double r = sc.nextDouble();
        System.out.println(3.14*r*r);


    }
}

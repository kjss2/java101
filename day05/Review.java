package day05;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키 입력(m)");
        double h = sc.nextDouble();
        System.out.println("몸무게 입력(kg)");
        double kg = sc.nextDouble();
        double BMI = kg / (h*h);
        if(BMI < 18.5) {
            System.out.println("저체중입니다");
        }
        else if(BMI < 25){
            System.out.println("정상 체중입니다");
        } else if (BMI < 30) {
            System.out.println("과체중입니다");
        }
        else {
            System.out.println("비만입니다");
        }
        System.out.println("커피선택 \n 1.아메리카노 \n 2. 카페라떼 \n 3. 카푸치노");
        int  n = sc.nextInt();
        double a = 0;

        switch (n) {
            case 1:
                a = 4000;
                break;
            case 2:
                a = 4500;
                break;
            case 3:
                a = 5000;
                break;
            default:
                System.out.println("잘못 입력하셨습니다");

        }
        System.out.println("멤버십 카드가 있나요?(1:예,2:아니요)");
        int b = sc.nextInt();

        switch (b) {
            case 1:
                a *= 0.9;
                break;
            default:
                System.out.println("잘못 입력하셨습니다");
        }
        System.out.println("커피값 " + a);





    }


}

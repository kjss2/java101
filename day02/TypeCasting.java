package day02;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        String c = "30";
        String d = "50";

        System.out.println(a+c); // 타입이 다르면 +,- 안됨 / 암묵적 타입 변환
        System.out.println(c+d);
    }
}

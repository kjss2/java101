package day03;

import javax.swing.*;
import java.util.Scanner;

public class StringADV {
    public static void main(String[] args) {
      //  String icecream = "choocolate";

        //  icecream.length() : 몇 글자인지 알려줌
        //  icecream.charAt(3) : 3번쨰의 알파벳을 돌려줌
        //  icecream.substring(0,2) : 0~2 까지 짤라서 돌려줌
        //  icecream.contains("co") : co를 포함하는지 true/ false 로 알려줌
        //  icecream.indexOf("f") : f는 몇번째에 있는지 돌려줌 없으면 -1 돌려줌
        //  icecream.equals("choco") "choco"랑 똑같은지 물어봄 true/false 로 돌려줌
        //  icecream.equalsIgnoreCase("CHOCOLATE") : 대소문자 상관없이 물어봄 true/false
        //  icecream.toUpperCase() : 대문자화 시켜줌
        //  icecream.toLowerCase() : 소문자화 시켜줌
        //  icecream.replace("a","b") " "a"를 "b"로 바꿔줌
        //  icecream.replaceAll("a","b") : "a"를 "b"로 모두 바꿔줌
        //  icecream.startsWith("choco") " :"choco" 로 시작하는 지 true/false
//
//
//        System.out.println("비밀번호를 입력하세요");
//
//        Scanner sc = new Scanner(System.in);
//        String a  = sc.next();
//        String n = a.length() >= 8 && a.contains("!") ? "올바르게 설정하셨습니다" : "다시 설정해주세요";
//        System.out.println(n);
        System.out.println("이메일을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String e = sc.next();
        boolean a1 = e.contains("@");
        boolean a2 = e.contains("naver");
        boolean a3 = e.contains("gamil");
        String b = a1 && a2 || a1 && a3 ? "올바르게 설정하셨습니다" : "다시 설정해주세여";
        System.out.println(b);

        System.out.println("과일 이름을 입력해주세요");
        String c = sc.next();
        int d = c.length();
        String f = d <= 6 ? c.toUpperCase() : c.substring(0,3);
        System.out.println(f);
    }
}

package day05;

public class DoubleLoop {
    public static void main(String[] args) {
        for(int i = 2; i<=9; i++){
            for (int n = 1; n <=9; n++){
                System.out.println(i + "*" + n + "=" + i*n);
            }
        }
    }
}

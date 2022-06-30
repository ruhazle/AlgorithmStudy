package B11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        int answer = 0;
        char[] arr = number.toCharArray();
        for(char c : arr){
            answer += c - '0';
        }
        System.out.println(answer);
    }
}

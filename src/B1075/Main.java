package B1075;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        n = n - (n % 100);
        for(int i = 0; i < 99; i++) {
            if(n % f == 0) break;
            else n++;
        }
        System.out.printf("%02d",n % 100);
    }
}

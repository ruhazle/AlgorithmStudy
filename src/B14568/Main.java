package B14568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        for(int a = 0; a < 100; a++){
            for(int b = 0; b < 100; b++){
                for(int c = 0; c < 100; c++){
                    if(a > 0 && b > 0 && c > 0)
                        if(a % 2 == 0 && b + 2 <= c && a+b+c == n)
                            count++;

                }
            }
        }

        System.out.println(count);
    }
}

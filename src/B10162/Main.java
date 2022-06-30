package B10162;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        while(n > 0){
            if(n >= 300) {
                n = n - 300;
                a++;
            } else if(n >= 60) {
                n = n-60;
                b++;
            } else {
                n = n-10;
                c++;
            }
        }

        if (n < 0) System.out.println(-1);
        else System.out.print(a + " " + b + " " + c);

    }
}

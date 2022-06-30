package B2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String[] time = s.split(" ");
        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        h = h + (n / 60);
        m = m + (n % 60);
        if(m > 59) {
            m = m - 60;
            h++;
        }
        if(h > 23) h = h-24;
        System.out.print(h + " " + m);
    }
}

package B25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;
        String temp = sc.nextLine();
        for(int i = 0; i < N; i++){
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            total += a * b;

        }
        if(total == X) System.out.println("Yes");
        else System.out.println("No");
    }
}

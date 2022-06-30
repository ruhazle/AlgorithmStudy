package B10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        char alpha = 'a';
        for(int i = 0; i < 26; i++) {
            arr[i] = s.indexOf(alpha);
            alpha++;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

package P42840;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == a[i % 5]) count[0]++;
            if(answers[i] == b[i % 8]) count[1]++;
            if(answers[i] == c[i % 10]) count[2]++;
        }

        int max = 0;
        for(int i = 0; i < 3; i++){
            if(count[i] > max) max = count[i];
        }
        for(int i = 0; i < 3; i++){
            if(count[i] == max) list.add(i+1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main m = new Main();
        int[] answers = {1, 3, 2, 4, 2};
        for(int x : m.solution(answers)) {
            System.out.print(x + " ");
        }
    }
}

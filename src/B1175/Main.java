package B1175;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (map.containsKey(c)) map.replace(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        List<Map.Entry<Character, Integer>> entry = new ArrayList<>(map.entrySet());
        Collections.sort(entry, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        if (entry.size() > 1 && entry.get(0).getValue().equals(entry.get(1).getValue())) System.out.println("?");
        else System.out.println(entry.get(0).getKey());
    }
}
package hash.disguise;

import java.util.HashMap;

public class Answer {
    public static void main(String[] args) {
        String[][] clothes1 = {
            {"yellowhat", "headgear"},
            {"bluesunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };
        String[][] clothes2 = {
            {"crowmask", "face"},
            {"bluesunglasses", "face"},
            {"smoky_makeup", "face"}
        };
        int result = solution(clothes2);
        System.out.println("result ---> " + result);
        System.exit(0);
    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        int answer = 1;

        for (String[] clothe : clothes) map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        for (int value : map.values()) answer *= (value+1);

        return answer-1;
    }
}

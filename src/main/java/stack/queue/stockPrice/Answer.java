package stack.queue.stockPrice;

import java.util.Arrays;

public class Answer {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        int[] result = solution(prices);
        System.out.println(Arrays.toString(result));
        System.exit(0);
    }

    public static int[] solution(int[] prices) {
        int[] answer = {1, 2};
        return answer;
    }
}

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
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                ans[i]++;
                if (prices[i] > prices[j])
                    break;

            }
        }

        return ans;
    }
}

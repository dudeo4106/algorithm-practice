package sort.kthNumber;

import java.util.Arrays;

public class Answer {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3},
        };
        int[] result = solution(array, commands);
        System.out.println("result ---> " + Arrays.toString(result));
        System.exit(0);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {

            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];

            int[] tmp = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(tmp);

            answer[i] = tmp[target-1];
        }

        return answer;
    }
}

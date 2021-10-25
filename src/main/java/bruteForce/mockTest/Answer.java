package bruteForce.mockTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 2, 4, 2};

        int[] res = solution(array2);

        System.out.println("result ---> " + Arrays.toString(res));
        System.exit(0);
    }

    public static int[] solution(int[] answers) {
        int[] studentA = {1, 2, 3, 4, 5};
        int[] studentB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] studentC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == studentA[i % studentA.length]) score[0]++;
            if(answers[i] == studentB[i % studentB.length]) score[1]++;
            if(answers[i] == studentC[i % studentC.length]) score[2]++;
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> resultList = new ArrayList<>();
        if(maxScore == score[0]) resultList.add(1);
        if(maxScore == score[1]) resultList.add(2);
        if(maxScore == score[2]) resultList.add(3);

        return resultList.stream().mapToInt(i-> i).toArray();
    }
}
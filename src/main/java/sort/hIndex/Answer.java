package sort.hIndex;

import java.util.Arrays;
import java.util.Collections;

public class Answer {
    public static void main(String[] args) {
        int[] array = {9, 9, 9, 12};

        int result = solution(array);
        System.out.println("result ---> " + result);
        System.exit(0);
    }

    public static int solution(int[] citations) {
        int answer = citations.length;
        Integer[] integerCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(integerCitations, Collections.reverseOrder());
        for(int i = 0; i < integerCitations.length; i++) {
            if (integerCitations[i] <= i+1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
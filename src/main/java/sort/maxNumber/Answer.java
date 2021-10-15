package sort.maxNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Answer {
    public static void main(String[] args) {
        int[] array1 = {6, 10, 2};
        int[] array2 = {3, 30, 34, 5, 9};
        int[] array3 = {3, 330, 445, 3};
        int[] array4 = {1, 10, 100, 11, 111};

        String result = solution(array3);
        System.out.println("result ---> " + result);
        System.exit(0);
    }

    public static String solution(int[] numbers) {
        String[] numbersToStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersToStrings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numbersToStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return ((b + a).compareTo(a + b));
            }
        });

        if(numbersToStrings[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        for (String str : numbersToStrings) answer.append(str);

        return answer.toString();
    }
}

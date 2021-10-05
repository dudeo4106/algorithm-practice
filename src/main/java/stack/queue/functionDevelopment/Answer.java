package stack.queue.functionDevelopment;

import java.util.Arrays;

public class Answer {
    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        int[] result = solution(progresses1, speeds1);
        System.out.println(Arrays.toString(result));
        System.exit(0);
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfEnd = new int[100];
        int day = 1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfEnd[day]++;
        }
        return Arrays.stream(dayOfEnd).filter(i -> i!=0).toArray();
    }
}

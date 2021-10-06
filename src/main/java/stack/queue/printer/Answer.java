package stack.queue.printer;

import java.util.LinkedList;
import java.util.Queue;

public class Answer {
    static class Task {
        int index;
        int priority;
        public Task(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2;

        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;

        int result = solution(priorities2, location2);
        System.out.println("result ----> " + result);
        System.exit(0);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Task> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) queue.add(new Task(i, priorities[i])); // init queue

        while(!queue.isEmpty()) {
            Task cur = queue.poll();
            boolean flag = false;

            for(Task task : queue){
                if (task.priority > cur.priority) {
                    flag = true;
                    break;
                }
            }

            if(flag) {
                queue.add(cur);
            } else {
                answer++;
                if(cur.index == location) return answer;
            }
        }
        return -1;
    }
}

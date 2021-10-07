package stack.queue.truck;

import java.util.LinkedList;
import java.util.Queue;

public class Answer {
    static class Truck {
        int weight;
        int crossing;
        public Truck(int weight, int crossing) {
            this.weight = weight;
            this.crossing = crossing;
        }
    }

    public static void main(String[] args) {
        int bridge_length1 = 2;
        int weight1 = 10;
        int[] truck_weights1 = {7,4,5,6};

        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};

        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};

        int result = solution(bridge_length2, weight2, truck_weights2);
        System.out.println("result ----> " + result);
        System.exit(0);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Truck> queue = new LinkedList<>();
        for(int truck_weight : truck_weights) queue.add(new Truck(truck_weight, bridge_length)); // init queue

        /*
        while(!queue.isEmpty()) {

        }
         */

        answer++;
        return answer;
    }
}

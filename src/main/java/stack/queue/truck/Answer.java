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

        int result = solution(bridge_length1, weight1, truck_weights1);
        System.out.println("result ----> " + result);
        System.exit(0);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> totalQ = new LinkedList<>();
        Queue<Truck> bridgeQ = new LinkedList<>();
        for(int truck_weight : truck_weights) totalQ.offer(new Truck(truck_weight, 1)); // init totalQ

        int answer = 0;
        int curWeight = 0;

        while (!totalQ.isEmpty() || !bridgeQ.isEmpty()) {
            answer++;

            if (bridgeQ.isEmpty()) {
                Truck t = totalQ.poll();
                curWeight += t.weight;
                bridgeQ.offer(t);
                continue;
            }

            for (Truck t : bridgeQ) {
                t.crossing += 1;
            }

            if (bridgeQ.peek().crossing > bridge_length) {
                Truck t = bridgeQ.poll();
                curWeight -= t.weight;
            }

            if (!totalQ.isEmpty() && curWeight + totalQ.peek().weight <= weight) {
                Truck t = totalQ.poll();
                curWeight += t.weight;
                bridgeQ.offer(t);
            }
        }

        return answer;
    }
}

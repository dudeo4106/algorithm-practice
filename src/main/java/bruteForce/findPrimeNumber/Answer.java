package bruteForce.findPrimeNumber;

import java.util.HashSet;

public class Answer {
    public static void main(String[] args) {
        String numbers = "333";

        int res = solution(numbers);

        System.out.println("result ---> " + res);
        System.exit(0);
    }

    public static int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();

        permutation("", numbers, set);

        int answer = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) answer++;
            if(a%2!=0 && isPrime(a)) answer++;
        }
        return answer;
    }

    public static void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if(!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }

        for(int i=0; i<n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }
    }

    public static boolean isPrime(int num){
        if(num <= 1) {
            return false;
        }
        if(num == 2 || num == 3) {
            return true;
        }

        int end = (int) Math.sqrt(num);
        for(int i = 2; i <= end; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
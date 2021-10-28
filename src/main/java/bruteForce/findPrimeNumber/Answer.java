package bruteForce.findPrimeNumber;

import java.util.HashSet;

public class Answer {
    public static void main(String[] args) {
        String numbers = "011";

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

    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2; i<=(int)Math.sqrt(n); i+=i){
            if(n%i == 0) return false;
        }
        return true;
    }
}
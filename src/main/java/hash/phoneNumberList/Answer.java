package hash.phoneNumberList;

import java.util.HashMap;

public class Answer {
    public static void main(String[] args) {
        String[] phoneBook1 = {"119", "97674223", "1195524421"};
        String[] phoneBook2 = {"123","456","789"};
        String[] phoneBook3 = {"12","123","1235","567","88"};
        String[] phoneBook4 = {"12","345","1"};
        boolean result = solution(phoneBook1);
        System.out.println("result ----> " + result);
        System.exit(0);
    }

    public static boolean solution(String[] phoneBook) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String phone : phoneBook) map.put(phone, 1);
        for (String phone : phoneBook) {
            for (int j = 1; j < phone.length(); j++) {
                if (map.containsKey(phone.substring(0, j))) return false;
            }
        }
        return true;
    }
}

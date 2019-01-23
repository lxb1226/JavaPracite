package JavaforPAT.乙级;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question1002 {
    public static void main(String[] args) {
        String s, num;
        int sum = 0;
        Map<String, String> map = new HashMap<>();
        map.put("0", "ling");
        map.put("1", "yi");
        map.put("2", "er");
        map.put("3", "san");
        map.put("4", "si");
        map.put("5", "wu");
        map.put("6", "liu");
        map.put("7", "qi");
        map.put("8", "ba");
        map.put("9", "jiu");
        Scanner input = new Scanner(System.in);
        s = input.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += Integer.parseInt(String.valueOf(c));
        }
//        System.out.println(sum);
        num = Integer.toString(sum);
        for (int i = 0; i < num.length() - 1; i++) {
            char c = num.charAt(i);
            String m = map.get(String.valueOf(c));
            System.out.print(m + " ");
        }
        char c = num.charAt(num.length() - 1);
        String m = map.get(String.valueOf(c));
        System.out.print(m);

    }
}

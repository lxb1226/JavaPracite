package JavaforPAT.乙级;

import java.util.Scanner;

public class question1001 {
    public static void main(String[] args) {
        int n;
        int step = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n + 1) / 2;
            }
            step ++;
        }
        System.out.println(step);
    }
}

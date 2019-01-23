package Java开发实战经典.chapter12;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.println("输入数据：");
        String str = scan.next();
        System.out.println("输入的数据为：" + str);
    }
}
